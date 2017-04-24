import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by felipe on 23/04/17.
 */
public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        System.out.println(palavras);

        //Sem lambda
        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        //Com lambda
        palavras.sort((s1, s2) -> {
            return s1.length() - s2.length();
        });

        //Com lambda 2
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


        //Foreach Sem lambda
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Foreach com lambda
        palavras.forEach(s -> System.out.println(s));

        //Criando um consumer com lambda
        Consumer<String> consumer = s -> System.out.println(s);
        palavras.forEach(consumer);

        /*
         * Aula 03
         */

        //Lambda com Comparator
        palavras.sort(Comparator.comparing(s -> s.length()));

        //Method reference
        palavras.sort(Comparator.comparing(String::length));

        //Method reference detalhado
        Function<String, Integer> funcao = String::length;
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        //Exercicios
        palavras.sort(Comparator.comparing(s -> s.charAt(0)));
        System.out.println(palavras);

        palavras.forEach(System.out::println);





    }
}


