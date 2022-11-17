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
public class Posteo {

	@Id @GeneratedValue
	@JsonIgnore
	private Long id;
	@Column(name = "nombre_posteo")
	private String nombrePosteo;
	@Column(name = "texto")
    private String texto;
	@Column(name = "imagen")
    private String imagen;
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emprendimiento_id")
    private Emprendimiento emprendimiento;

}
