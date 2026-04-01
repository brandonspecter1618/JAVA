
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

// STUDY JAVA

/*

Java Variables

Variables are containers for storing data values.

In Java, there are different types of variables, for example:

    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false

*/

//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//   General JAVA          /
//                         / 
////////////////////////////


public class testJava {

    public static void main(String args[]){
        
            int a;
            double b;
            String c;
            boolean d;
            char e;

            a = 50;
            b = 5.46;
            c = "Hello Brandon";
            d = true;
            e = 'D';

            System.out.println("Inteiro: " + a);
            System.out.println("Double: " + b);
            System.out.println("String: " + c);
            System.out.println("Boolean: " + d);
            System.out.println("Boolean: " + e);
    };
};


//or

//toUpperCase() and toLowerCase

import java.util.Scanner;

public class javaTest {

    public static void main(String[] args){

        System.out.printf("Enter with phrase: %n");
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String upper = a.toUpperCase();
        String lower = upper.toLowerCase();

        System.out.printf(upper + "%n" + lower);
    }
}

//or

//IndexOf() , length()

//import java.util.Scanner;

public class Jstest1618 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String a, upper, lower;
        
        System.out.println("Enter any phrase:");
        a = scan.nextLine(); 
         
        System.out.println(a.indexOf("Hello")); 

        //Hello Brandon = 0
        //Brandon Hello = 8
        // -1 Quando não acha o valor da pesquisa
                                                                
    }
}


//or

//import java.util.Scanner;

public class Jstest1618 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String a, upper, lower;
        
        System.out.println("Enter any phrase:");
        a = scan.nextLine(); 
         
        System.out.println(a.length()); 

        //Hello Brandon = 13 (São 12 letras e um espaçõ)                                                        
    }
}


//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//   Ler Dados Scanner     /
//                         / 
///////////////////////////

//import java.util.Scanner;

public class testJava {

    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int a, b, result;
       
       System.out.println("Value 1: ");
       a = scan.nextInt();
       
       System.out.println("Value 2: ");
       b = scan.nextInt();
       
       result = a + b;
       
       System.out.println("Result is " + result);
   }
};

//////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//  Cálculo de Soma        /
//                         / 
///////////////////////////


public class testJava {
    
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int a, b, result;
     
       a = 25;
       b = 44;
       result = a + b;
       
       System.out.println("Result is " + result);
   }
}

//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//  Condicionamento FOR    /
//                         / 
///////////////////////////

//JAVA Condicionamento for

public class testJava {

    public static void main(String args[]){
        
            int a;

                for(a = 0; a <= 100; a++){
                    if(a % 2 == 0) {
                        System.out.println(a);
                    }
                }
    }
}

//OR

public class Jstest1618 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x, y, pi;
        
        try{  
            System.out.println("Loop Value: ");
            y = scan.nextInt();

            System.out.println("Digite Par = 0 impar: 1");
            pi = scan.nextInt();

                for(x = 0; x <= y; x++){
                    if(x % 2 == pi){
                        System.out.println(x);
                    }
                }                                                           
        }catch(Exception e){
            System.out.println("Error " + e);
        }
        
    }
}
///////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//  Condicionamento IF     /
//                         / 
///////////////////////////

public class Jstest1618 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x;
        
        try{  
            System.out.println("Enter with number: ");
            x = scan.nextInt();
                if(x % 2 == 0){
                    System.out.println("É um par");
                }else{
                    System.out.println("É um impar");
                }
            
        }catch(Exception e){
            System.out.println("Error " + e);
        } 
    }
}


//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//     Arrow Function      /
//                         / 
///////////////////////////

import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, total;
        
        try{
            System.out.println("Enter value 1:");
            a = scan.nextInt();
            
            System.out.println("Enter value 2:");
            b = scan.nextInt();
            
            total = calc1(a, b);
            
            System.out.println("The result is " + total);
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
    
    public static int calc1(int a, int b){
        int args_a, args_b, result;
        args_a = a;
        args_b = b;
        result = args_a + args_b;
        return(result);
    }
}

