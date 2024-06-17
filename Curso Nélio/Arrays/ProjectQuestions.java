
/* 
1 = Entra com o salário do cliente, mostrar o valor deduzido as taxas
e em seguida faça o cálculos de acordo com as porcentagens para o
aumento do salário, e em seguida adicione ao salário e depois
mostre o valor do aumento

*/


/*

Project 1 Principal este importa uma class advindo do Projeto 2

*/
package com.mycompany.project1;
import  com.mycompany.project2.CalcSalary;

/**
 *
 * @author brandon
 */
public class Salary {
    public static void main(String args[]){
        double resultFuncSalary, off;
        
        CalcSalary objCalcSalary = new CalcSalary();
        resultFuncSalary = objCalcSalary.salary();
        off = resultFuncSalary - (objCalcSalary.getGlossSalary() - objCalcSalary.getTax());
        System.out.println("O valor do salário ajustado é " + resultFuncSalary);
        System.out.println("O valor em dinheiro do aumento é " + off);   
    }  
}

//////////////////Project 1 Principa

//////////////////Project 2 onde os dados serao importados

package com.mycompany.project2;
import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class CalcSalary {
    private String Name;
    private double GlossSalary;
    private double Tax;
    private double PorcentageSalary;
    
    Scanner scan = new Scanner(System.in);
    
    public void setValue(){
    
        //Setar dados na variavel privada
        
        try{
            System.out.println("Qual seu nome ?");
            this.Name = scan.nextLine();

            System.out.println("Qual salario: ");
            this.GlossSalary = scan.nextDouble();

            System.out.println("Desconto: ");
            this.Tax = scan.nextDouble();

            System.out.println("Porcentagem de aumento: ");
            this.PorcentageSalary = scan.nextDouble();
        }catch(Exception e){
            System.out.println("Error is " + e);
        }
        
    }
    
    //Recuperando os dados da variavel
    
    public String getName(){
        return(Name);
    }
    
    public double getGlossSalary(){
        return(GlossSalary);
    }
    
    public double getTax(){
        return(Tax);
    }
    
    public double getPorcentageSalary(){
        return(PorcentageSalary);
    }
    
    
    public double salary(){
        double total;
        double porcentage;
        double result;
        
        try{
            setValue();
            total = getGlossSalary() - getTax();

            System.out.println("Nome: " + getName() + "\n" + "Salario Liquido: " + total + "\n");

            porcentage = (getGlossSalary() / 100) * getPorcentageSalary();
            result = porcentage + total;
            return(result);
        
        }catch(Exception e){
            return(0);
        }
    }
}

//////////////////Project 2 onde os dados serao importados
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



///////////////OR

package com.mycompany.test1;
import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class JavaTest1618 {
    
    public static void main(String args[]){
        BankOperation objBankOper = new BankOperation();
        objBankOper.bankOperation();
    
    }
}

//Classe para cadastrar novos clientes

class Client{

    private String Nome;
    private int conta;
    private double saldo = 0.0;
    
        
        //Set value variable
        public void setValueVariable(String name, int account){
            this.Nome = name;
            this.conta = account;
            
        }
        
        public void setBalance(double balance){
            this.saldo = balance;
        
        }
        
        //Return value variable
        public String getName(){
            return(Nome);
        }
        
        public int getAccount(){
            return(conta);
        }
        
        public double getBalance(){
            return(saldo);
        }
}

//Classe para gerar contas aleatorias

class AccountBank{
    
    private int conta = 0;
    
    public void setConta(int x){
        this.conta = x;
    }
    
    public int getConta(){
        return(conta);
    }
    
    //Conta Aleatoria criada
    public int accountBank(){
        int conta;
        double aleatory;
        
        //Object
        AccountBank objAccountBank = new AccountBank();
        conta = objAccountBank.getConta();

            while(conta < 100000){
                aleatory = Math.random() * 1000000;
                conta = (int)aleatory;
            conta++;
            }
            
            //Seta o valor na variavel
            objAccountBank.setConta(conta);
        return(objAccountBank.getConta());
    }

}

