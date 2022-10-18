package modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emprendimiento {
	
	
	
	public Emprendimiento() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, name = "nombre")
	private String nombre;
	@Column(name = "dominio")
    private String dominio;
	@Column(name = "descripcion")
    private String descripcion;
	@Column(name = "banner")
    private String banner;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Column(name = "categorias")
    private Set<Categoria> categoria;
    @Column(name = "vista_donadores")
    private Boolean vistaDonadores;
    @Column(name = "vista_manguitos_recibidos")
    private Boolean vistaManguitosRecibidos;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<RedSocial> redSocial;
    @Column(name = "precio_actual_por_manguito")
    private Double precioActualPorManguito;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Plan> planes;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Donacion> donaciones;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Posteo> posteos;
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
    

    
    
    public Emprendimiento(String nombre, String dominio, String descripcion, String banner, Set<Categoria> categoria,
			Boolean vistaDonadores, Boolean vistaManguitosRecibidos, Set<RedSocial> redSocial,
			Double precioActualPorManguito, Set<Plan> planes, Set<Donacion> donaciones, Set<Posteo> posteos,
			Usuario usuario) {
		super();
		this.nombre = nombre;
		this.dominio = dominio;
		this.descripcion = descripcion;
		this.banner = banner;
		this.categoria = categoria;
		this.vistaDonadores = vistaDonadores;
		this.vistaManguitosRecibidos = vistaManguitosRecibidos;
		this.redSocial = redSocial;
		this.precioActualPorManguito = precioActualPorManguito;
		this.planes = planes;
		this.donaciones = donaciones;
		this.posteos = posteos;
		this.usuario = usuario;
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

    public Set<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(Set<Categoria> categoria) {
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

    public Set<RedSocial> getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(Set<RedSocial> redSocial) {
        this.redSocial = redSocial;
    }

    public Double getPrecioActualPorManguito() {
        return precioActualPorManguito;
    }

    public void setPrecioActualPorManguito(Double precioActualPorManguito) {
        this.precioActualPorManguito = precioActualPorManguito;
    }

    public Set<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(Set<Plan> planes) {
        this.planes = planes;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public Set<Posteo> getPosteos() {
        return posteos;
    }

    public void setPosteos(Set<Posteo> posteos) {
        this.posteos = posteos;
    }
    

    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Emprendimiento [nombre=" + nombre + ", dominio=" + dominio + ", descripcion=" + descripcion
				+ ", banner=" + banner + ", categoria=" + categoria + ", vistaDonadores=" + vistaDonadores
				+ ", vistaManguitosRecibidos=" + vistaManguitosRecibidos + ", redSocial=" + redSocial
				+ ", precioActualPorManguito=" + precioActualPorManguito + ", planes=" + planes + ", donaciones="
				+ donaciones + ", posteos=" + posteos + ", usuario=" + usuario + "]";
	}

	

}
