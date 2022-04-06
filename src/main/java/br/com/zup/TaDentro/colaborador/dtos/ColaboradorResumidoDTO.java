package br.com.zup.TaDentro.colaborador.dtos;

import br.com.zup.TaDentro.enums.Cargo;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ColaboradorResumidoDTO {


    @NotNull
    private String nome;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @NotNull
    private LocalDate dataContratacao;

}
