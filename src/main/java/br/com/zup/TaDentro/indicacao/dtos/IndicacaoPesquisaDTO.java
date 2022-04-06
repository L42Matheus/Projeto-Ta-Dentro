package br.com.zup.TaDentro.indicacao.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IndicacaoPesquisaDTO {

    private LocalDate dataInicial;
    private LocalDate dataFinal;

}