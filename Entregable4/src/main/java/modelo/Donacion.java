package modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Donacion {
	
	
	
	public Donacion() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "cantidad_manguitos")
	private Integer cantidadManguitos;
	@Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "nombre_donador")
    private String nombreDonador;
    @Column(name = "mensaje")
    private String mensaje;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Column(name = "plan")
    private List<Plan> plan;
    @Column(name = "precio_historico_por_manguito")
    private Double precioHistoricoPorManguito;
    @ManyToOne(optional = false)
    private Emprendimiento emprendimiento;

    public Donacion(Integer cantidadManguitos, LocalDate fecha, String nombreDonador, String mensaje, List<Plan> plan, Double precioHistoricoPorManguito) {
        this.cantidadManguitos = cantidadManguitos;
        this.fecha = fecha;
        this.nombreDonador = nombreDonador;
        this.mensaje = mensaje;
        this.plan = plan;
        this.precioHistoricoPorManguito = precioHistoricoPorManguito;
    }

    public Long getId() {
		return id;
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

    public List<Plan> getPlan() {
        return plan;
    }

    public void setPlan(List<Plan> plan) {
        this.plan = plan;
    }

    public Double getPrecioHistoricoPorManguito() {
        return precioHistoricoPorManguito;
    }

    public void setPrecioHistoricoPorManguito(Double precioHistoricoPorManguito) {
        this.precioHistoricoPorManguito = precioHistoricoPorManguito;
    }
    
    

    public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	@Override
	public String toString() {
		return "Donacion [cantidadManguitos=" + cantidadManguitos + ", fecha=" + fecha + ", nombreDonador="
				+ nombreDonador + ", mensaje=" + mensaje + ", plan=" + plan + ", precioHistoricoPorManguito="
				+ precioHistoricoPorManguito + ", emprendimiento=" + emprendimiento + "]";
	}

	


}
