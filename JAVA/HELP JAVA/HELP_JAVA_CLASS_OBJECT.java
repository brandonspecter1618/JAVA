
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JsTest1618 {
    public static void main(String[] args){
        Test objTest = new Test();
        objTest.myTest();
    }
}

class Test{

    public void myTest(){
        Scanner scan = new Scanner(System.in);
        
        try{
            int x, y, result;
            System.out.println("Value 1");
            x = scan.nextInt();
            
            System.out.println("Value 2");
            y = scan.nextInt();
            
            result = x + y;
            System.out.println("The result is " + result);
        
        }catch(Exception e){
            System.err.println("Somente números " + e);
        }
    }
}

//OR


package br.com.packet1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        Test objTest = new Test();
        objTest.myTest();
    }
}

class Test{

    public void myTest(){
        JFrame frame = new JFrame();
        try{
            int x, y, result;
            
            x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1"));
            y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2"));
                
            result = x + y;
            JOptionPane.showMessageDialog(frame, "The result is " + result);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Somente números.. " + e);
        }finally{
            frame.dispose();
        }
    }
}


##########################################################
//CONSTRUCTOR 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        int x, y, result;
        Scanner scan = new Scanner(System.in);
        try{
            
            System.out.println("Value 1");
            x = scan.nextInt();
            
            System.out.println("Value 2");
            y = scan.nextInt();
           
            Test objTest = new Test(x, y);
            
            System.out.println("The result is " + objTest.getTest());
        
        }catch(Exception e){
            System.err.println("Somente números " + e);
        }
    }
}

class Test{

    private final int a;  //Variável não pode ser alterada de forma nenhuma. Ela é imutável. 
    private final int b;
    private int result;
    
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getTest(){
        result = this.a + this.b;
        return(result);
    }
}


//or

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        int x, y;
        //Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame();
        try{
            x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1:"));
            y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2:"));
           
            Test objTest = new Test(x, y);
            JOptionPane.showMessageDialog(frame, "The result is " + objTest.getTest());
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Somente números... " + e);
        }finally{
            frame.dispose();
        }
    }
}

class Test{

    private final int a;
    private final int b;
    private int result;
    
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getTest(){
        result = this.a + this.b;
        return(result);
    }
}

///////////////////////////////////////////////////////////////

//CONSTRUCTOR SOBRECARGA


package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        int x, y, z, n;
        Scanner scan = new Scanner(System.in);
  
        try{
            
            System.out.println("Digite quantos números para cálculo: 2 ou 3");
            n = scan.nextInt();
                if(n == 2){
                    System.out.println("Value1: ");
                    x = scan.nextInt();
                    
                    System.out.println("Value2: ");
                    y = scan.nextInt();

                    Test objTest = new Test(x, y);
                    System.out.println("The result is " + objTest.getTestTwo());
                    
                }else if(n == 3){
                    System.out.println("Value1: ");
                    x = scan.nextInt();
                    
                    System.out.println("Value2: ");
                    y = scan.nextInt();
                    
                    System.out.println("Value3: ");
                    z = scan.nextInt();

                    Test objTest = new Test(x, y);
                    System.out.println("The result is " + objTest.getTestThree());
                
                }
        }catch(Exception e){   
            System.err.println("Somente números... " + e);
        }
    }
}

class Test{

    private int a;
    private int b;
    private int c;
    private int result;
    
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public Test(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public int getTestTwo(){
        result = this.a + this.b;
        return(result);
    }
    
    public int getTestThree(){
        result = this.a + this.b + this.c;
        return(result);
    }
}



//OR

package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        int x, y, z, n;
        //Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame();
        try{
            
            n = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite quantos números para cálculo: 2 ou 3"));
                if(n == 2){
                    x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1:"));
                    y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2:"));

                    Test objTest = new Test(x, y);
                    JOptionPane.showMessageDialog(frame, "The result is " + objTest.getTestTwo()); 
                    
                }else if(n == 3){
                    x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1:"));
                    y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2:"));
                    z = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value3:"));

                    Test objTest = new Test(x, y, z);
                    JOptionPane.showMessageDialog(frame, "The result is " + objTest.getTestThree()); 
                
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Somente números... " + e);
        }finally{
            frame.dispose();
        }
    }
}

class Test{

    private int a;
    private int b;
    private int c;
    private int result;
    
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public Test(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public int getTestTwo(){
        result = this.a + this.b;
        return(result);
    }
    
    public int getTestThree(){
        result = this.a + this.b + this.c;
        return(result);
    }
}



########################################################

//Extends é uma forma de reaproveitar todo o código de uma classe em outra, sem precisar reescrever tudo, e sim aproveitar o que tem de melhor nela e usar para coisas a mais

package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        Test2 objTest2 = new Test2();
        objTest2.setValue();
        System.out.println("The result is " + objTest2.getTestExtends());
    }
}

class Test{

    protected int a;
    protected int b;
    protected int result;
    
    public void setValue(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Value1: ");
        this.a = scan.nextInt();

        System.out.println("Value2: ");
        this.b = scan.nextInt();
    }
    
    public int getTest(){
        result = this.a + this.b;
        return(result);
    }
}

class Test2 extends Test{  // Eu estou utilizando toda a estrutura da classe pai Teste para que eu não precise repetir tudo que tem acima na classe pai.
    public int getTestExtends(){
        Scanner scan = new Scanner(System.in);
        int z;  //Aqui eu estou adicionando uma entra a mais para usar o código pai de cima para calcular algo extra
        
        System.out.println("Qual o terceiro valor ?");
        z = scan.nextInt();
        
        result = this.a + this.b + z;
        return(result);
    }
}


########################################################
//Polifirmismo

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {
    public static void main(String[] args){
        Test2 objTest2 = new Test2();
        objTest2.setValue();
        System.out.println("The result is " + objTest2.getTest());
    }
}

class Test{

    protected int a;
    protected int b;
    protected int result;
    
    public void setValue(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Value1: ");
        this.a = scan.nextInt();

        System.out.println("Value2: ");
        this.b = scan.nextInt();
    }
    
    public int getTest(){
        result = this.a + this.b;
        return(result);
    }
}

class Test2 extends Test{  // Eu estou utilizando toda a estrutura da classe pai Teste para que eu não precise repetir tudo que tem acima na classe pai.
    public int getTest(){  //Poliformismo, usar uma função que já existe e modificar ela sem ter que ficar repetindo a mesma coisa sempre. 
        Scanner scan = new Scanner(System.in);
        int z;  //Aqui eu estou adicionando uma entra a mais para usar o código pai de cima para calcular algo extra
        
        System.out.println("Qual o terceiro valor ?");
        z = scan.nextInt();
        
        result = this.a + this.b + z;
        return(result);
    }
}

########################################################





































