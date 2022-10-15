package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1","4","8","4","9","2","7");

        System.out.println("Elementos: ");

        numeros.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set");
        numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Tranforme essa lista de String em uma lista de numeros inteiros.");
        List<Integer> numerosInteiros = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> numerosParesMaiores2 = numeros.stream()
                .map(Integer::parseInt)
                .filter( i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(numerosParesMaiores2);

        System.out.println("Mostre a média dos números: ");

        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        numerosInteiros.removeIf(i ->(i % 2 !=0));
        System.out.println(numerosInteiros);

    }
}
