package exemplofuncao;

import java.util.Scanner;

// Aula 16.03.2023
public class ExemploFuncao {

   public static void soma (int n1,int n2){
       int resultado;
       resultado = n1+n2;
       System.out.println("O resultado da soma é:" + resultado);
   }
    public static void main(String[] args) { // dentro do main consigo chamar a funcao para somar com n1 n1 -- num 1 num 2
        int num1, num2;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe um numero inteiro");
        num1 = input.nextInt();
        
         System.out.println("Informe um segundo inteiro");
        num2 = input.nextInt();
        
        soma(num1,num2); // internando execute a soma
        
        
        
        
        
    
    }
    
}
