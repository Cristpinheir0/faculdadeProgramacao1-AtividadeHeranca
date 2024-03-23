package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programador extends Funcionario {
    public List<Linguagem> getLinguagens() {
        return linguagens;
    }

    List<Linguagem> linguagens = new ArrayList<Linguagem>();

    public Programador(String nome, Date dataNascimento, String endereco) {
        super(nome, dataNascimento, endereco);
    }

    public void addLinguagem(Linguagem linguagem) {
        this.linguagens.add(linguagem);
    }

    @Override
    public String toSring() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento.toString() + "\nEndereço: " + endereco + "\nLinguagem de programação: ";
    }
}
