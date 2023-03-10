
package com.mycompany.exemploarray;
import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int soma=0, valor=0, qtdeValor=0;
        Scanner input = new Scanner(System.in);
        
        //Preenchendo o array
        for(int i=0; i<array.length; i++){
            System.out.printf("Digite o valor a ser inserido no array"
                    + "na posição [%d]:", i);
            array[i]=input.nextInt();
        }
        System.out.println("Informe o valor que deseja buscar no array:");
        valor = input.nextInt();
        System.out.println("Valores existentes no Array:");
        //Exibindo os valores existentes no array
        for(int i=0; i<array.length;i++){
            System.out.println("Array [" + i + "]=" + array[i]);
            soma = soma + array[i];
        }
        if (qtdeValor ==0){
            System.out.println("Valor não encontrado no ARRAY!");
        }
        else{
            System.out.println("Valor foi encontrado " + qtdeValor + "vez(es)");
        }
        System.out.println("A soma dos valores no array é:" + soma);
    }
}
