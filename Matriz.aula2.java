
package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int  somaDiagonal=0;
       int[][] matriz = new int [4][4];
       Scanner input= new Scanner ( System.in);
       
       for ( int linha = 0; linha<4; linha++){ // percorre as linhas
           for (int coluna=0; coluna<4; coluna++){ // percorre as colunas
           System.out.println("Informe o valor a ser inserido"+
                   " na posicao [" + linha+"]["+coluna+"]:");
           matriz[linha][coluna]=input.nextInt(); // insere valor na matriz
           if (linha==coluna){
               somaDiagonal = somaDiagonal + matriz [linha][coluna];
           }
          
       }
    }
    System.out.println("A soma da diagonal é:" + somaDiagonal);
}
}
