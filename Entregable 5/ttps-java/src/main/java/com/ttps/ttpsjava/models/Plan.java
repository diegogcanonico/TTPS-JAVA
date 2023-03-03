package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Plan {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	@Column(name = "valor")
	private Double valor;
	@Column(name = "cuotas")
    private Integer cuotas;
	@Column(name = "beneficio")
    private String beneficio;
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emprendimiento_id")
	@JsonIgnore
    private Emprendimiento emprendimiento;

}
