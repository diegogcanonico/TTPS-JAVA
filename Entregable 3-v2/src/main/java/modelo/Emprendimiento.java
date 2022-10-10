package modelo;

import java.util.List;

public class Emprendimiento {

    private String nombre;
    private String dominio;
    private String descripcion;
    private String banner;
    private Categoria categoria;
    private Boolean vistaDonadores;
    private Boolean vistaManguitosRecibidos;
    private List<RedSocial> redSocial;
    private Double precioPorManguito;
    private List<Plan> planes;
    private List<Donacion> donaciones;
    private List<Posteo> posteos;

    public Emprendimiento(String nombre, String dominio, String descripcion, String banner, Categoria categoria, Boolean vistaDonadores, Boolean vistaManguitosRecibidos, List<RedSocial> redSocial, Double precioPorManguito, List<Plan> planes, List<Donacion> donaciones, List<Posteo> posteos) {
        this.nombre = nombre;
        this.dominio = dominio;
        this.descripcion = descripcion;
        this.banner = banner;
        this.categoria = categoria;
        this.vistaDonadores = vistaDonadores;
        this.vistaManguitosRecibidos = vistaManguitosRecibidos;
        this.redSocial = redSocial;
        this.precioPorManguito = precioPorManguito;
        this.planes = planes;
        this.donaciones = donaciones;
        this.posteos = posteos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Boolean getVistaDonadores() {
        return vistaDonadores;
    }

    public void setVistaDonadores(Boolean vistaDonadores) {
        this.vistaDonadores = vistaDonadores;
    }

    public Boolean getVistaManguitosRecibidos() {
        return vistaManguitosRecibidos;
    }

    public void setVistaManguitosRecibidos(Boolean vistaManguitosRecibidos) {
        this.vistaManguitosRecibidos = vistaManguitosRecibidos;
    }

    public List<RedSocial> getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(List<RedSocial> redSocial) {
        this.redSocial = redSocial;
    }

    public Double getPrecioPorManguito() {
        return precioPorManguito;
    }

    public void setPrecioPorManguito(Double precioPorManguito) {
        this.precioPorManguito = precioPorManguito;
    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plan> planes) {
        this.planes = planes;
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public List<Posteo> getPosteos() {
        return posteos;
    }

    public void setPosteos(List<Posteo> posteos) {
        this.posteos = posteos;
    }

    @Override
    public String toString() {
        return "Emprendimiento{" +
                "nombre='" + nombre + '\'' +
                ", dominio='" + dominio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", banner='" + banner + '\'' +
                ", categoria=" + categoria +
                ", vistaDonadores=" + vistaDonadores +
                ", vistaManguitosRecibidos=" + vistaManguitosRecibidos +
                ", redSocial=" + redSocial +
                ", precioPorManguito=" + precioPorManguito +
                ", planes=" + planes +
                ", donaciones=" + donaciones +
                ", posteos=" + posteos +
                '}';
    }

}
