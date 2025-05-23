package com.example.aula.service;

// import com.example.aula.exception.EmailJaCadastradoException;
import com.example.aula.model.Jogador;
import com.example.aula.repository.JogadorRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class JogadorService
{
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository)
    {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> listarTodos()
    {
        return jogadorRepository.findAll();
    }

    public Jogador salvar(@Valid Jogador jogador)
    {
        return jogadorRepository.save(jogador);
    }

    public Jogador atualizar(@Valid Jogador jogador)
    {
        Jogador jogadorAtualizar = jogadorRepository.findById(jogador.getId())
                .orElseThrow(() -> new IllegalArgumentException("Jogador não encontrado."));

        jogadorAtualizar.setNome(jogador.getNome());
        // jogadorAtualizar.setEmail(jogador.getEmail());
        // jogadorAtualizar.setSenha(jogador.getSenha());
        jogadorAtualizar.setSexo(jogador.getSexo());
        jogadorAtualizar.setIdade(jogador.getIdade());
        jogadorAtualizar.setAltura(jogador.getAltura());
        jogadorAtualizar.setPeso(jogador.getPeso());
        jogadorAtualizar.setPosicao(jogador.getPosicao());
        jogadorAtualizar.setNumeroCamisa(jogador.getNumeroCamisa());
        

        return jogadorRepository.save(jogadorAtualizar);
    }

    public void excluir(Long id)
    {
        Jogador jogadorExcluir = jogadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        jogadorRepository.deleteById(jogadorExcluir.getId());
    }

}
