import entity.Funcionario;
import entity.Linguagem;
import entity.Programador;
import entity.Rank;
import service.ProgramadorService;

import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Declaração de objeto do tipo Funcionario
        Funcionario pessoa = new Funcionario("Fulano", new Date(2000, Calendar.NOVEMBER, 28), "Rua Exemplo N 286");
        System.out.println(pessoa.toSring());
        // Declaração de objeto do tipo Programador
        Programador programador = new Programador("Ciclano", new Date(2001, Calendar.MARCH, 25), "Rua Exemplo 2 N 999");
        ProgramadorService programadorService = new ProgramadorService();
        programadorService.adicionarLinguagem(programador, new Linguagem("Java", Period.of(2,0,0), Rank.PRIMERIO));
        programadorService.adicionarLinguagem(programador, new Linguagem("Java", Period.of(2,0,0), Rank.PRIMERIO));
        programadorService.adicionarLinguagem(programador, new Linguagem("Java", Period.of(2,0,0), Rank.PRIMERIO));
        programadorService.adicionarLinguagem(programador, new Linguagem("Java", Period.of(2,0,0), Rank.PRIMERIO));
        System.out.println(programador.toSring());
        Programador programador2 = new Programador("Fulano", new Date(2001, Calendar.MARCH, 25), "Rua Exemplo 2 N 999");
        programadorService.adicionarLinguagem(programador2, new Linguagem("Java", Period.of(1,0,0), Rank.PRIMERIO));
        programadorService.compararProgramadoresExperiencia(programador, programador2, "Java");
    }
}