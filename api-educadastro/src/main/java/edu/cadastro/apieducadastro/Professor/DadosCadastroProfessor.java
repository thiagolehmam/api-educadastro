package edu.cadastro.apieducadastro.Professor;

import edu.cadastro.apieducadastro.Endereco.DadosEndereco;

public record DadosCadastroProfessor(String nome, String email, String cpf, Diciplina diciplina, DadosEndereco endereco) {


}
