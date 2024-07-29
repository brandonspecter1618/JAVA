/*
Criando um Array de Objetos

*/

/////////////////////////////////////////////////////////////////////////////////
//Exemplo 1

public class Main {
    public static void main(String[] args){
        int set_x, set_y, total;
        Scanner scan = new Scanner(System.in);
        Calc[] vect = new Calc[1];  //Obrigado colocar ao menos "1", ou seja, pelo menos uma entrada no array

        System.out.println("Value 1: ");
        set_x = scan.nextInt();

        System.out.println("Value 2: ");
        set_y = scan.nextInt();

        vect[0] = new Calc(set_x, set_y);

        total = vect[0].x + vect[0].y;

        System.out.println("The result is " + total);

    }
}

class Calc{
    int x, y;
        public Calc(int set_x, int set_y){ //Constructor
            this.x = set_x;
            this.y = set_y;
        }

}


////////////////////////////////////////////////////////////////////////////////
//Exemplo 2 - Variante de Array Objeto utilzando GET and SET

public class Main {
    public static void main(String[] args){
        int set_x, set_y, total;
        Scanner scan = new Scanner(System.in);
        Calc[] vect = new Calc[1];  //Obrigado colocar ao menos "1", ou seja, pelo menos uma entrada no array

        System.out.println("Value 1: ");
        set_x = scan.nextInt();

        System.out.println("Value 2: ");
        set_y = scan.nextInt();

        vect[0] = new Calc();
        vect[0].setX(set_x, set_y);

        total = vect[0].getX() + vect[0].getY();

        System.out.println("The result is " + total);

    }
}

class Calc{
    private int x, y;

        public void setX(int set_x, int set_y){
            this.x = set_x;
            this.y = set_y;
        }

        public int getX(){
            return(x);
        }

        public int getY(){
            return(y);
        }

}

////////////////////////////////////////////////////////////////////////////////
//Exemplo 3

public class Main {
    public static void main(String[] args){
        String set_name;
        double set_value;
        Scanner scan = new Scanner(System.in);
        Product[] vect = new Product[1]; //Criando um array de objeto

        System.out.println("Name: ");
        set_name = scan.nextLine();

        System.out.println("Valor: ");
        set_value = scan.nextDouble();

        vect[0] = new Product(set_name, set_value); // Aqui o valor da primeira posiçao

        System.out.println("Name: " +  vect[0].name ); //Recuperaçao do valor da variavel 'name'
        System.out.println("Value: " + vect[0].value); //Recuperaçao do valor da variavel 'value'
    }
}

class Product{
    String name;
    double value;

        public Product(String set_name, double set_value){
            this.name = set_name;
            this.value = set_value;
        }

}

////////////////////////////////////////////////////////////////////////////////
//Exemplo 4

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




































