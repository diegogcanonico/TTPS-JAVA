package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ttps.ttpsjava.enums.RedSocialEmpresaEnum;
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
public class RedSocial {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(name = "empresa")
	private RedSocialEmpresaEnum empresa;
	@Column(unique = true, name = "dominio")
    private String dominio;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emprendimiento_id")
	@JsonIgnore
    private Emprendimiento emprendimiento;

}
