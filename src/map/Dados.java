package map;
/*Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.*/

import java.util.*;

public class Dados {
    public static void main(String[] args) {
        int qtdLancamentos = 100;

        List<Integer> valores = new ArrayList<>();

        Random numeroAleatorio = new Random();
        for (int i = 0 ; i< qtdLancamentos; i++){
            valores.add(numeroAleatorio.nextInt(6)+1);
        }

        Map<Integer, Integer> valoresQtd = new HashMap<>();

        for (Integer num: valores){
            if (valoresQtd.containsKey(num)){
                valoresQtd.put(num, valoresQtd.get(num)+1);
            }else
                valoresQtd.put(num, 1);
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : valoresQtd.entrySet()){
            System.out.println(entry.getKey() + "          " +entry.getValue());
        }
    }
}
