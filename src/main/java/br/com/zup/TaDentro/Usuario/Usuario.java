package br.com.zup.TaDentro.Usuario;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank(message = "{validacao.nome}")
    @Size(min = 2 , max = 30, message = "{validacao.nome.tamanho}")
    private String nome;
    @NotBlank(message ="{validacao.email.vazio}" )
    @Email(message = "{validacao.email}")
    private String email;
    @NotNull
    @NotBlank(message = "{validacao.senha.vazio}")
    private String senha;

    public Usuario(){

    }
}
