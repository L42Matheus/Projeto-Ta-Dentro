package br.com.zup.TaDentro.indicacao.dtos;

import br.com.zup.TaDentro.enums.PerfilDeSituacao;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data

public class IndicacaoPUTDto {

    private String cpf;
    private PerfilDeSituacao situacao;
    private LocalDate dataDaContratacao;

}
