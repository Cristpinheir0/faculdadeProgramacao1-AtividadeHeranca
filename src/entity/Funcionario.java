package entity;

import java.util.Date;

public class Funcionario {

    String nome;

    Date dataNascimento;

    String endereco;

    public Funcionario(String nome, Date dataNascimento, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String toSring() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento.toString() + "\nEndereço: " + endereco;
    }

    public String getNome() {
        return nome;
    }
}
