package br.com.zup.TaDentro.Usuario.exceptionUsuario;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErroBadRequestUsuario{

    private int StatusCode;
    private String mensagem;
    private String titulo;


}
