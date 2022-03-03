package br.com.zup.TaDentro.indicacao.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class IndicacaoPesquisaDTO {

    private LocalDate dataInicial;
    private LocalDate dataFinal;



}