package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Categoria {
	
	
	
	public Categoria() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, name="nombre")
	private String nombre;
	@Column(name="descripcion")
    private String descripcion;
	@ManyToOne
	private Emprendimiento emprendimiento;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Long getId() {
		return id;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }


}
