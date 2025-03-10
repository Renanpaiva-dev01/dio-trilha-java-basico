import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        LocalDate dataHoje = LocalDate.now();
        LocalTime horaHoje = LocalTime.now();
        LocalDateTime dataHoraLocal = LocalDateTime.now();
        ZonedDateTime dataHoraZona = ZonedDateTime.now();
        
        DateTimeFormatter formatador =
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHoraLocal.format(formatador);
         
        System.out.println(dataHoje);
        System.out.println(horaHoje);
        System.out.println(dataHoraLocal);
        System.out.println(dataHoraZona);
        System.out.println(dataFormatada);
        
        String concatenacao = "?";
        System.out.println(concatenacao);
         
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
         
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
         
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        
        int numero = 5;
        System.out.println(-numero);
          
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        
        numero = -numero;
        System.out.println(numero);
        
        int a, b;
        String resultado;
        a = 5;
        b = 6;
        
        
        if (a==b) {
        resultado = "verdadeiro";
        } else {
        resultado = "falso";
        }
        System.out.println(resultado);
        System.out.println("");
         
        
        resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        

        int numerol = 1;

        int numero2 = 2;

        boolean simNao = numerol == numero2;
        System.out.println(simNao);

        simNao = numerol != numero2;
        System.out.println(simNao);

        simNao = numerol > numero2;
        System.out.println(simNao);
        if (numerol > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numerol < numero2)
            System.out.println("Numero 1 menor que numero 2");

        System.out.println("");
        String nomeUm = "Renan";
        String nomeDois = "Renan";

        System.out.println(nomeUm == nomeDois);
        System.out.println();
        String nomeUmNovo = "Renan";
        String nomeDoisNovo = new String ("Renan");

        System.out.println(nomeUmNovo == nomeDoisNovo);

        System.out.println(nomeUmNovo.equals(nomeDoisNovo));

        boolean logicoUm = true;
        boolean logicoDois = false;

        if (logicoUm && logicoDois) {
            System.out.println("os dois são verdadeiros");
        } else {
            System.out.println("um dos dois é falso");
        }

        if (logicoUm || logicoDois) {
            System.out.println("um dos dois é verdadeiro");
        }

    } 
}
