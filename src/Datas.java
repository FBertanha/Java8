import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by felipe on 25/04/17.
 */
public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate outraData = LocalDate.of(2017, 9, 7);

        int anos = outraData.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, outraData);
        System.out.println(periodo.getDays());

        LocalDate proximaOutraData = outraData.plusYears(4);
        System.out.println(proximaOutraData);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximaOutraData.format(formatador);

        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

        //criando uma data com LocalDate
        LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(data);

        //criando um periodo entre duas datas
        LocalDate dataHoje = LocalDate.now();

        Period period = Period.between(data, dataHoje);
        System.out.println(period);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataHojeFormatada = dataHoje.format(formatter);
        System.out.println(dataHojeFormatada);
        //ou
        String dataHojeFormatada2 = formatter.format(dataHoje);
        System.out.println(dataHojeFormatada2);


    }
}
