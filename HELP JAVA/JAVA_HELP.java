
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

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int total;

        
        System.out.println("Número 1: ");
        a = input.nextInt();

        System.out.println("Número 2: ");
        b = input.nextInt();

        total = a + b;

        System.out.println("Valor final é" + total);
             
    };
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
        
            int a;
            int b;
            int result; 

            a = 18;
            b = 77;

            result = a + b;
        
        System.out.print("O resultado final é " + result);
        System.out.println("Hello Baby");
    }
}

//or

public class javaTest {

    public static void main(String[] args){
        byte a = 45;
        byte b = 66;
        int result = a + b;

        System.out.println(result);

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
        
            int a;
            int b;

            a = 18;
         
                if(a < 100) {
                    System.out.println("A menor que 100");
                }else{
                    System.out.println("A maior que 100");
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
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Value A: ");
		a = input.nextInt();
		
		System.out.println("Value B: ");
		b = input.nextInt();
		
		int func = myFunction(a, b);
		
        System.out.println(func);
	
	}
	
	public static int myFunction(int a, int b) {
		int[] array = {a, b};
		int result = array[0] + array[1];
		return(result);
	}
}

//or

public class javaTest {
	
	public static void main(String[] args){
		 myMethod2();
	}	
	
	public static void myMethod2(){
		int[] arr = {82, 77};
		int result;
		
		result = arr[0] + arr[1];
		System.out.println(result);
	}
}

//or

//import java.util.Scanner;
public class javaTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double inp1 = myMethod(35.65, 77.76);
		System.out.println("The result is " + inp1);
	}
	
	public static double myMethod(double a, double b) {
		double result = a + b;
		return(result);
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
        int[] arr = new int[100];
        int x, result;    
            try {
                for(x = 0; x < 51; x++){
                    arr[x] = x;
                }
                
                result = arr[10] + arr[20];
                System.out.println(result);
                
            }    
            catch(Exception e){
                System.out.println(e);
            }
    }
}

//import java.util.Scanner;

public class javaTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String [] car = {"Volvo", "Ferrari", "BMW", "lamb"};

        System.out.println(car[0]);

    }
}

//or

//import java.util.Scanner;
public class javaTest {
	
	public static void main(String[] args){
	 
	   Scanner input = new Scanner(System.in);
	   int [] a = {55};
	   int [] b = {77};
	   int result;
	   
	   result = a[0] + b[0];
	   
	   
	   System.out.println(result);

	}	
}

//or

//import java.util.Scanner;
public class javaTest {
	
	public static void main(String[] args){
	 
	   Scanner input = new Scanner(System.in);
	   int inp1 = input.nextInt();
	   int inp2 = input.nextInt();
	   
	   int [] a = {inp1};
	   int [] b = {inp2};
	   int result;
	   
	   result = a[0] + b[0];
	   
	   
	   System.out.println(result);

	}	
}


//or

//import java.util.Scanner;
public class javaTest {
	
	public static void main(String[] args){
	 
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Value 1: ");
	   int inp1 = input.nextInt();
	   
	   System.out.println("Value 2: ");
	   int inp2 = input.nextInt();
	   
	   int [] arr = {inp1, inp2};
	   arr[0] = 20;
	   int result;
	   
	   result = arr[0] + arr[1];
	  
	   System.out.println(result);
	}	
}

//Project Randomic Music with Java Array + Random

package com.mycompany.project1;

import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author brandon
 */
public class JavaTest1618 {

    public static void main(String args[]){
        Random aleatory = new Random();
        int playListMusic = 50;
        int a;

        int[] arr = new int[100];
        int result;
        
        try{
            for(int x = 0; x <= playListMusic; x++){
               arr[x] = x;
            }
         
            for(int y = 0; y <= 10; y++){
                a = aleatory.nextInt(playListMusic);
                System.out.println("Valor randomic: " + a + "\n");
                result = arr[a] + arr[10];
                JOptionPane.showMessageDialog(null, "The music play: " + result);
                System.out.println(result);
            }   
        }
        
        catch(Exception e){
            System.out.println(e);
        
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

public class JavaTest1618 {
    
    //Constructor
    public JavaTest1618(){
        System.out.println("hello");
    }
    //Constructor
    
    public static void main(String[] args) {
        JavaTest1618 objTest = new JavaTest1618();
        
    }
}

//or

public class JavaTest1618 {
    
    int a, b, result;
    
    //Constructor
    public JavaTest1618(int x, int y){
        this.a = x;
        this.b = y;
        result = a + b;
        System.out.println("Total is " + result);
    }
    //Constructor
    
    public static void main(String[] args) {
        int a, b;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value 1: ");
        a = scan.nextInt();
        
        System.out.println("Value 2: ");
        b = scan.nextInt();
        
        JavaTest1618 objTest = new JavaTest1618(a, b);
        
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