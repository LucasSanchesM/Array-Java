package main;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Warner");
        nomes.add("Lucas");
        nomes.add("Joao");
        nomes.add("Marcelo");
        nomes.remove(1);
        nomes.remove("Joao");
        System.out.println("**Nova Lista**");
        for(String nome : nomes){
           System.out.println(nome);
        } 
        System.out.println(nomes.contains("Warner"));
        System.out.println("Tamanho: " + nomes.size());
        System.out.println("Nome[0]: " + nomes.get(0));
        
        nomes.add("Maria Joaquina");
        
        //organiza em ordem crescente
        Collections.sort(nomes);
        System.out.println("\n");
        for(String nome : nomes){
           System.out.println(nome);
        } 
        System.out.println("\n");
        //organiza em ordem descrescente
        Collections.reverse(nomes);
        for(String nome : nomes){
           System.out.println(nome);
        } 
    }
}
