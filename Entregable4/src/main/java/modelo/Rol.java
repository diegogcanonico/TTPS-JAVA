package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Rol {
	
	
	
	public Rol() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_rol", unique = true)
	private String nombreRol;
	@OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
	private List<Usuario> usuario;

    
    
    public Rol(String nombreRol, List<Usuario> usuario) {
		super();
		this.nombreRol = nombreRol;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    

    public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Rol [nombreRol=" + nombreRol + ", usuario=" + usuario + "]";
	}

	

}
