/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Grupo;
import Modelo.Materia;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Crea_Matri extends javax.swing.JFrame {
Connection conex;
    /**
     * Creates new form Crea_Matri
     */
    public Crea_Matri() {
        try {
            initComponents();
            setIconImage(getIconImage());
            this.setLocationRelativeTo(null);
            this.setTitle("CREACIÓN DE GRUPOS");
            transparente();
            Class.forName("com.mysql.jdbc.Driver");
            cargargrupo(idgrupo);
            cargarmateria(idmateria);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return  retValue;
    }
    
    public void transparente(){
        Cerrar.setOpaque(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setBorderPainted(false);
        Minimizar.setOpaque(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setBorderPainted(false);
        Imagen.setOpaque(false);
        Imagen.setContentAreaFilled(false);
        Imagen.setBorderPainted(false);
        Crear.setOpaque(false);
        Crear.setContentAreaFilled(false);
        Crear.setBorderPainted(false);
        Visualizar.setOpaque(false);
        Visualizar.setContentAreaFilled(false);
        Visualizar.setBorderPainted(false);
        Eliminar.setOpaque(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setBorderPainted(false);
        Borrar.setOpaque(false);
        Borrar.setContentAreaFilled(false);
        Borrar.setBorderPainted(false);
        Actualizar.setOpaque(false);
        Actualizar.setContentAreaFilled(false);
        Actualizar.setBorderPainted(false);
        Buscar.setOpaque(false);
        Buscar.setContentAreaFilled(false);
        Buscar.setBorderPainted(false);
    
    }
    
    public void cargargrupo(JComboBox grupo) {

        try {

            conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study", "root", "");

            String sql = "SELECT id_grupo, nombre FROM grupos";
            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultComboBoxModel model = new DefaultComboBoxModel();

            while (rs.next()) {
                
                model.addElement(new Grupo(rs.getInt("id_grupo"),rs.getString("nombre")));

            }
            grupo.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }

    }
    
    public void cargarmateria(JComboBox materia) {

        try {

            conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study", "root", "");

            String sql = "SELECT id_materia, nombre FROM materia";
            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultComboBoxModel model = new DefaultComboBoxModel();

            while (rs.next()) {
                
            model.addElement(new Materia (rs.getInt("ID_Materia"),rs.getString("Nombre")));

            }
            materia.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Imagen = new javax.swing.JButton();
        Salir = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Materias = new javax.swing.JLabel();
        Clase = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Matriculas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        idmateria = new javax.swing.JComboBox<>();
        idgrupo = new javax.swing.JComboBox<>();
        Visualizar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        codigomatri = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Link = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(168, 201, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.png"))); // NOI18N
        Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenActionPerformed(evt);
            }
        });
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Salir.setText("Cerrar sesión");
        Salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SalirMouseMoved(evt);
            }
        });
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        Inicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        Inicio.setText("Inicio");
        Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InicioMouseMoved(evt);
            }
        });
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, -1));

        Materias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Materias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/educacion.png"))); // NOI18N
        Materias.setText("Crear grupos");
        Materias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MateriasMouseMoved(evt);
            }
        });
        Materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MateriasMouseExited(evt);
            }
        });
        jPanel1.add(Materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 40));

        Clase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/presentacion.png"))); // NOI18N
        Clase.setText("Crear matriculas");
        Clase.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ClaseMouseMoved(evt);
            }
        });
        Clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClaseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClaseMouseExited(evt);
            }
        });
        jPanel1.add(Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 514));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 40));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(143, 170, 220));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Perfil como coordinador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(234, 234, 234))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 850, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Si deseas hacer una matricula, añade los siguientes datos");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Link de la clase:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        Tabla_Matriculas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Tabla_Matriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código ", "Materia", "Grupo", "Link de clase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Matriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_MatriculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Matriculas);
        if (Tabla_Matriculas.getColumnModel().getColumnCount() > 0) {
            Tabla_Matriculas.getColumnModel().getColumn(0).setMinWidth(70);
            Tabla_Matriculas.getColumnModel().getColumn(0).setPreferredWidth(70);
            Tabla_Matriculas.getColumnModel().getColumn(0).setMaxWidth(70);
            Tabla_Matriculas.getColumnModel().getColumn(2).setMinWidth(70);
            Tabla_Matriculas.getColumnModel().getColumn(2).setPreferredWidth(70);
            Tabla_Matriculas.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 420, 260));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Matriculas creadas");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Buscar:");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 200, 30));

        Crear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear.png"))); // NOI18N
        Crear.setText("Crear Matricula");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel2.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        Eliminar.setText("Eliminar ");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Código:");
        jLabel15.setToolTipText("");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        Actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        idmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmateriaActionPerformed(evt);
            }
        });
        jPanel2.add(idmateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, 30));

        idgrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idgrupoActionPerformed(evt);
            }
        });
        jPanel2.add(idgrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, 30));

        Visualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        Visualizar.setText("Visualizar");
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        Borrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        Borrar.setText("Limpiar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel2.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Nombre del grupo:");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        codigomatri.setEditable(false);
        codigomatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigomatriActionPerformed(evt);
            }
        });
        jPanel2.add(codigomatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Nombre de la materia:");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel2.add(Link, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 41, -1, 473));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed

    }//GEN-LAST:event_ImagenActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setState (Pag_Principal.ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        
        Grupo grupoSeleccionao = (Grupo) idgrupo.getSelectedItem();
        Materia materiaSeleccionada = (Materia) idmateria.getSelectedItem();
        
        try{
         conex=DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
         Statement st=conex.createStatement();
         st.executeUpdate("INSERT INTO matricula (ID_M,ID_G,Link) VALUES ('"+materiaSeleccionada.getIdMateria()+"','"+grupoSeleccionao.getIdGrupo()+"','"+Link.getText()+"')");
         JOptionPane.showMessageDialog(null, "Hecho");
        }catch(SQLException ex){
         Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex); 
         JOptionPane.showMessageDialog(null, "No es posible la conexión");
        }
        
    }//GEN-LAST:event_CrearActionPerformed

    private void SalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseMoved
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_SalirMouseMoved

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        this.setVisible(false);
        Final v= new Final();
        v.setVisible(true);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_SalirMouseExited

    private void InicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseMoved
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_InicioMouseMoved

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        this.setVisible(false);
        Pag_PrinA v= new Pag_PrinA();
        v.setVisible(true);
    }//GEN-LAST:event_InicioMouseClicked

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_InicioMouseExited

    private void MateriasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseMoved
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_MateriasMouseMoved

    private void MateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseClicked
        this.setVisible(false);
        Crea_grupos v= new Crea_grupos();
        v.setVisible(true);
    }//GEN-LAST:event_MateriasMouseClicked

    private void MateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseExited
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_MateriasMouseExited

    private void ClaseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseMoved
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_ClaseMouseMoved

    private void ClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseClicked
        this.setVisible(false);
        Crea_Matri v = new Crea_Matri();
        v.setVisible(true);
    }//GEN-LAST:event_ClaseMouseClicked

    private void ClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseExited
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_ClaseMouseExited

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed

        try{
            DefaultTableModel modelo=(DefaultTableModel)Tabla_Matriculas.getModel();
            int filas = modelo.getRowCount();
            for (int i = 0; i<filas; i++){
             modelo.removeRow(0);
            };
            conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
            Statement st=conex.createStatement();

            String sqll = "SELECT ID_Matricula, materia.Nombre, grupos.Nombre, Link FROM matricula INNER JOIN materia ON matricula.ID_M = materia.ID_Materia INNER JOIN grupos ON matricula.ID_G = grupos.ID_Grupo";
            ResultSet rs = st.executeQuery(sqll);
            rs.first();
            do{
                String [] fila={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                modelo.addRow(fila);
            }while (rs.next());

        }catch (SQLException ex){
            Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex);

        }
    }//GEN-LAST:event_VisualizarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        if (codigomatri.getText().equals("")&& buscar.getText().equals("")){
           JOptionPane.showMessageDialog(null, "No hay campos para borrar");
       }else{
        codigomatri.setText("");
        Link.setText("");
        buscar.setText("");
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void codigomatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigomatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigomatriActionPerformed

    private void Tabla_MatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_MatriculasMouseClicked
        int fila=this.Tabla_Matriculas.getSelectedRow();
        
        this.codigomatri.setText(this.Tabla_Matriculas.getValueAt(fila, 0).toString());
        this.Link.setText(this.Tabla_Matriculas.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_Tabla_MatriculasMouseClicked

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       if (codigomatri.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Selecciona un matricula para actualizar");
       }else{
        Grupo grupoSeleccionao = (Grupo) idgrupo.getSelectedItem();
        Materia materiaSeleccionada = (Materia) idmateria.getSelectedItem();
        
        Statement st = null;
        
        try{
           conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
           st=conex.createStatement();
           
           int datos =st.executeUpdate("UPDATE matricula SET ID_M ='"+materiaSeleccionada.getIdMateria()+"',ID_G = '"+grupoSeleccionao.getIdGrupo()+"', Link = '"+Link.getText()+"' WHERE ID_Matricula = '"+codigomatri.getText()+"'");
           JOptionPane.showMessageDialog(null,"Datos actualizados");
           st.close();
           conex.close();
        }catch (SQLException ex){
            Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex);
        }
       }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (!buscar.getText().equals("")){
        try{
            DefaultTableModel modelo=(DefaultTableModel)Tabla_Matriculas.getModel();
            int filas = modelo.getRowCount();
            for (int i = 0; i<filas; i++){
             modelo.removeRow(0);
            };
           conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
           Statement st=conex.createStatement();
           
           String sqll = "SELECT ID_Matricula, materia.Nombre, grupos.Nombre FROM matricula INNER JOIN materia ON matricula.ID_M = materia.ID_Materia INNER JOIN grupos ON matricula.ID_G = grupos.ID_Grupo WHERE ID_Matricula='"+buscar.getText()+"'OR materia.Nombre='"+buscar.getText()+"'OR grupos.Nombre='"+buscar.getText()+"'";
           ResultSet rs = st.executeQuery(sqll);
           rs.first();
           if(rs.first()== false){
               JOptionPane.showMessageDialog(null,"Materia o código no existente","ERROR",JOptionPane.ERROR_MESSAGE);
           }
           do{
               String [] fila={rs.getString(1),rs.getString(2),rs.getString(3)};
               modelo.addRow(fila);
           }while (rs.next());
           
        }catch (SQLException ex){
            Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        }else{
            JOptionPane.showMessageDialog(null,"Ingresa código o nombre de la materia");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (codigomatri.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Selecciona un matricula para eliminar");
       }else{
        Statement st = null;
        try{
           conex = DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
           st=conex.createStatement();
           
           int datos =st.executeUpdate("DELETE FROM matricula WHERE ID_Matricula = '"+codigomatri.getText()+"'");
           JOptionPane.showMessageDialog(null,"Datos borrados");
           st.close();
           conex.close();
        }catch (SQLException ex){
            Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex);
        }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void idmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idmateriaActionPerformed

    private void idgrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idgrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idgrupoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crea_Matri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crea_Matri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crea_Matri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crea_Matri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crea_Matri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Clase;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Imagen;
    private javax.swing.JLabel Inicio;
    private javax.swing.JTextField Link;
    private javax.swing.JLabel Materias;
    private javax.swing.JButton Minimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JTable Tabla_Matriculas;
    private javax.swing.JButton Visualizar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField codigomatri;
    private javax.swing.JComboBox<String> idgrupo;
    private javax.swing.JComboBox<String> idmateria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
