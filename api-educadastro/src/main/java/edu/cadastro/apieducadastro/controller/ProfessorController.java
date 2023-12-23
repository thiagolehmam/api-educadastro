package edu.cadastro.apieducadastro.controller;

import edu.cadastro.apieducadastro.Endereco.Endereco;
import edu.cadastro.apieducadastro.Professor.DadosCadastroProfessor;
import edu.cadastro.apieducadastro.Professor.Professor;
import edu.cadastro.apieducadastro.Professor.ProfessorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("professores")
public class ProfessorController {
    //injeção de dependências
    @Autowired
    private ProfessorRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProfessor dados) {
                repository.save(new Professor(dados));

    }

}
