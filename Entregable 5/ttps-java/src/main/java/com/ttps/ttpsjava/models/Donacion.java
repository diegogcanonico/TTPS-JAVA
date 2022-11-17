package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Donacion {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
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
    private Set<Plan> plan;
    @Column(name = "precio_historico_por_manguito")
    private Double precioHistoricoPorManguito;
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emprendimiento_id")
    private Emprendimiento emprendimiento;

}
