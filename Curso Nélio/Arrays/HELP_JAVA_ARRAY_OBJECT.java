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

//Exemplo 2

































