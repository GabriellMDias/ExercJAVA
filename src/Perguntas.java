/*Utilizando listas, faça um programa que faça 5 perguntas para uma
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
import java.util.Scanner;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Perguntas {
    public void main(String[] args){
        System.out.println("Teste");

        ArrayList<Boolean> respostas = new ArrayList<Boolean>();

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

        System.out.println(respostas);
    }

    public boolean getResposta(){
        Scanner entrada = new Scanner(System.in);
        if (entrada.nextLine().equals("SIM")){
            entrada.close();
            return true;
        }
        entrada.close();
        return false;
    }
}
