
/* 
1 = Entra com o salário do cliente, mostrar o valor deduzido as taxas
e em seguida faça o cálculos de acordo com as porcentagens para o
aumento do salário, e em seguida adicione ao salário e depois
mostre o valor do aumento

*/

package com.mycompany.project1;

import com.mycompany.project2.CalcSalary;
import java.util.Scanner;

public class JavaTest1618 {
    public static void main(String args[]){
        double result;
        double off;
        
        CalcSalary objCalcSalary = new CalcSalary();
        result = objCalcSalary.Salary();
        off  = result - (objCalcSalary.getValueGross() - objCalcSalary.getValueTax());
        System.out.println("O valor do salário ajustado é " + result);
        System.out.println("O valor em dinheiro do aumento é " + off);
        
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;
import  java.util.Scanner;

/**
 *
 * @author brandon
 */
public class CalcSalary {
    
    private String Name;
    private double GrossSalary;
    private double Tax;
    private double PorcentageSalary;
    
    //SetValue adicionando dados às variáveis
    
    public void setValues(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.Name = scan.nextLine();
        
        System.out.println("Salary: ");
        this.GrossSalary = scan.nextDouble();
        
        System.out.println("Tax: ");
        this.Tax = scan.nextDouble();
        
        System.out.println("Qual a porcentagem de aumento do salário ? ");
        this.PorcentageSalary = scan.nextDouble();
        
       
    }
    
    //Retornando os Valores das variáveis
    
    public String getValueName(){
        return(Name);
    }
    
    public double getValueGross(){
        return(GrossSalary);
    }
    
    public double getValueTax(){
        return(Tax);
    }
    
    public double getValuePorcentageSalary(){
        return(PorcentageSalary);
    }
    
    //Método Para Cálculo
    
    public double Salary(){
        double total;
        double porcentage;
        double result;
        
        setValues();
        total = getValueGross() - getValueTax();
        System.out.println("\n" + "Nome: " + getValueName() + " Salário líquido " + total + "\n");
        porcentage = (getValueGross() / 100) * getValuePorcentageSalary();
        result = total + porcentage;
        
        return(result);
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

/*

2 = Calcular uma área do triângulo

*/

package com.mycompany.project1;
import java.util.Scanner;

public class JavaTest1618 {

    public static void main(String args[]){
        double areaX;
        double areaY;
        TriangleData triangleX = new TriangleData();
        TriangleData triangleY = new TriangleData();
        
        System.out.println("Área do Triângulo X:");
        areaX = triangleX.calculateArea();
        System.out.println("\n");
        
        System.out.println("Área do Triângulo Y:");
        areaY = triangleY.calculateArea();
        System.out.println("\n");
        
        if(areaX > areaY){
            System.out.println("Área do Triângulo X é maior: " + areaX);
        }else{
            System.out.println("Área do Triângulo Y é maior: " + areaY);
        }     
    }

}

class TriangleData {
    
    private double sideA, sideB, sideC;
    
    private void setSides(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }
    
    private double getSideA(){
        return sideA;
    }
    
    private double getSideB(){
        return sideB;
    }
        
    private double getSideC(){
        return sideC;
    }

    public double calculateArea(){
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Digite o valor do lado A: ");
        double x = scan.nextDouble();
    
        System.out.println("Digite o valor do lado B: ");
        double y = scan.nextDouble();
        
        System.out.println("Digite o valor do lado C: ");
        double z = scan.nextDouble();
        
        setSides(x, y, z);
            
        double result = (getSideA() + getSideB() + getSideC()) / 2;
        double area = Math.sqrt(result * (result - getSideA()) * (result - getSideB()) * (result - getSideC()));
        
        
        return area; 
    }
}

//////////////////////////////////////////////////////////////////////////////////////

/*
3 = Criar um programa para um banco que cadastra um novo usuário
em seguida deposita ou saca o valor

*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1.bank;

import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class Bank {

    public static void main(String[] args) {
        AccountBank objBank = new AccountBank();
        objBank.bankOperation();
        
    }
}

class AccountBank {
    public String nome;
    private int conta;
    private double saldo;
    
    //Seta valores
    public void setCadastro(String nome, int conta, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
    
    public void setDeposito(double deposito){
        this.saldo = deposito;
    
    }
    
    //Recupera Valores
    
    public String getNome(){
        return(nome);
    }
    
    public int getConta(){
        return(conta);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    
    public void bankOperation(){
        
        String nome;
        int conta;
        double saldo;
        double deposito;
        
        Scanner scan = new Scanner(System.in);
        int x = 3;
        int y = 3;
        
        try{
            System.out.println("Cadastro de novos clientes: ");
            System.out.println("Nome: ");
            nome = scan.next();

            System.out.println("Conta: ");
            conta = scan.nextInt();

            System.out.println("Saldo: ");
            saldo = scan.nextDouble();
            
            //Adiciona dados e recupera os valores;
            
            setCadastro(nome, conta, saldo);
            nome = getNome();
            conta = getConta();
            saldo = getSaldo();
            
            System.out.println("Seu nome é " + nome + "e sua conta é " + conta + "e seu saldo é " + saldo);
            System.out.println("\n");
            
            //Repetição para depósito
                while(x != 2){
                    System.out.println("Quer fazer algum deposito ? SIM: 1 NÃO: 2");
                    x = scan.nextInt();
                    
                        if(x != 2){

                            System.out.println("Qual o valor do depósito ?");
                            deposito = scan.nextDouble() + getSaldo();
                            setDeposito(deposito);

                            System.out.println("Nome: " 
                                                + nome 
                                                + " Conta " 
                                                + conta 
                                                + "\n" 
                                                + " o seu saldo agora é " 
                                                +  getSaldo()
                                                + "\n"
                            );
                        }   
                x = x + 0;

                }
                
                while(y != 2){
                    System.out.println("\n Quer fazer algum saque ? SIM: 1 NÃO: 2 ");
                    y = scan.nextInt();
                    
                        if(y != 2){

                            if( getSaldo() > 0){
                                System.out.println("Qual o valor do saque ?");
                                deposito = getSaldo() - scan.nextDouble();
                                setDeposito(deposito);

                                System.out.println("Nome: " 
                                                    + nome 
                                                    + " Conta " 
                                                    + conta 
                                                    + "\n" 
                                                    + " o seu saldo agora é " 
                                                    + getSaldo()
                                                    + "\n"
                                );
                                                    
                            }else{
                                System.out.println("Saldo insuficiente");
                                y = 2;
                            }
                            
                        }
                               
                y = y + 0;
                
                
                }
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}



//////////////////////////////////////////////////////////////////////////////////////






//////////////////////////////////////////////////////////////////

////////////////////////////
//                         / 
//       Array List        /
//                         / 
///////////////////////////


/*
Criar um programa que leia o nome e altura das pessoas
e cálcule a média das alturas, com arrays;

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
        
        Scanner scan = new Scanner(System.in);
        Product[] vect = new Product[3];
        //Product objPro = new Product();
        
            for(int x = 0; x < 2; x++){

                System.out.println("Nome");
                String name  = scan.nextLine();
                System.out.println("Valor");
                double valor = scan.nextDouble();
                scan.nextLine();   // Captura a quebra de linha que não foi pego por Double
                vect[x] = new Product(name, valor);
            
            }
            
            String name = "";
            double sum = 0.0;
            
            for(int y = 0; y < 2; y++){
                name = vect[y].name;
                sum += vect[y].valor;
                
            }
            System.out.println("Meu nome é" + name + "e o valor é " + sum);
    
        
    }
}

class Product{
    public String name;
    public double valor; 
    
        public Product(String name, double valor){
        
            this.name = name;
            this.valor = valor;
                    
        }

//or
        
public class JavaTest1618 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Nome");
                String name  = scan.nextLine();
                System.out.println("Valor");
                double valor = scan.nextDouble();
                String LastName = scan.nextLine();
                System.out.println("My name is " + name + LastName + "e o valor é " + valor);
        
    }
}


//or

/**
 *
 * @author brandon
 */
public class JavaTest1618 {

        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Nome");
            String name  = scan.nextLine();
            
            System.out.println("Valor");
            double value = scan.nextDouble();
            scan.nextLine(); //capturar a quebra de linha e impede o defeito
            
            System.out.println("Produto");
            String product = scan.nextLine(); 
            //Esta linha vai capturar a quebra de linha,
            //deixado pelo nextDouble()
            //e ao capturar a quebra de linha o mesmo finaliza o scan
            
           
            System.out.println("My name is " + name + "the name of produtct " + product + "e o valor " + value);

        }
}

//or

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
            
            Scanner scan = new Scanner(System.in);
            Data[] vect = new Data[2];
            
                for(int x = 0; x < 2; x++){
                    System.out.println("Name: ");
                    String name = scan.nextLine();
                    
                    System.out.println("Value: ");
                    double value = scan.nextDouble();
                    scan.nextLine();
                    
                    vect[x] = new Data(name, value);
                    System.out.println("O produto é  " + vect[x].getProduct() + "e o valor " + vect[x].getValue());
                }
        }
}

class Data{
    private String product;
    private double value;
    
