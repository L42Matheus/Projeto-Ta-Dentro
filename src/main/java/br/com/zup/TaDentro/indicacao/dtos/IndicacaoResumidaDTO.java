package br.com.zup.TaDentro.indicacao.dtos;

import br.com.zup.TaDentro.enums.PerfilDeSituacao;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
@RequiredArgsConstructor
public class IndicacaoResumidaDTO {


    @NotNull
    private String nome;
    @NotNull
    private LocalDate dataDaContratacao;
    private String email;
    @NotNull
    @Enumerated(EnumType.STRING)
    private PerfilDeSituacao situacao;



}
