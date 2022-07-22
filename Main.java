import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargahoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria de Java");
        mentoria1.setDate(LocalDate.now());
        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Code Girls");
        bootcamp.setDescricao("Descrição Bootcamp Code Girls");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devViviane = new Dev();
        devViviane.setNome("Viviane");
        devViviane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devViviane.getConteudosInscritos());

        devViviane.progredir();
        
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devViviane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devViviane.getConteudosConcluidos());
        System.out.println("XP: " + devViviane.calcularTotalXp());
        
        System.out.println("----------------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGustavo.getConteudosInscritos());

        devGustavo.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());


    }
}
