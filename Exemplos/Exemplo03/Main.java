package main;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Marcos");
        nomes.add("Bruno");
        
        System.out.println(nomes);
        
        for(String pessoa : nomes){
            System.out.println(pessoa);
        }
        System.out.println("");
        HashMap<String, String> unisal = new HashMap<>();
        unisal.put("Wbr", "Warner");
        unisal.put("Jbl", "Joao");
        
        System.out.println(unisal.get("Wbr"));
        
    }
    
}
