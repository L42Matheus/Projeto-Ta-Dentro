package br.com.zup.TaDentro.jwt.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioLoginDto {

    private String email;
    private String senha;

}
