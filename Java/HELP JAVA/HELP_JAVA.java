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


##########################################################




// Java Cálculo de Soma

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

##########################################################

//JAVA Condicionamento IF 

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

##########################################################

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

##########################################################

//Lee Dados Digitados

import java.util.Scanner;

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