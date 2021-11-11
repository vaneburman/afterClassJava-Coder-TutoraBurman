
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainTest {

    public static void main(String[] args) {

        //Convertir una lista de Strings en una lista de enteros pares
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        System.out.println("lista :" + numbers);

        List<Integer> evenNumbers = numbers.stream()
                .map(Integer::valueOf)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("lista final :" + evenNumbers);

        //Armar una lista de las palabras en la lista palabras, que empiecen con m.
        List<String> palabras = Arrays.asList("hola", "mundo", "java", "Materia", "funcional");

        System.out.println("lista :" + palabras);

        List<String> palabras2 = palabras.stream()
                .map(String::toLowerCase)
                .filter(p -> p.startsWith("m"))
                .collect(Collectors.toList());

        System.out.println("lista final con m minúscula:" + palabras2);

        List<String> palabras3 = Arrays.asList("hola", "mundo", "java", "Materia", "funcional");

        System.out.println("lista :" + palabras3);

        List<String> palabras4 = palabras.stream()
                .filter(p -> p.startsWith("m") || p.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println("lista final con m/M:" + palabras4);


    }
}
