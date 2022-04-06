package br.com.zup.TaDentro.Usuario.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
@Data
public class UsuarioDto {

    private String email;
    private String nome;

}
