package com.ttps.ttpsjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
	private int id;
	@Column(unique = true, name = "username")
	private String username;
	@Column(name = "apellido")
    private String apellido;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "password")
    @Pattern(regexp = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$", message = "Formato de clave inválido. Debe contener entre 8 y 16 dígitos. Al menos debe contener un número, una letra mayúscula, una minúscula, y no puede contener símbolos")
    private String password;
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JsonIgnore
    private Emprendimiento emprendimiento;
    @ManyToOne(optional = true, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }
}
