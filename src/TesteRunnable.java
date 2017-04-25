/**
 * Created by felipe on 23/04/17.
 */
public class TesteRunnable {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        });

        //Com lambda

        new Thread(() -> System.out.println("Executando um runnable")).start();


    }
}
