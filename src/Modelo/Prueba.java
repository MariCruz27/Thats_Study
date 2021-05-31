package Modelo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @see https://www.jc-mouse.net
 * @author mouse
 */
public class Prueba {

    public static void main(String[] args)  {
        
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = conectar("jdbc:mysql://localhost/thats_study", "root", "");
        if (connection != null) {
           leerUltimoArchivoRegistrado(connection);
           cerrarConexion(connection);
        }
}catch(ClassNotFoundException ex){
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection conectar(String url, String user, String pass)  {
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("> Conectado a la base de datos");
            return connection;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static void cerrarConexion(Connection conn) {
        try {
            conn.close();
            System.out.println("> Desconectado de la base de datos");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static boolean registrarArchivoPDF(Connection conn, String file) {
        FileInputStream input = null;
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO reportes(archivo) VALUES(?);";
            stmt = conn.prepareStatement(sql);
            input = new FileInputStream(new File(file));
            stmt.setBinaryStream(1, input);
            stmt.executeUpdate();
            System.out.println("> Archivo '" + file + "' registrado en la base de datos");
            return true;
        } catch (FileNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (IOException | SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
    
    public static void leerUltimoArchivoRegistrado(Connection conn) {
        Statement stmt = null;
        InputStream input = null;
        FileOutputStream output = null;
        try {
            String sql = "SELECT Documento FROM entrega WHERE ID_Entrega = '6' ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            File file = new File("reporte_db.pdf");
            output = new FileOutputStream(file);

            if (rs.next()) {
                input = rs.getBinaryStream("Documento");
                System.out.println("Leyendo archivo desde la base de datos...");
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    output.write(buffer);
                }
                System.out.println("> Archivo guardado en : " + file.getAbsolutePath());
            }
        } catch (SQLException | IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (IOException | SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

}
