package map;

import java.util.*;

/* Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
-Crie um dicionário e relacione os estados e suas populações;
-Substitua a população do estado do RN por 3.534.165;
-Confira se o estado PB está no dicionário, caso não adicione: PB -4.039.277;
-Exiba a população PE;
-Exiba todos os estados e suas populações na ordem que foi informado;
-Exiba os estados e suas populações em ordem alfabética;
-Exiba o estado com o menor população e sua quantidade;
-Exiba o estado com a maior população e sua quantidade;
-Exiba a soma da população desses estados;
-Exiba a média da população deste dicionário de estados;
-Remova os estados com a população menor que 4.000.000;
-Apague o dicionário de estados;
-Confira se o dicionário está vazio.
*/
public class Populacao {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");

        if (estados.containsKey("PB") == false){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        System.out.println("Exiba a população do estado PE: " + estados.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estados2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);


        Collection<Integer> populacao = estados.values();
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados.entrySet()){
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));


        double soma = 0d;
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / estados.size()));
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estados.clear();
        System.out.println(estados);

        System.out.println("Confira se a lista está vazia: " + estados.isEmpty());
    }
}
