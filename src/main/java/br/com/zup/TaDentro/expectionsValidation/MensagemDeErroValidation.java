package br.com.zup.TaDentro.expectionsValidation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class MensagemDeErroValidation {

    private int statusCode;
    private List<Erro> erros = new ArrayList<>();


}