//Class para Operaçao bancaria

class BankOperation{
    private String nome;
    private int conta;
    private double saldo = 0.0;
    private double deposito;
    
        public void bankOperation(){
            int x = 3;
            int y = 3;
            
            try{
                
                Scanner scan = new Scanner(System.in);
                Client objClient = new Client();
                AccountBank objAccount = new AccountBank();

                //Captura o nome
                System.out.println("Qual o seu nome: ");
                nome = scan.nextLine();

                //Captura a conta
                conta = objAccount.accountBank();

                //Adiciona saldo na conta

                    while(x != 2){
                        System.out.println("Quer fazer algum deposito ? SIM: 1 NÃO: 2");
                        x = scan.nextInt();
                            if(x != 2){
                                System.out.println("Valor: ");
                                saldo += scan.nextDouble();
                            }else{

                                x = 2;
                            }
                    }

                    objClient.setBalance(saldo);
                
                
                    while(y != 2){
                        System.out.println("\n Quer fazer algum saque ? SIM: 1 NÃO: 2 ");
                        y = scan.nextInt();
                        
                            if(y != 2){
                                if(objClient.getBalance() > 0){
                                    System.out.println("Valor: ");
                                    double z = scan.nextDouble();
                                    deposito = objClient.getBalance() - z;
                                    objClient.setBalance(deposito);
                                    
                                }else{
                                    System.out.println("Saldo Insuficiente");
                                    y = 2;
                                }
                            }
                    }
                    
                //Adiciona os dados na Classe CLiente
                objClient.setValueVariable(nome, conta);
                

                System.out.println("Nome: " + objClient.getName() + " Conta: " 
                        + objClient.getAccount() + " Saldo " + objClient.getBalance());
            
            }catch(Exception e){
                System.out.println("Error" + e);
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

/**************************************************************************/

//////////////////////////Java Sort Script Logic/////////////////

public class JavaTest1618 {
    public static void main(String[] args){  
//creating an instance of an array  
        int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
        System.out.println("Array elements after sorting:");  
            for (int i = 0; i < arr.length; i++){  
                for (int j = i + 1; j < arr.length; j++){ 
                    int tmp = 0;  
                        if (arr[i] > arr[j]){  
                            tmp = arr[i];  
                            arr[i] = arr[j];  
                            arr[j] = tmp;  
                        }  
                }  
            System.out.println(arr[i]);  
            }  
    }  
} 

/**************************************************************************/


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



/*

Problema "maior_posicao"    

Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero

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
        System.out.println("Quantas números você vai digitar ?");
        int n = scan.nextInt();
        int[] vect = new int[n];
        int position = 0;
        

            for(int x = 0; x < n; x++){
                System.out.println("Digite um número: ");
                vect[x] = scan.nextInt();

            }
            int max = vect[0]; //Base para comparação
            for(int y = 0; y < n; y++){

                if(vect[y] > max){
                    max = vect[y];    //Logica para achar o número maior no array
                } 
            }

            for(int w = 0; w < n; w++){
                if(vect[w] == max){
                    position = w;     // Achar a posição do número maior no vetor
                    break;
                }
            }
            
      
            System.out.println("O maior número é " + max);
            System.out.println("A posição do número no vetor é " + position);
            scan.close();
    }

}


/*

Problema "soma_vetores"  

Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerad

*/


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
        System.out.println("Quantas números você vai digitar ?");
        int n = scan.nextInt();
        int[] vect_A = new int[n];
        int[] vect_B = new int[n];
        int soma = 0;
        
        System.out.println("Digite os valores do vetor A ");
            for(int x = 0; x < n; x++){
                vect_A[x] = scan.nextInt();
            }
            
        System.out.println("Digite os valores do vetor B ");
            for(int y = 0; y < n; y++){
                vect_B[y] = scan.nextInt();
            }
            
        System.out.println("VETOR RESULTANTE: ");
            for(int w = 0; w < n; w++){
                soma = vect_A[w] + vect_B[w];
                System.out.println(soma);
            }
        scan.close();    
    }

}



/*

Problema "abaixo_da_media" 

Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

*/


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
        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();
        double[] vect = new double[n];
        double soma = 0;
        double total;
        