//OR


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, total;
        
        try{
            System.out.println("Enter value 1:");
            a = scan.nextInt();
            
            System.out.println("Enter value 2:");
            b = scan.nextInt();
            
            total = calc1(a, b);
            
            System.out.println("The result is " + total);
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
    
    public static int calc1(int a, int b){
        int result;
        int arr[] = {a, b};
        result = arr[0] + arr[1];
        return(result);
    }
}


//or


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     funcMain();
    }
    
    public static void funcMain(){
        Scanner scan = new Scanner(System.in);
        int a, b, total;
        
        try{
            System.out.println("Enter value 1:");
            a = scan.nextInt();
            
            System.out.println("Enter value 2:");
            b = scan.nextInt();
            
            total = calc1(a, b);
            
            System.out.println("The result is " + total);
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
    
    public static int calc1(int a, int b){
        int result;
        int arr[] = {a, b};
        result = arr[0] + arr[1];
        return(result);
    }
}

////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//         Array           /
//                         / 
////////////////////////////

package com.specter.javacourse;

/**
 *
 * @author hepta.brendo.p
 */
public class jsTest {
    public static void main(String args[]){
        int[] arr = new int[100];
        int x;    
            try {
                for(x = 0; x < 51; x++){
                    arr[x] = x;
                    System.out.println(arr[x]);
                }
            }    
            catch(Exception e){
                System.out.println(e);
            }
    }
}

//OR

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     myFuncMain();
    }
    
    public static void myFuncMain(){
        int x;
        int[] arr = new int[100];
        
        try{
            for(x = 0; x <= 100; x++){
                arr[x] = x;
                System.out.println(arr[x]);
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
}



////////////////////////////////////////////////////////////////////////////////

package com.specter.javacourse;

public class jsTest {
    public static void main(String args[]){
      
        int arr[] = new int[100];
        int totalArr;
            
            try{
                for(int x = 0; x < 100; x++){
                    arr[x] = x;
            }
                totalArr = arr[20] + arr[36];
                System.out.println("The result is " + totalArr);
            }catch(Exception e){
                System.out.println("Error " + e);
            }
            
    }
}

//OR

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     myFuncMain();
    }
    
    public static void myFuncMain(){   
        try{
            
            int result_return;
            
            result_return = myFuncArray();
            System.out.println("The result is " + result_return);
            
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
    
    public static int myFuncArray(){
        int a, x;
        int[] arr = new int[101];

            
            for(x = 0; x <= 100; x++){
                arr[x] = x;
            }
        a = arr[30] + arr[20];    
        return(a);     
    }
}

////////////////////////////////////////////////////////////////////////////////


//OR

package br.com.project1.brandon.javatest1618;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author brandon
 */
public class JavaTest1618 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[101];
        int a, b, z;
         
            try{
                
                for(int x = 0; x <= 100; x++){
                    arr[x] = x;
                }

            System.out.println("Value 1");    
            a = scan.nextInt();

            System.out.println("Value 2");
            b = scan.nextInt();    

            z = arr[a] + arr[b];    


            System.out.println("The result is " + z);
            }catch(Exception e){
                System.out.println("Error: " + e);
            
            }   
         
    }  
}

////////////////////////////////////////////////////////////////////////////////

//import java.util.Scanner;

public class javaTest {

    public static void main(String args[]){
      
        Scanner scan = new Scanner(System.in);
        String[] arr = {"Volvo", "Ferrari", "BMW", "Lamborgini"};
     
        try{
            
            for(int x = 0; x < 4; x++){
               System.out.println("The car is " + arr[x]);
            }
        
        }catch(Exception e){
            System.out.println("Error Array is " + e);
        }
            
    }
}

