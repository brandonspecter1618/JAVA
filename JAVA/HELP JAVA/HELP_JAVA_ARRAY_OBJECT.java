/*
Criando um Array de Objetos

*/

/////////////////////////////////////////////////////////////////////////////////
//Exemplo 1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
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
        scan.close();
    }
}

///////////////////////////////////////////////////////////////////
//Exemplo 2

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String args[]){
        int a, b;
        Scanner scan = new Scanner(System.in);

        Calc[] objCalc = new Calc[1]; 
 
        System.out.println("Value1: ");
        a = scan.nextInt();

        System.out.println("Value2: ");
        b = scan.nextInt();

        objCalc[0] = new Calc();
        objCalc[0].setCalc(a, b);

        System.out.println("The result is " + objCalc[0].getCalcSoma());
        
               
    }
}

class Calc{   
    int a, b, result;
    
    public void setCalc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getCalcSoma(){
        result = a + b;
        return(result);
    }
}

//OR



package br.com.packet1.jstest1618;


import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String args[]){
        int a, b;
        Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame(); //Crio um objeto Jframe
        frame.setAlwaysOnTop(true);  // utilizo o objeto frame criado acima para forçar a janela sempre aparacer para o usuário, pois se colocasse somente null no JoptionPane, a janela aparece aonde o OS quer, muitas vezes atrás do Netbeans
        
        
        Calc[] objCalc = new Calc[1]; 
 
        //Aqui  showInputDialog(Aparece uma janela para digitar) retornar uma string, logo em seguida eu converto com integer.parseInt()
        a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1: ")); 
        b = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2: "));
        

        objCalc[0] = new Calc();
        objCalc[0].setCalc(a, b);
        
        JOptionPane.showMessageDialog(frame, "The result is " + objCalc[0].getCalcSoma());
        frame.dispose(); //Utilizado pra fechar o Jframe       
    }
}

class Calc{   
    int a, b, result;
    
    public void setCalc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getCalcSoma(){
        result = a + b;
        return(result);
    }
}


/////////////////////////////////////////////////////////////////////

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String args[]){
        int a, b;
        Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame(); //Crio um objeto Jframe
        frame.setAlwaysOnTop(true);  // utilizo o objeto frame criado acima para forçar a janela sempre aparacer para o usuário, pois se colocasse somente null no JoptionPane, a janela aparece aonde o OS quer, muitas vezes atrás do Netbeans
         
 
        System.out.println("Value1: ");
        a = scan.nextInt();

        System.out.println("Value2: ");
        b = scan.nextInt();

        Calc objCalc = new Calc(a, b);

        System.out.println("The result is " + objCalc.getCalcSoma());
        JOptionPane.showMessageDialog(frame, "The result is " + objCalc.getCalcSoma());
        //As vezes a janela aparece atrás da janela do Netbeans. Se minimizar aparece
               
    }
}

class Calc{   
    int a, b, result;
    
    public  Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getCalcSoma(){
        result = a + b;
        return(result);
    }
}


//OR

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String args[]){
        int a, b;
        JFrame frame = new JFrame(); //Crio um objeto Jframe
        frame.setAlwaysOnTop(true);  // utilizo o objeto frame criado acima para forçar a janela sempre aparacer para o usuário, pois se colocasse somente null no JoptionPane, a janela aparece aonde o OS quer, muitas vezes atrás do Netbeans
         
 
        a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2: "));

        Calc objCalc = new Calc(a, b);

        JOptionPane.showMessageDialog(frame, "The result is " + objCalc.getCalcSoma());
        //As vezes a janela aparece atrás da janela do Netbeans. Se minimizar aparece
        frame.dispose(); //Utilizado pra fechar o Jframe       
    }
}

class Calc{   
    int a, b, result;
    
    public  Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getCalcSoma(){
        result = a + b;
        return(result);
    }
}


////////////////////////////////////////////////////////////////////////////////