            for(int x = 0; x < n; x++) {
                System.out.println("Digite um número: ");
                vect[x] = scan.nextDouble();
            }
        
            for(int y = 0; y < n; y++) {
                soma += vect[y];
            }

        total = soma / n;
        System.out.println("MÉDIA DO VETOR: " + total);
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
            for(int w = 0; w < n; w++){
                if(vect[w] < total){
                    System.out.println(vect[w]);
                }
            }
        scan.close();      
    }
}



/*

Problema "media_pares"

Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO


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
        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();
        double[] vect = new double[n];
        double soma = 0.0;
        double result = 0.0;

            for(int x = 0; x < n; x++) {
                System.out.println("Digite um número: ");
                vect[x] = scan.nextDouble();
            }
        
            for(int y = 0; y < n; y++) {
                if(vect[y] % 2 == 0){
                    soma += vect[y];
                }
            }
        
            if(result > 0){
                result = soma / n;
                System.out.print("MEDIA DOS PARES = "+ result);
            }else{
                System.out.println("NENHUM NUMERO PAR");
            }

        scan.close();  
    }
}


/*

Problema "mais_velho"

Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.


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
        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();
        scan.nextLine();
        People[] vect = new People[n];
        
            for(int x = 0; x < n; x++) {
                int z = x;
                z += 1;
                System.out.println("Dados da " + z + "a pessoa:");
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Idade: ");
                int idade = scan.nextInt();
                scan.nextLine();
                vect[x] = new People();
                vect[x].setNome(nome);
                vect[x].setIdade(idade);
                
            }
        String nome = "";
        int max = vect[0].getIdade();
        
            for(int y = 0; y < n; y++) {
                if(vect[y].getIdade() > max){
                    nome = vect[y].getNome();
                    max  = vect[y].getIdade();
                }
            }
        System.out.println("PESSOA MAIS VELHA:" + nome);
            
    }
}

class People{

    private String nome;
    private int idade;
    
        //Set Data
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setIdade(int idade){
            this.idade = idade;
        }
        
        //Get Data
        public String getNome(){
            return nome;
        }
        
        public int getIdade(){
            return idade;
        }
}


/*

Problema "aprovados"

Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).


*/

public class JavaTest1618 {

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos serao digitados?");
        int n = scan.nextInt();
        scan.nextLine(); //Captura de quebra de linha
        People[] vect = new People[n];
        
            for(int x = 0; x < n; x++) {
                int z = x;
                z += 1;
                System.out.println("Digite nome, primeira e segunda nota do " + z + "aluno:");
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.println("Notas: ");
                double nota1 = scan.nextDouble();
                double nota2 = scan.nextDouble();
                scan.nextLine();
                vect[x] = new People();
                vect[x].setNome(nome);
                vect[x].setNota(nota1, nota2);
                
            }
        System.out.println("Alunos aprovados");
            for(int y = 0; y < n; y++) {
                double media = ((vect[y].getNota1() + vect[y].getNota2()) / 2);
                    if(media >= 6.0){
                        System.out.println(vect[y].getNome());
                    }
            }
            
        System.out.println("\nAlunos reprovados");    
            for(int y = 0; y < n; y++) {
                double media = ((vect[y].getNota1() + vect[y].getNota2()) / 2);
                    if(media < 6.0){
                        System.out.println(vect[y].getNome());
                    }
            }  
    }
}

class People{

    private String nome;
    private double nota1;
    private double nota2;
    
        //Set Data
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setNota(double nota1, double nota2){
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
        
        //Get Data
        public String getNome(){
            return nome;
        }
        
        public double getNota1(){
            return nota1;
        }
        
        public double getNota2(){
            return nota2;
        }
        
}