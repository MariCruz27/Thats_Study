package Modelo;

public class PdfVO {

    /*Todo los atributos*/
    int idEntrega;
    String nombre;
    String descripcion;
    byte[] documento;
    String nota;
    String comentario;
    int idAsig;
    int codE;

    public PdfVO() {
    }

    /*Todo los codigos get*/
    public int getidEntrega() {
        return idEntrega;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public byte[] getDocumento() {
        return documento;
    }
    
    public String getNota() {
        return nota;
    }
    
    public String getComentario() {
        return comentario;
    }
    
    public int getidAsig() {
        return idAsig;
    }
    
    public int getCodE() {
        return codE;
    }


    /*Todo los codigos set*/
    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public void setIdAsig(int idAsig) {
        this.idAsig = idAsig;
    }
    
    public void setCodE(int codE) {
        this.codE = codE;
    }

}
