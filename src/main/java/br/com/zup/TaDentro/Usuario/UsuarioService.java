package br.com.zup.TaDentro.Usuario;

import br.com.zup.TaDentro.Usuario.exceptionUsuario.MensagemErroUsuario;
import br.com.zup.TaDentro.colaborador.Colaborador;
import br.com.zup.TaDentro.colaborador.ColaboradorService;
import br.com.zup.TaDentro.indicacao.Indicacao;
import br.com.zup.TaDentro.indicacao.dtos.IndicacaoPUTDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository repository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private ColaboradorService colaboradorService;


    public Usuario salvarUsuario(Usuario usuario){
        usuarioDuplicado(usuario.getEmail());
        String encode = bCryptPasswordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encode);
        return repository.save(usuario);
    }


    public List<Usuario> exibirUsuario(){
        return (List<Usuario>) repository.findAll();
    }


    public Usuario encontrarUsuario(int id){
        return repository.findById(id).orElseThrow(() -> new MensagemErroUsuario("Usuário não encontrado"));
    }


    public Usuario encontrarUsuarioPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(() -> new MensagemErroUsuario("Usuário não encontrado"));
    }


    public void deletarUsuario(int id){
        repository.delete(encontrarUsuario(id));
    }


    public void usuarioDuplicado(String email){

       Optional<Usuario> usuario =  repository.findByEmail(email);
        if (usuario.isPresent()) {
            throw new MensagemErroUsuario("Usuário já cadastrado!");
        }
    }


    public void atualizarUsuario(Usuario usuario){
        Usuario usuarioSalva = encontrarUsuarioPorEmail(usuario.getEmail());

        usuarioSalva.setEmail(usuario.getEmail());
        usuarioSalva.setSenha(usuario.getSenha());
        repository.save(usuarioSalva);
    }

}