//OR

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     myFuncMain();
    }
    
    public static void myFuncMain(){   
        try{
            
            String[] arr = {"Volvo", "Ferrari", "BMW", "Lamborgini"};
                for(int x = 0; x <= arr.length; x++){
                    System.out.println(arr[x]);
                }
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
}


////////////////////////////////////////////////////////////////////////////////

//OR

//import java.util.Scanner;
public class javaTest {
	
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       int arr[] = new int[2];
       int result;

        try{
           System.out.println("Value 1: ");
           arr[0] = input.nextInt();

           System.out.println("Value 2: ");
           arr[1] = input.nextInt();

           result = arr[0] + arr[1];  
           System.out.println(result);

        }catch(Exception e){
           System.out.println("Error is " + e);
        } 
    }	
}

//OR

package br.com.packet1.jstest1618;


import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     myFuncMain();
    }
    
    public static void myFuncMain(){   
        int a, b, result;
        Scanner scan = new Scanner(System.in);
        
        
        try{
            System.out.println("Value1: ");
            a = scan.nextInt();
            
            System.out.println("Value2: ");
            b = scan.nextInt();
            
            result = myFuncArrayCalc(a, b);
            System.out.println("The result is " + result);
         
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
    
    public static int myFuncArrayCalc(int a, int b){
        int arr[] = new int[2];
        int a_args, b_args,total;
        
        arr[0] = a;
        arr[1] = b;
        total = arr[0] + arr[1];
        return(total);   
    }
}


////////////////////////////////////////////////////////////////////////////////

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    
    public static void main(String[] args){
     myFuncMain();
    }
    
    public static void myFuncMain(){
        int UploadMusic[] = new int[500];
        int playListMusic[] = new int[500];
        
        Random rand = new Random();
        int aleatory;
        
        try{
            
            for(int x = 0; x <= UploadMusic.length - 1; x++){
                UploadMusic[x] = x;
                playListMusic[x] = UploadMusic[x];
            }
            
            for(int y = 0; y <= UploadMusic.length - 1; y++){
            
                aleatory = rand.nextInt(playListMusic.length);
                JOptionPane.showMessageDialog(null, "Music atual !!! Próxima clique em OK " + playListMusic[aleatory]);                 
            }
 
        }catch(Exception e){
            System.out.println("Error: " + e);
        }    
    }
}




//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//       Array List        /
//                         / 
///////////////////////////

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.specter.javacourse;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hepta.brendo.p
 */
public class jsTest {
    public static void main(String[] args) {
        int x, y, result;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //ArrayList<String> arr = new ArrayList<String>();
       
            for(x = 0; x <= 50; x++){
                arr.add(x * 2);
            }   
            
        result = arr.get(10) + arr.get(20);
        System.out.println(result);
    }
}

//or


import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author hepta.brendo.p
 */
public class NewClass {
    public static void main(String args[]){
        try{
            ArrayList<String> fruits = new ArrayList<String>();
                fruits.add("Volvo");
                fruits.add("Porsche");
                fruits.add("Ferrari");
                fruits.add("Renault");
                
            Iterator<String> it = fruits.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
        }
        
        catch(Exception e){
            System.out.println("Error Detect " + e);
        }
    }
    
}


//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//       Constructor       /
//                         / 
////////////////////////////

public class Jstest1618 {
    int x;  //Por não ser static o main que é um classe não pode pegar uma variável não static. Por isso vc precisa criar um objeto pra acessar.
    static int z = 20;  // Aqui sim vc pode acessar a partir da classe static 
    public Jstest1618(int z){
        this.x = z + 10;  //Meu constructor está armazenando dados dentro da variável fora de escopo.
    }

    public static void main(String args[]){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Value 1");
        a = scan.nextInt();
        Jstest1618 objJs = new Jstest1618(a);
        System.out.println("Valor da variável X do objeto" + objJs.x); //Aqui estou pegando o valor da variável A atráves de um constructor fora de escopo                 
        System.out.println("Valor da variável agora estática e classe como é estática consegue acessar" + z);    
        scan.close(); 
    }
}