        public Data(String name, double value){

            this.product = name;
            this.value   = value;
        }

        public String getProduct() {
            return product;
        }

        public double getValue() {
            return value;
        }
    

}

/*
Problema "negativos"

Faça um programa que leia um número inteiro positivo N (máximo = 10) 
e depois N números inteiros e armazene-os em um vetor. 
Em seguida, mostrar na tela todos os números negativos lidos.

*/

public class JavaTest1618 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar ?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
            for(int x = 0; x < n; x++){
                System.out.println("Digite um número:  ?");
                arr[x] = scan.nextInt();
            }
            
            System.out.println("Números Negativo: ");
            
            for(int y = 0; y < n; y++){
                if(arr[y] < 0){
                   System.out.println(arr[y]);
                }
            }
    }
}


/*

Problema "soma_vetor"

Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor

*/

public class JavaTest1618 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar ?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int array = 0;
        int media = 0;
        
            for(int x = 0; x < n; x++){
                System.out.println("Digite um número:  ?");
                arr[x] = scan.nextInt();
            }
            
            System.out.print("VALORES: ");
            
                for(int w = 0; w < n; w++){
                    System.out.print(arr[w] + " ");
                }

                    for(int y = 0; y < n; y++){
                        array += arr[y];
                    }
            
            System.out.println("\n" + "SOMA: " + array);
            media = array / n;
            
            System.out.println("MEDIA: " + media);
    
    }
}



/*

Problema "alturas"

Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houveetor

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

//or

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
        PeopleCalc ObjPeopleCalc = new PeopleCalc();
        ObjPeopleCalc.people();
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

class PeopleCalc{

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
        System.out.println("\nQuantidade de Pessoas com menos de 16 anos é " + i);
            
        //Cálcula a média
        
        System.out.print("\nAltura média: ");
        media = soma / n;
        System.out.print(media);

    }

}


/*

Problema "numeros_pares"    

Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.

*/


public class JavaTest1618 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar ?");
        int n = scan.nextInt();
        int i = 0;
        int[] vect = new int[n];
        
            for(int x = 0; x < n; x++){
                System.out.println("Qual número: ");
                vect[x] = scan.nextInt();
            }
            
            System.out.println("Número Par: ");
            for(int y = 0; y < n; y++){
                if(vect[y] % 2 == 0){
                    i += 1;
                    System.out.print(vect[y] + " "); 
                }
            }
            
            System.out.println("\nQuantidade de pares é: " + i);
    }

}



















