package br.com.zup.TaDentro.colaborador.exceptionColaborador;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErroBadRequestColaborador {

    private int StatusCode;
    private String mensagem;
    private String titulo;

}
