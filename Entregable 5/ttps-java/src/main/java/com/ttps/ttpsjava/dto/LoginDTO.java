package com.ttps.ttpsjava.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginDTO {

    @NotBlank
    @NotNull
    private String password;
    @NotBlank
    @NotNull
    private String username;

}
