package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Plan {
	
	
	
	public Plan() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "valor")
	private Double valor;
	@Column(name = "cuotas")
    private Integer cuotas;
	@Column(name = "beneficio")
    private String beneficio;
    @ManyToOne
    private Emprendimiento emprendimiento;

    public Plan(Double valor, Integer cuotas, String beneficio, Emprendimiento emprendimiento) {
        this.valor = valor;
        this.cuotas = cuotas;
        this.beneficio = beneficio;
        this.emprendimiento = emprendimiento;
    }
    
    public Long getId() {
		return id;
	}

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
    
    

    public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	@Override
	public String toString() {
		return "Plan [valor=" + valor + ", cuotas=" + cuotas + ", beneficio=" + beneficio + ", emprendimiento="
				+ emprendimiento + "]";
	}


}
