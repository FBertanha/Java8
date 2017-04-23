import java.util.*;
import java.util.function.Consumer;

/**
 * Created by felipe on 23/04/17.
 */
public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        //Collections.sort(palavras,  new ComparadorPorTamanho());
        palavras.sort(new ComparadorPorTamanho());
        System.out.println(palavras);

//        for (String p : palavras) {
//            System.out.println(p);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}