//////////////
//Exemplo 2 Variante

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
        Scanner scan = new Scanner(System.in);
        int choosen;
        System.out.println("Escolha 1 = + // 2 = - // 3 = * // 4 = /");    
        Calc[] arrCalc = new Calc[1];
        choosen = scan.nextInt();
        
            System.out.println("Value1");
            int a = scan.nextInt();

            System.out.println("Value2");
            int b = scan.nextInt();

            arrCalc[0] = new Calc(a, b);
            
            if(choosen == 1){
                System.out.println("The Result is " + arrCalc[0].CalcAmaisB());
            }else if (choosen == 2){
                System.out.println("The Result is " + arrCalc[0].CalcAmenosB());
            }else if(choosen == 3){
                System.out.println("The Result is " + arrCalc[0].CalcAmultiB());
            }else if(choosen == 4){
                System.out.println("The Result is " + arrCalc[0].CalcADivB());
            }else{
                System.out.println("Comando incorreto");
            }
    scan.close();
    }
}

class Calc{
    int a, b;

    public Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int CalcAmaisB(){
        return(a + b);
    }
    
    public int CalcAmenosB(){
        return(a - b);
    }
    
    public int CalcAmultiB(){
        return(a * b);
    }
    
    public int CalcADivB(){
        return(a / b);
    }
    
}

//OR

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1.jstest1618;


import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hepta.brendo.p
 */
public class Jstest1618 {
    public static void main(String args[]){
        int a, b, choosen;
        JFrame frame = new JFrame(); //Crio um objeto Jframe
        frame.setAlwaysOnTop(true);  // utilizo o objeto frame criado acima para forçar a janela sempre aparacer para o usuário, pois se colocasse somente null no JoptionPane, a janela aparece aonde o OS quer, muitas vezes atrás do Netbeans
        
        choosen = Integer.parseInt(JOptionPane.showInputDialog(frame, "Escolha 1 = + // 2 = - // 3 = * // 4 = /"));
        Calc[] arrCalc = new Calc[1];
        
      
        a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2: "));

        arrCalc[0] = new Calc(a, b);
            
            if(choosen == 1){
                JOptionPane.showMessageDialog(frame, "The Result is " + arrCalc[0].CalcAmaisB());
            }else if (choosen == 2){
                JOptionPane.showMessageDialog(frame, "The Result is " + arrCalc[0].CalcAmenosB());
            }else if(choosen == 3){
                JOptionPane.showMessageDialog(frame, "The Result is " + arrCalc[0].CalcAmultiB());
            }else if(choosen == 4){
                JOptionPane.showMessageDialog(frame, "The Result is " + arrCalc[0].CalcADivB());
            }else{
                System.out.println("");
                JOptionPane.showMessageDialog(frame, "Comando incorreto");
            }
    frame.dispose(); //Utilizado pra fechar o Jframe        
    }
}

class Calc{
    int a, b;

    public Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int CalcAmaisB(){
        return(a + b);
    }
    
    public int CalcAmenosB(){
        return(a - b);
    }
    
    public int CalcAmultiB(){
        return(a * b);
    }
    
    public int CalcADivB(){
        return(a / b);
    }
    
}




////////////////////////////////////////////////////////////////////////////////
//Exemplo 2 - Variante de Array Objeto utilzando GET and SET

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
        int x, n;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Quantos cálculos de soma quer fazer ?");
        n = scan.nextInt();
        Calc[] arrCalc = new Calc[n];
        
            for(x = 0; x < n; x++){
                System.out.println("Value 1: ");
                int a = scan.nextInt();
                
                System.out.println("Value 2: ");
                int b = scan.nextInt();
                
                arrCalc[x] = new Calc();
                arrCalc[x].setCalc(a, b);
                
                System.out.println("The Result is " + arrCalc[x].getCalcAB());
            }
    }
}

class Calc{
    
    private int a, b;
    
    public void setCalc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getCalcAB(){
        return(a + b);
    }
}




////////////////////////////////////////////////////////////////////////////////
//Exemplo 3

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FunctionEmployed objFuncEmployed = new FunctionEmployed();
        objFuncEmployed.myFuncEmployed();  //Objeto vindo da classe FunctionEmployed

    }
}

