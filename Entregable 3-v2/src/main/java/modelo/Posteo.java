package modelo;

public class Posteo {

    private String nombrePosteo;
    private String texto;
    private String imagen;

    public Posteo(String nombrePosteo, String texto, String imagen) {
        this.nombrePosteo = nombrePosteo;
        this.texto = texto;
        this.imagen = imagen;
    }


    public String getNombrePosteo() {
        return nombrePosteo;
    }

    public void setNombrePosteo(String nombrePosteo) {
        this.nombrePosteo = nombrePosteo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Posteo{" +
                "nombrePosteo='" + nombrePosteo + '\'' +
                ", texto='" + texto + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }

}
