package br.com.zup.TaDentro.indicacao.exceptionIndicacao;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErroBadRequestIndicacao {

    private int StatusCode;
    private String mensagem;
    private String titulo;

}