class FunctionEmployed{
    public void myFuncEmployed(){
        int setId;
        String setName; //Variaveis para receber os valores do teclado
        double setSalary;
        Scanner scan = new Scanner(System.in);
        Employed[] objEmployed = new Employed[4]; //Objeto Array criado a partir da Classe Employed

        for(int x = 0; x < 3; x++){  //EStrutura de repetiçao for cadastro de novos usuarios
            int z = 1 + x;  //Variavel utilizado para variar os numeros de employed para cadastro
            System.out.println("Employed #" + z);
            System.out.println("Id: ");
            setId = scan.nextInt();
            scan.nextLine();  // Utilizado para consumir o valor de "enter" quando o usuario clicar para confirmar os dados

            System.out.println("Name: ");
            setName = scan.nextLine();


            System.out.println("Salary: ");
            setSalary = scan.nextDouble();

            objEmployed[x] = new Employed();   //Inicializando o objeto array
            objEmployed[x].set(setId, setName, setSalary); //Passando os dados para a function set da class Employed como argumento
        }

        System.out.println("List of employees: " + "\n");
        for(int y = 0; y < 3; y++){ //Estrutura de repetiçao utilzada para obter os dados do usuario
            System.out.println(
                            "Id: " + objEmployed[y].getId() + "\n" +
                            "Name: " + objEmployed[y].getName() + "\n" +
                            "Salary " + objEmployed[y]. getSalary());
        }
    }
}

class Employed{
    private int id;
    private String name;
    private double Salary;

    public void set(int id, String name, double Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public int getId(){
        return(id);
    }

    public String getName(){
        return(name);
    }

    public double getSalary() {
        return(Salary);
    }
}




////////////////////////////////////////////////////////////////////////////////
//Exemplo 5 FOR EACH

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FunctionEmployed objFuncEmployed = new FunctionEmployed();
        objFuncEmployed.myFuncEmployed();  //Objeto vindo da classe FunctionEmployed

    }
}

class FunctionEmployed{
    public void myFuncEmployed(){
        int setId;
        String setName; //Variaveis para receber os valores do teclado
        double setSalary;
        Scanner scan = new Scanner(System.in);
        Employed[] objEmployed = new Employed[3]; //Objeto Array criado a partir da Classe Employed

        for(int x = 0; x < 3; x++){  //EStrutura de repetiçao for cadastro de novos usuarios
            int z = 1 + x;  //Variavel utilizado para variar os numeros de employed para cadastro
            System.out.println("Employed #" + z);
            System.out.println("Id: ");
            setId = scan.nextInt();
            scan.nextLine();  // Utilizado para consumir o valor de "enter" quando o usuario clicar para confirmar os dados

            System.out.println("Name: ");
            setName = scan.nextLine();


            System.out.println("Salary: ");
            setSalary = scan.nextDouble();

            objEmployed[x] = new Employed();   //Inicializando o objeto array
            objEmployed[x].set(setId, setName, setSalary); //Passando os dados para a function set da class Employed como argumento
        }

        System.out.println("List of employees: " + "\n");

        //FOR NORMAL

        for(int y = 0; y < 3; y++){ //Estrutura de repetiçao utilzada para obter os dados do usuario
            System.out.println(
                    "Id: " + objEmployed[y].getId() + "\n" +
                            "Name: " + objEmployed[y].getName() + "\n" +
                            "Salary " + objEmployed[y]. getSalary());
        }

        //FOR-EACH

        for(Employed listObj : objEmployed){
            System.out.println(listObj.toString());
        }

        /*
        Para implementar este FOR-EACH, e necessario que dentro da Class Employed
        seja adicionado a funçao toString(), pois por padrao, o mesmo somente
        ira imprimir em listObj o endereço de memoria do objeto em questao
        E nao sua String.
        */

        //FOR-EACH


    }
}

class Employed{
    private int id;
    private String name;
    private double Salary;

    public void set(int id, String name, double Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public int getId(){
        return(id);
    }

    public String getName(){
        return(name);
    }

    public double getSalary() {
        return(Salary);
    }

    public String toString() {
        return("ID: " + id + "\n" + "Name: " + name + "\n" + "Salary: " + Salary + "\n");
    }

    /*

    O método toString() é um método especial em Java que retorna uma representação de string do objeto.
    Ele é herdado da classe Object e é frequentemente sobrescrito para fornecer uma representação mais
    significativa e legível do objeto.

    Quando você utiliza o System.out.println(objeto), o Java internamente chama o método toString() do objeto
    para obter uma string que será impressa no console. Se você não sobrescrever esse método em sua classe,
    ele usará a implementação padrão de Object, que retorna uma representação que inclui o nome da classe e o
    endereço de memória do objeto.

     */
}




































