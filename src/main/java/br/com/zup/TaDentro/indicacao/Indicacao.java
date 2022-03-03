package br.com.zup.TaDentro.indicacao;

import br.com.zup.TaDentro.colaborador.Colaborador;
import br.com.zup.TaDentro.enums.PerfilDeSituacao;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "indicacao")
@NoArgsConstructor
@Data
public class Indicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank(message = "{validacao.nome.indicacao}")
    @Size(min = 3, max = 30)
    private String nome;
    @NotNull
    @NotBlank(message = "{validacao.cpf.vazio}")
    @Length(min = 11, max = 11,message = "{validacao.cpf.indicacao}")
    private String cpf;
    private LocalDate dataDaContratacao;
    @Email(message = "{validacao.email.indicacao}")
    private String email;
    @Enumerated(EnumType.STRING)
    private PerfilDeSituacao situacao;
    private LocalDate dataDeCadastro;

    @ManyToOne
    private Colaborador colaborador;

}
