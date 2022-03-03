package br.com.zup.TaDentro.jwt.exeptionAuthentication;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AcessoNegadoException {

    private int statusCode;
    private String mensagem;
    private String titulo;


}
