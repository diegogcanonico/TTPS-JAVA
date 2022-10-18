package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.utils.RedSocialEmpresaEnum;

@Entity
public class RedSocial {
	
	
	
	public RedSocial() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(name = "empresa")
	private RedSocialEmpresaEnum empresa;
	@Column(unique = true, name = "dominio")
    private String dominio;
    @ManyToOne
    private Emprendimiento emprendimiento;

    public RedSocial(RedSocialEmpresaEnum empresa, String dominio, Emprendimiento emprendimiento) {
        this.empresa = empresa;
        this.dominio = dominio;
        this.emprendimiento = emprendimiento;
    }
    
    public Long getId() {
		return id;
	}

    public RedSocialEmpresaEnum getEmpresa() {
        return empresa;
    }

    public void setEmpresa(RedSocialEmpresaEnum empresa) {
        this.empresa = empresa;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    
    

    public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	@Override
	public String toString() {
		return "RedSocial [empresa=" + empresa + ", dominio=" + dominio + ", emprendimiento=" + emprendimiento + "]";
	}


}
