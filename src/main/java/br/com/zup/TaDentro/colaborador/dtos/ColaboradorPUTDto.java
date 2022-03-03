package br.com.zup.TaDentro.colaborador.dtos;

import br.com.zup.TaDentro.enums.Cargo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ColaboradorPUTDto {

    private String cpf;
    private Cargo cargo;
    private LocalDate dataContratacao;


}
