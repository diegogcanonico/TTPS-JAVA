package modelo;

import java.time.LocalDate;

public class Donacion {

    private Integer cantidadManguitos;
    private LocalDate fecha;
    private String nombreDonador;
    private String mensaje;
    private Plan plan;

    public Donacion(Integer cantidadManguitos, LocalDate fecha, String nombreDonador, String mensaje, Plan plan) {
        this.cantidadManguitos = cantidadManguitos;
        this.fecha = fecha;
        this.nombreDonador = nombreDonador;
        this.mensaje = mensaje;
        this.plan = plan;
    }

    public Integer getCantidadManguitos() {
        return cantidadManguitos;
    }

    public void setCantidadManguitos(Integer cantidadManguitos) {
        this.cantidadManguitos = cantidadManguitos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreDonador() {
        return nombreDonador;
    }

    public void setNombreDonador(String nombreDonador) {
        this.nombreDonador = nombreDonador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "cantidadManguitos=" + cantidadManguitos +
                ", fecha=" + fecha +
                ", nombreDonador='" + nombreDonador + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", plan=" + plan +
                '}';
    }

}
