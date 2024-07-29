///////////////////////////////////////////////////////////////////////////////////////
//Matriz Array Bimensional

///////////////////////////////////////////////////////////////////////////////////////
//Example 1 Two dimensional ALL

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number line: ");
        int line = scan.nextInt();
        int[][] mat = new int[line][line]; //QUantidade de linhas no primeiro [] e a quantidade de colunas no segundo []

            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.println("Entre com valor: ");
                    mat[i][j] = scan.nextInt(); //Colocando os valores nas respectivas posições, exemplo na linha
                                                //0 e na coluna 0 entre com um dado e por ai vai
                }
            }

            System.out.println("Show Result");
            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.println("Values: " + mat[i][j]); //Mostra todos os dados da tabela
                }
            }
        scan.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////
//Example 2 Two dimensional Diagonal

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number line: ");
        int line = scan.nextInt();
        int[][] mat = new int[line][line];

            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.println("Entre com valor: ");
                    mat[i][j] = scan.nextInt();
                }
            }

            System.out.println("Main Diagonal: ");
            for(int i = 0; i < line; i++){
                System.out.println("Values: " + mat[i][i]); // Aqui o resultado é mostrar todos os dados em diagonal
            }
        scan.close();
    }
}


///////////////////////////////////////////////////////////////////////////////////////
//Example 3 -- Two dimensional Negative

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number line: ");
        int line = scan.nextInt();
        int[][] mat = new int[line][line];

            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.println("Entre com valor: ");
                    mat[i][j] = scan.nextInt();
                }
            }

            System.out.println("Number Negative");
            int count = 0;
            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    if(mat[i][j] < 0){
                        System.out.println(mat[i][j] + " ");
                        count++;
                    }
                }
            }

            System.out.println("Count of Negative: " + count);
        scan.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////
//Example 4 Two dimensional ALL Script

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int n = scan.nextInt();
        int[][] mat = new int[n][n]; //[] Primeiro a linha e o segundo [] Coluna 

            for(int i = 0; i < n; i++){   //Linha "I"
                for(int j = 0; j < n; j++){  //Coluna "J"
                    System.out.println("Entre com o valor das colunas");
                    mat[i][j] = scan.nextInt();
                }
            }

            System.out.println("Main Diagonal: ");
                for(int z = 0; z < n; z++){
                    System.out.println(mat[z][z] + " ");
                }

            int count = 0;
            int negativeValue = 0;
            System.out.println("Number negative: ");
                for(int i = 0; i < n; i++){   //Linha "I"
                    for(int j = 0; j < n; j++){  //Coluna "J"
                        if(mat[i][j] < 0){
                            count++;
                            System.out.println(mat[i][j] + " ");
                        }
                    }
                }
            System.out.println("Total numbers negative: " + count);

        scan.close();
    }
}


///////////////////////////////////////////////////////////////////////////////////////
//Example 5 Questions - Entre com o número de coluna e linha, depois mostrar os números
//à esquerda, à direita e abaixo, a partir de parâmetros em "line" and "Collumn"


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number line: ");
        int line = scan.nextInt();
        int[][] mat = new int[line][line];

            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.println("Entre com valor: ");
                    mat[i][j] = scan.nextInt();
                }
            }

            System.out.println("Total Result: ");

            for(int i = 0; i < line; i++){
                for(int j = 0; j < line; j++){
                    System.out.print(mat[i][j] + " ");
                }
            }


            System.out.println();
            System.out.println("Position Line: ");
            int line_inp = scan.nextInt();

            System.out.println("Position Collumn: ");
            int collumn_inp = scan.nextInt();

            //LEFT
            System.out.println("Left: ");
            for(int i = line_inp; i <= line_inp; i++){
                for(int j = collumn_inp - 1; j <= collumn_inp -1; j++){
                    if(j < 0){
                        System.out.println("Nao existe nada a esquerda");
                    }else{
                        System.out.print(mat[i][j] + " " + "\n");
                    }
                }
            }

            //RIGHT
            System.out.println("Right: ");
            for(int i = line_inp; i <= line_inp; i++){
                for(int j = collumn_inp + 1; j <= collumn_inp + 1; j++){
                    if(j + 1 > mat[line_inp].length){
                        System.out.println("Nao existe nada a direita");
                    }else{
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }

            System.out.println();
            //DOWN
            System.out.println("Down: ");
            for(int i = line_inp + 1; i <= line_inp + 1; i++){
                for(int j = collumn_inp; j <= collumn_inp; j++){
                    if(i + 1 > mat[line_inp].length){
                        System.out.println("Nao existe nada a baixo");
                    }else{
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }

        scan.close();
    }
}