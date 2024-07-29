
import java.util.Scanner;

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
            c = "Hello Baby Lorena";
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

public class javaTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String txt = input.nextLine();
        System.out.println(txt.indexOf("locate"));
    }
}


//or

//import java.util.Scanner;

public class javaTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        System.out.println(a.length());


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


///////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//  Condicionamento IF     /
//                         / 
///////////////////////////


public class testJava {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Value 1: ");
        int a = scan.nextInt();
        
        try{
            if(a % 2 == 0){
                System.out.println("Este número é par");
            }else{
                    System.out.println("Este número é impar");
            }
        
        }catch(Exception e){
        
            System.out.println("Error: " + e);
        }
    }
}


//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//     Arrow Function      /
//                         / 
///////////////////////////

//import java.util.Scanner;
public class javaTest {
	
    public static void main(String args[]){
      myFunc();
    }
   
    public static void myFunc(){
       Scanner scan = new Scanner(System.in);
       int a, b, result;
       
        try{
           System.out.println("Value 1: ");
           a = scan.nextInt();

           System.out.println("Value 2: ");
           b = scan.nextInt();

           result = myFuncSoma(a, b);
           System.out.println("The result is " + result);
       
        }catch(Exception e){
       
           System.out.println("Error of code is " + e);
        }
    }
   
    public static int myFuncSoma(int a, int b){
       
       int arr[] = {a, b};
       int total = arr[0] + arr[1];
       return(total);
       
    
    //Poderia usar dessa forma também.    
    /*
       
    public static int myFuncSoma(int a, int b){
       
       int arr[] = new int[3];
       int total;
       
       arr[0] = a;
       arr[1] = b;
       total = arr[0] + arr[1];
       return(total);
    }   
       
    */
   }

//or

/**
 *
 * @author brandon
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myproject1;
import java.util.Scanner;
/**
 *
 * @author brandon
 */

public class MyProject {
  
    public static void main(String args[]){
      myFunc();
    }
   
    public static void myFunc(){
       Scanner scan = new Scanner(System.in);
       int a, b, result;
       
        try{
           System.out.println("Value 1: ");
           a = scan.nextInt();

           System.out.println("Value 2: ");
           b = scan.nextInt();

           result = myFuncSoma(a, b);
           System.out.println("The result is " + result);
       
        }catch(Exception e){
       
           System.out.println("Error of code is " + e);
        }
    }
   
    public static int myFuncSoma(int a, int b){
       
       int total = a + b;
       return(total);
   }
}


/////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////

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


//or 

package com.specter.javacourse;

/**
 *
 * @author hepta.brendo.p
 */
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

//or

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

//or

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

//Project Randomic Music with Java Array + Random

package com.mycompany.project1;

import javax.swing.JOptionPane;


/**
 *
 * @author brandon
 */
public class JavaTest1618 {

     public static void main(String[] args){
	 
	Scanner scan = new Scanner(System.in);
        int playList = 500;
        double aleatory;
        int arrMusic[] = new int[1000];
        
        try{
            
            for(int z = 0; z <= playList; z++){
                arrMusic[z] = z;
            }
        
            for(int x = 0; x < 10; x++){
                aleatory = Math.random() * arrMusic[playList];
                System.out.println("Música Aleatória " + (int)aleatory);
                JOptionPane.showMessageDialog(null, "Next Music ?");
            }
        
        }catch(Exception e){
            System.err.println("Error is " + e);
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

public class MyProject {
    int x; //Variável Global
    public MyProject(int y){ //Recuperação do argumento
        x = 5 + y; // Valor 5 dentro do contructor
    }
    public static void main(String args[]){
           MyProject objMyProject = new MyProject(20); //Criação do objeto com argumento 20 
           System.out.println("The number constructor is " + objMyProject.x); 
           //Recuperação do valor
    }
}


//or

public class MyProject {
    int a, b, result;
   
        public MyProject(int x, int y){  
           this.a = x;
           this.b = y;
           result = a + b;
        }
   
   public static void main(String args[]){
       int a = 0, b = 0;
       Scanner scan = new Scanner(System.in);
       MyProject objMyProject = new MyProject(a, b);
       
       System.out.println("Value 1: ");
       a = scan.nextInt();
       
       System.out.println("Value 2: ");
       b = scan.nextInt();
       
       System.out.println("the result is " + objMyProject.result);
   
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
public class JavaTest1618 {
    int a, b, result;
    
    
    public JavaTest1618(int x, int y){
        this.a = x;
        this.b = y;             //Sobrecarga
        result = a + b;
        System.out.println("The result is " + result);
    }
    
    public JavaTest1618(int x, int y, int z){
        this.a = x + z;
        this.b = y;             ////Sobrecarga
        result = a - b;
        System.out.println("The result final is " + result);
    }
    
    public static void main(String[] args) {

        JavaTest1618 objJava = new JavaTest1618(20,8);
    }
}

//TEST

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.brandon.project1;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author brandon
 */
public class JavaTest1618 {

    public static void main(String[] args) {

    }

}

class People{
    
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

class PeopleCalc extends People{

    public void people(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos pessoas serão digitadas ?");
        int n = scan.nextInt();
        double soma = 0.0;
        double media = 0.0;
        int i = 0;
        People[] vect = new People[n];
        scan.nextLine();
        
        //Captura os dados
            
            for(int x = 0; x < n; x++){
                System.out.println("Nome: ");
                String nome = scan.nextLine();
                
                System.out.println("Idade: ");
                int idade = scan.nextInt();
                
                System.out.println("Altura: ");
                double altura = scan.nextDouble();
                scan.nextLine();
                vect[x] = new People(nome, idade, altura);
                soma += vect[x].getAltura();
            }
            
            
        System.out.println("\nMenores de 16 anos: ");
        //Captura pessoas com menos de 16 anos
        
            for(int y = 0; y < n; y++){
                if(vect[y].getIdade() < 16){
                    i += 1;
                    System.out.println(vect[y].getNome());
                }
            }
        //Verifica a quantidade de pessoas com 16 anos
        System.out.println("\nQuantidade de Pessoas com 16 anos é " + i);
            
        //Cálcula a média
        
        System.out.print("\nAltura média: ");
        media = soma / n;
        System.out.print(media);

    }

}