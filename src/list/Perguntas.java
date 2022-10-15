package list;/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Perguntas {
    public static void main(String[] args){
        ArrayList<Boolean> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(getResposta());
        System.out.println("Esteve no local do crime?");
        respostas.add(getResposta());
        System.out.println("Mora perto da vítima?");
        respostas.add(getResposta());
        System.out.println("Devia para a vítima?");
        respostas.add(getResposta());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(getResposta());

        Iterator<Boolean> iterator = respostas.iterator();

        int soma = 0;
        while (iterator.hasNext()){
            boolean next = iterator.next();
            if (next){
                soma++;
            }
        }
        System.out.println("Respostas Positivas: " + soma);

        if (soma == 2){
            System.out.println("Pessoa Suspeita");
        }else if (soma > 2 && soma<=4){
            System.out.println("Pessoa Cúmplice");
        }else{
            System.out.println("Assassina!");
        }
    }

    public static boolean getResposta(){
        Scanner entrada = new Scanner(System.in);
        return toUpperCase(entrada.nextLine()).equals("SIM");
    }
}
