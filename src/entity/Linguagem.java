package entity;

import java.time.Period;


public class Linguagem {

    String nome;

    Period tempoExperiencia;

    Rank rankPrefencia;

    public Linguagem(String nome, Period tempoExperiencia, Rank rankPrefencia) {
        this.nome = nome;
        this.tempoExperiencia = tempoExperiencia;
        this.rankPrefencia= rankPrefencia;
    }

    public String getNome() {
        return nome;
    }

    public Period getTempoExperiencia() {
        return tempoExperiencia;
    }
}
