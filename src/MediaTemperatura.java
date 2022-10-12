/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as
em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro,
2 – Fevereiro e etc).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaTemperatura {
    public static void main(String []args){

        List<Mes> temps = new ArrayList<>(){{
            add(new Mes("Janeiro", 28.6));
            add(new Mes("Fevereiro", 29d));
            add(new Mes("Março", 28d));
            add(new Mes("Abril", 26.6));
            add(new Mes("Maio", 23.4));
            add(new Mes("Junho", 22.9));
        }};
        System.out.println("Temperatura 6 primeiros meses: " + temps);

        Iterator<Mes> iterator = temps.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next().getTemperatura();
            soma += next;
        }
        Double media = soma/temps.size();
        System.out.println("Média Semestral: " + media);
        System.out.println("Meses menores que a média: ");
        iterator = temps.iterator();
        while(iterator.hasNext()){
            Mes next = iterator.next();
            if (next.getTemperatura() > media){
                System.out.println(next);
            }
        }
    }

}

class Mes{
    private String mes;
    private Double temperatura;

    public Mes(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}

