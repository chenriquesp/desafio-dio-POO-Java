import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    static void main(String[] args) {
        //Criando o um curso.
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        //Criando putro curso.
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        //Criando uma mentoria.
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descição mentoria Java");
        mentoria1.setData(LocalDate.now());

        //Criamdo um Bootcamp e anexando os cursos e a mentoria ao bootcamp criado.
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Criamdo um Dev
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        //O dev Camila foi inscrita ao bootcamp
        devCamila.inscreverBootcamp(bootcamp);
        //Mostrando os cursos que foi inscrita
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        //Evolução do bootcamp em duas vezes
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        //Mostarndo o stados de Camila
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila: " + devCamila.getConteudosConcluidos());
        //Mostarndo o XP de Camilla
        System.out.println("XP: " + devCamila.calcularTotalXp());

        //indicador de separaçao de devs
        System.out.println("*******************");

        //Criando outro dev o João
        Dev devJoao = new Dev();
        devJoao.setNome("joão");
        //João foi inscrito nno Bootcamp
        devJoao.inscreverBootcamp(bootcamp);
        //Mostrando os conteúdos inscritos
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        // evoluiu todos os cursos, logo terminou  bootcamp
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        //Mostrando o Status do Bootcamp de jão
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        //Mostrando o XP de João
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
