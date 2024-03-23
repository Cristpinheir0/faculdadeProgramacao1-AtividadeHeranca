package service;

import entity.Linguagem;
import entity.Programador;

import java.time.Period;
import java.util.List;
import java.util.Optional;

public class ProgramadorService {

    public void adicionarLinguagem(Programador programador, Linguagem linguagem) {
        // Se o programador tiver menos que tres linguagens cadastradas ele adiciona a nova
        if(programador.getLinguagens().size() <3) {
            programador.addLinguagem(linguagem);
            System.out.println("LINGUAGEM ADICIONADA\n");
            return;
        }
        // Programador já possui 3 linguagens cadastradas
        System.out.println("LINGUAGEM NÃO ADICIONADA! PROGRAMADOR JA POSSUI 3 LINGUAGENS ADICIONADAS");
    }

    public void compararProgramadoresExperiencia(Programador primeiroProgramador, Programador segundoProgramador, String nomeLinguagem) {
        Optional<Linguagem> linguagemPrimeiroProgramador = this.programadorPossuiLinguagem(primeiroProgramador, nomeLinguagem);
        Optional<Linguagem> linguagemSegundoProgramador = this.programadorPossuiLinguagem(segundoProgramador, nomeLinguagem);
        if(linguagemPrimeiroProgramador.isPresent() && linguagemSegundoProgramador.isPresent()) {
            Linguagem linguagem1 = linguagemPrimeiroProgramador.get();
            Linguagem linguagem2 = linguagemSegundoProgramador.get();
            Period diferencaTempo = linguagem1.getTempoExperiencia().minus(linguagem2.getTempoExperiencia());
            if(diferencaTempo.isNegative()) {
                System.out.println("Programador 2 possui mais tempo de experiencia");
                return;
            }
            if(diferencaTempo.isZero()) {
                System.out.println("Os programadores possuem o mesmo tempo de experiência");
                return;
            }
            System.out.println("O Promador 1 possui mais tempo de experiência");
        }

    }

    private Optional<Linguagem> programadorPossuiLinguagem(Programador programador, String nomeLinguagem) {
        List<Linguagem> linguagens = programador.getLinguagens();
        for(final Linguagem linguagem: linguagens) {
            if(linguagem.getNome().equals(nomeLinguagem)) return Optional.of(linguagem);
        }
        System.out.println("O programador " + programador.getNome() + "não possui a linguagem: " + nomeLinguagem);
        return Optional.empty();
    }
}
