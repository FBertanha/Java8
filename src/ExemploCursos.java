import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by felipe on 24/04/17.
 */

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

        //cursos.forEach(c -> System.out.println(c.getNome()));

        /*filtrando cursos com mais de 50 alunos
         */

        //com classe anonima
        cursos.stream()
                .filter(new Predicate<Curso>() {
                    @Override
                    public boolean test(Curso curso) {
                        return curso.getAlunos() > 50;
                    }
                }).forEach(new Consumer<Curso>() {
            @Override
            public void accept(Curso curso) {
                System.out.println(curso);
            }
        });

        //com lambda
        cursos.stream()
                .filter(alunos -> alunos.getAlunos() > 50)
                .forEach(alunos -> System.out.println(alunos));

        //com method reference
        cursos.stream()
                .filter(alunos -> alunos.getAlunos() > 50)
                .forEach(System.out::println);

        /*utilizando o método map
         */

        //com lambda
        Stream<String> stringCursos = cursos.stream()
                .map(curso -> curso.getNome());
        stringCursos.forEach(curso -> System.out.println(curso));

        //com method reference
        stringCursos = cursos.stream()
                .map(Curso::getNome);
        stringCursos.forEach(System.out::println);

        /*tirando mais proveito do method reference
        */
        //com lambda
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(c -> c.getAlunos())
                .forEach(x -> System.out.println(x));

        //com method reference
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);


    }

}
