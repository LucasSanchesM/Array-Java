package main;

public class Main {
    public static void main(String[] args) {
        double valor[] = new double [10];
        /*
        for (int i=0; i<valor.length; i++){
            System.out.printf("Vetor["+i+"] = %.2f\n", valor[i]);
        };
        */
        System.out.printf("Tamanho de vetor:%d ", valor.length);
        
        for(double vir: valor){
            System.out.println("Valor = ["+vir+"]");
        }
        Pessoa novasPessoas[] = new Pessoa[2];
        Pessoa p1 = new Pessoa("Jairo", 40);
        Pessoa p2 = new Pessoa("Rodolfo", 67);
        
        novasPessoas[0] = p1;
        novasPessoas[1] = p2;
        for(int y=0; y < novasPessoas.length; y++){
            System.out.println("Nome de pessoa ["+y+"]: " + novasPessoas[y].getNome());
            System.out.println("Idade de pessoa ["+y+"]: " + novasPessoas[y].getIdade());

        }
        
    }
    
}
