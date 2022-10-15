/*Crie um conjunto contendo as cores do arco-íris e:
        1-Exiba todas as cores uma abaixo da outra
        2-A quantidade de cores que o arco-íris tem
        3-Exiba as cores em ordem alfabética
        4-Exiba as cores na ordem inversa da que foi informada
        5-Exiba todas as cores que começam com a letra ”v”
        6-Remova todas as cores que não começam com a letra “v”
        7-Limpe o conjunto
        8-Confira se o conjunto está vazio*/

import java.lang.reflect.Array;
import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        System.out.println("-- Cores do arco íris --");
        for (String cores : coresArcoIris){
            System.out.println(cores);
        }

        System.out.println("Quantidade de cores: " + coresArcoIris.size());

        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println("-- Ordem alfabética --");
        for (String cores : coresArcoIris2){
            System.out.println(cores);
        }

        System.out.println("-- Ordem inversa --");

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIrisList);
        for (String cores : coresArcoIrisList){
            System.out.println(cores);
        }

        System.out.println("-- Cores que começam com a letra 'v' --");

        Iterator<String> iterator = coresArcoIris2.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.charAt(0) == 'V'){
                System.out.println(next);
            }else {
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris2);

        coresArcoIris2.clear();

        System.out.println("O conjunto está vazio?: " + coresArcoIris2.isEmpty());

    }
}
