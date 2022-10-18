package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Posteo {
	
	
	
	public Posteo() {
		super();
	}

	@Id @GeneratedValue
	private Long id;
	@Column(name = "nombre_posteo")
	private String nombrePosteo;
	@Column(name = "texto")
    private String texto;
	@Column(name = "imagen")
    private String imagen;
    @ManyToOne
    private Emprendimiento emprendimiento;

    public Posteo(String nombrePosteo, String texto, String imagen, Emprendimiento emprendimiento) {
        this.nombrePosteo = nombrePosteo;
        this.texto = texto;
        this.imagen = imagen;
        this.emprendimiento = emprendimiento;
    }
    
    public Long getId() {
		return id;
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
    
    

    public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	@Override
	public String toString() {
		return "Posteo [nombrePosteo=" + nombrePosteo + ", texto=" + texto + ", imagen=" + imagen + ", emprendimiento="
				+ emprendimiento + "]";
	}


}
