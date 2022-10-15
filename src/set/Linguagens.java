package set;/*Crie uma classe set.LinguagemFavorita que possua os atributos: nome, anoDeCriacao e ide.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        1-Ordem de Inserção
        2-Ordem Natural (nome)
        3-IDE
        4-Ano de criação e nome
        5-Nome, ano de criacao e IDE
        Ao final, exiba as linguagens no console, um abaixo da outra.*/

import java.util.*;

public class Linguagens {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("JAVA",1991,"IntelliJ"));
            add(new LinguagemFavorita("C",1972,"Dev C++"));
            add(new LinguagemFavorita("Python",1989,"Jupyter"));
        }};

        System.out.println("-- Ordem de inserção --");
        for (LinguagemFavorita linguagem : minhasLinguagens){
            System.out.println(linguagem);
        }

        System.out.println("-- Ordem Natural(nome) --");

        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens2){
            System.out.println(linguagem);
        }

        System.out.println("-- Ordem IDE --");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatorIDE());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens3){
            System.out.println(linguagem);
        }

        System.out.println("-- Ordem Ano de Criação/Nome --");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens4){
            System.out.println(linguagem);
        }

        System.out.println("-- Ordem Nome/Ano de criação/IDE --");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(new ComparatorNomeAnoIDE());
        minhasLinguagens5.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens5){
            System.out.println(linguagem);
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareTo(linguagemFavorita.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareTo(lf2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        int ano = lf1.getAnoDeCriacao().compareTo(lf2.getAnoDeCriacao());
        if (ano != 0){
            return ano;
        }
        return lf1.getNome().compareTo(lf2.getNome());
    }

}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        int nome = lf1.getNome().compareTo(lf1.getNome());
        if (nome != 0) return nome;
        int ano = lf1.getAnoDeCriacao().compareTo(lf2.getAnoDeCriacao());
        if (ano != 0) return ano;
        return lf1.getIde().compareTo(lf2.getIde());
    }
}