//or

public class Jstest1618 {
    int a_cons, b_cons;
    
    public Jstest1618(int x, int z){ //Constructor tem que ter o mesmo nome da classe
        this.a_cons = x;  //this associea a_cons a mesma coisa que variável x
        this.b_cons = z;
    }

    public static void main(String args[]){
        int a, b, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Value 1: ");
        a = scan.nextInt();
        
        System.out.println("Value 2: ");
        b = scan.nextInt();
        
        Jstest1618 objJsTest = new Jstest1618(a, b);
        
        result = objJsTest.a_cons + objJsTest.b_cons; //Aqui estou recuperando dados de uma variável fora de escopo com o objeto constructor
        
        System.out.println("The result is " + result); //Resultado final
        scan.close(); 
    }
}


///////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//      Sobrecarga         /
//                         / 
////////////////////////////

/**
 *
 * @author brandon
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    int a, b, c;
    public Jstest1618(int a, int b){  //SOMA
        this.a = a;
        this.b = b;
    }
    
    public Jstest1618(int a, int b, int c){ //Aqui serve pra deixar o código mais limpo, organizado e seguro por exemplo melhor sempre forçar 3x valores Jstest1618(int a, int b, int c) ou Jstest1618(int a, int b) deixar mais flexível ?
        
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public int CalcAB(){ //Nome do método 
        return(a + b);   // Aqui um método para calcular o que precisa
    }
    
    public int CalcABC(){
        return((a + b) * c);
    }
   
    
    public static void main(String args[]){
        int a, b, c, choose;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos valores para calcular ? 2 ou 3");
        choose = scan.nextInt();
        
            if(choose == 2){
                
                System.out.println("Value1:");
                a = scan.nextInt();

                System.out.println("Value2:");
                b = scan.nextInt();
                
                Jstest1618 objJsAB = new Jstest1618(a, b);
                System.out.println("The resultAB is " + objJsAB.CalcAB());
                
            }else if(choose == 3){
                
                System.out.println("Value1:");
                a = scan.nextInt();

                System.out.println("Value2:");
                b = scan.nextInt();
                
                System.out.println("V4alue3:");
                c = scan.nextInt();
                
                Jstest1618 objJsABC = new Jstest1618(a, b, c);
                System.out.println("The resultABC is " + objJsABC.CalcABC());
            }else{
                System.out.println("Opção inválida");
            }
    scan.close();  // importante fechar o Scanner
    }
}


/////////////////////////////////////////////////////////////////


//OR


package br.com.packet1.jstest1618;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String[] args){
        PeopleDB obj = new PeopleDB();
        obj.run();
    }
}

class People{  //Classe Objeto
    
    private String nome;
    private int idade;
    private double altura;
    
        public People(String nome, int idade, double altura){
            
            this.nome   = nome;
            this.idade  = idade;
            this.altura = altura;
        }
        
        public String getNome(){
        
            return nome;
        }
        
        public int getIdade(){
        
            return idade;
        }
        
        public double getAltura(){
        
            return altura;
        }   
}

class PeopleDB {

    public void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas?");
        int n = scan.nextInt();

        People[] arr = new People[n];
        double soma = 0;

        for(int i = 0; i < n; i++){

            scan.nextLine(); // limpar buffer

            System.out.println("Nome:");
            String nome = scan.nextLine();

            System.out.println("Idade:");
            int idade = scan.nextInt();

            System.out.println("Altura:");
            double altura = scan.nextDouble();
           
            arr[i] = new People(nome, idade, altura);
            soma += arr[i].getAltura();
            System.out.println(
                    "Name: " + arr[i].getNome() + "\n" +
                    "Idade: " + arr[i].getIdade() + "\n" +
                    "Altura: " + arr[i].getAltura()
            );
        }

        System.out.println("Média: " + (soma / n));
    }
}
