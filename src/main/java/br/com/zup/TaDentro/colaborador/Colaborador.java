package br.com.zup.TaDentro.colaborador;

import br.com.zup.TaDentro.Usuario.Usuario;
import br.com.zup.TaDentro.enums.Cargo;
import br.com.zup.TaDentro.indicacao.Indicacao;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank(message = "{validacao.nome.colaborador}")
    @Size(min = 3, max = 20)
    private String nome;
    @NotNull
    @Length(min = 11,max = 11, message = "{validacao.cpf.digito}")
    private String cpf;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @NotNull
    private LocalDate dataContratacao;

    @OneToOne
//    @JoinColumn(name = "id_usuario")
    private Usuario loginUsuario;
    @OneToMany(mappedBy = "colaborador")
    private List<Indicacao> listDeIndicacao;

    public Colaborador() {
    }

}
