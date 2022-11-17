package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "emprendimiento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emprendimiento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emprendimiento_id")
	private Long id;
	@Column(unique = true, name = "nombre")
	private String nombre;
	@Column(unique = true, name = "dominio")
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
    @JsonIgnore
    private Set<Donacion> donaciones;
    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Posteo> posteos;
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Override
    public String toString() {
        return "Emprendimiento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dominio='" + dominio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", banner='" + banner + '\'' +
                ", categoria=" + categoria +
                ", vistaDonadores=" + vistaDonadores +
                ", vistaManguitosRecibidos=" + vistaManguitosRecibidos +
                ", redSocial=" + redSocial +
                ", precioActualPorManguito=" + precioActualPorManguito +
                ", planes=" + planes +
                ", donaciones=" + donaciones +
                ", posteos=" + posteos +
                '}';
    }
}
