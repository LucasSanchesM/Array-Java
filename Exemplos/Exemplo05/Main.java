package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Arquivo\\dados.txt"));
        
        String linha ="";
        int i = 0;
        
        while(true){
            if(linha!=null){
                System.out.println(linha);
            }
            else{
                break;
            }
            linha = buffRead.readLine();
        }
    }
}
