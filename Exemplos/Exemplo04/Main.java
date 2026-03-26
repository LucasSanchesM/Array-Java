/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.HashSet;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
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
        
        FileWriter arq = new FileWriter("C:\\Arquivo\\dados.txt");
        PrintWriter gravaArq = new PrintWriter(arq);
        
        gravaArq.printf(unisal.get("Jbl"));
        gravaArq.printf("\n" + unisal.get("Wbr"));
        arq.close();
        
        
    }
    
}
