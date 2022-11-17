package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rol {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rol_id")
	private int id;
	@Column(name = "nombre_rol", unique = true)
	private String nombreRol;
	//@OneToMany(mappedBy = "rol", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	//private List<Usuario> usuario;

}
