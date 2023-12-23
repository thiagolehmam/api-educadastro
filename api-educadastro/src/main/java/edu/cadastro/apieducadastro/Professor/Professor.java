package edu.cadastro.apieducadastro.Professor;

import edu.cadastro.apieducadastro.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//JPA
@Table(name = "professores")
@Entity(name = "Professores")

//Lombok
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Diciplina diciplina;
    @Embedded
    private Endereco endereco;

    public Professor(DadosCadastroProfessor dados) {

        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.diciplina = dados.diciplina();
        this.endereco = new Endereco(dados.endereco());
    }
}
