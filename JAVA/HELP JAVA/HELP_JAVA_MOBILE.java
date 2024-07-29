/*Class with Java*/

/*Class with Java*/

import java.util.Scanner;
public class javaTest {
    public static void main(String[] args){
       int total;
       javaTestExt  obj  = new javaTestExt();
       javaTestExt2 obj2 = new javaTestExt2();
       obj.a = 66;
       obj.b = 88;
       obj2.c = 10;
       obj2.d = 20;
        
       total = (obj.a + obj.b) * (obj2.c + obj2.d);
       System.out.println(total);
    }
}

class javaTestExt{
    public int a;
    public int b;
}

class javaTestExt2{
    public int c;
    public int d;
}



#############################

import java.util.Scanner;
public class javaTest {
    public static void main(String[] args){
        int total;
        Scanner input  = new Scanner(System.in);
        javaTest2 obj  = new javaTest2();
        javaTest3 obj2 = new javaTest3();
        int a = obj.a  = input.nextInt();
        int b = obj.b  = input.nextInt();
        int c = obj2.c = 10;
        int d = obj2.d = 10;
        
        total = (a * b) + (c + d);
        System.out.println(total);
    }
}

class javaTest2{
    public int a;
    public int b;
}

class javaTest3{
    public int c;
    public int d;
}

###############################

import java.util.Scanner;

public class javaTest{

    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       jsTest obj = new jsTest();
       System.out.println("Value 1:");
       int a = obj.a = input.nextInt();
        
       System.out.println("Value 2:");
       int b = obj.b = input.nextInt();
       
       int result = a + b;
       System.out.println("The result is " + result);
       
       obj.method();
        
    }
}

class jsTest{
    
    int a;
    int b;
    
    void method(){
        System.out.println("Hello Baby");
    }
}


###############################

import java.util.Scanner;

public class javaTest{

    public static void main(String[] args){
       jsMethod obj = new jsMethod();
       obj.method();        
    }
}

class jsTest{
    
    int a;
    int b;
    
}

class jsMethod {
    public void method(){
        Scanner input = new Scanner(System.in);
        jsTest objJs = new jsTest();
        int a = objJs.a = input.nextInt();
        int b = objJs.b = input.nextInt();
        int result = a + b;
        System.out.println("The result is " + result);
    }
}

################################

import java.util.Scanner;
public class jsTest {
    public static void main(String args[]){
      
       GetBus objGetBus = new GetBus();
       int total = objGetBus.getBus();
       System.out.println("The result is " + total);
    }
    
}

class Bus{
    int a;
    int b;
    int total;
    
    				Bus(int i, int l){
        
       				this.a = i;
          this.b = l;
       }
}

class SetBus{
    public int a;
    public int b;
    void setBus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Value 1: ");
        a = input.nextInt();
        
        System.out.println("Value 2: ");
        b = input.nextInt();
        Bus objBus = new Bus(a, b);
        
        a = objBus.a;
        b = objBus.b;
    }
}

class GetBus{
   	public int x;
   public int z;
   public int result;
   			int getBus(){
        SetBus objSetBus = new SetBus();
        objSetBus.setBus();
        x = objSetBus.a;
        z = objSetBus.b;
        result = x + z;
        return(result);
    }
}


################################

//Class Extends and Variable Private

import java.util.Scanner;
public class jsTest{
    
    public static void main(String args[]){
        int c;
        GetValue objGet = new GetValue();
        c = objGet.getValue();
        System.out.println(c);
        
        
    }
    
}

class Test {
    
    private int a;
    private int b;
    
       int setValue(int x){
           this.a = x;
           return (a);
       }
    
       int setValue2(int z){
           this.b = z;
           return (b);
       }
}

class GetValue extends Test{
    int getValue(){
       int l = setValue(88);
       int m = setValue2(67);
       int total = l + m;
       return(total);
    }
}

###############################

import java.util.Scanner;
public class jsTest{
    
    public static void main(String args[]){   
        int total;
        GetValue objGet = new GetValue(56, 88);
        total = objGet.result;
        System.out.println(total);
    }
    
}

class Data{
    private int a;
    private int b;
    
       int setValue(int x){
           this.a = x;
           return(a);
       }
    
       int setValue2(int z){
           this.b = z;
           return (b);
       }
}

class GetValue extends Data{
    
    int e;
    int f;
    int result;
    
      GetValue(int c, int d){
        
        e = setValue(c);
        f = setValue(d);
        result = e + f;
    }
}



###############################
/*Utilizando super()*/
import java.util.Scanner;
public class jsTest{
    
    public static void main(String args[]){   
        int totally;
        GetValue objGet = new GetValue(78,99);
        totally = objGet.result;
        System.out.println(totally);
    }
    
}

class Data{
    int a;
    int b;
    
    Data(int x, int y){
        this.a = x;
        this.b = y;   
    }
}

class GetValue extends Data{
    int result;
        GetValue(int l, int m){
        super(l,m);
        result = a + b;
    }
    
   
}


//Or


import java.util.Scanner;
public class jsTest{
    
    public static void main(String args[]){   
        int totally;
        GetValue objGet = new GetValue(78,99);
        totally = objGet.result;
        System.out.println(totally);
    }
    
}

class Data{
    int a;
    int b;
    int result;
    
    Data(int x, int y){
        this.a = x;
        this.b = y;
        this.result = a + b;
    }
}

class GetValue extends Data{
    int res;
        GetValue(int l, int m){
        super(l,m);
        res = result;
    }
}


###############################

import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        int totally;
        GetValue objGet = new GetValue(67, 89);
        totally = objGet.result;
        System.out.println(totally);
    }   
}

class Data{
    private int a;
    private int b;
    
        Data(int args1, int args2){
        
            this.a = args1;
            this.b = args2;
        }
        
        int getValue(){return(a);}
        int getValue2(){return(b);}
}

class GetValue extends Data{
    int result;
    
    GetValue(int inp1, int inp2){
        super(inp1, inp2);
        result = getValue() + getValue2();
    }
    
}

################################

//Sobreposição de métodos 

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int result;
        GetValue objGet = new GetValue(78,89,90);
        objGet.show();
    }  
}

class Data{
    int a;
    int b;
       Data(int x, int z){
          this.a = x;
          this.b = z;
       }
    
       void show(){
          System.out.println(a + "\n" + b);
       }
}

class GetValue extends Data{
    int total;
    GetValue(int l, int m, int n){
        super(l, m);
        total = n;
    }
    
    void show(){
        System.out.println(total);
    }
}


//or with super();

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int result;
        GetValue objGet = new GetValue(78,89,90);
        objGet.show();
    }  
}

class Data{
    int a;
    int b;
       Data(int x, int z){
          this.a = x;
          this.b = z;
       }
    
       void show(){
          System.out.println(a + "\n" + b);
       }
}

class GetValue extends Data{
    int total;
    GetValue(int l, int m, int n){
        super(l, m);
        total = n;
    }
    
    void show(){
        super.show();
    }
}


################################

//final usado para impedir que uma superclass seja modificada


import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int result;
        GetValue objGet = new GetValue(67,89,99);
        objGet.getData();
        
    }  
}

class Data{
    private int a;
    private int b;
       Data(int x, int z){
          this.a = x;
          this.b = z;
       }
    
       final void getData(){
           System.out.println(a + b);
       }
    
}

class GetValue extends Data{
    int k;
    GetValue(int l, int m, int n){
        super(l,m);
        k = n;
    }
    
    void getData(){
        System.out.println(k);
    }
    
     
}

################################


/*OR*/

/*Interface With Extends*/

import java.util.Scanner;

interface Imain{
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
}

interface Emain extends Imain{
    int c = 10;
}

public class Main {
    public static void main(String args[]){
        int totally;
        Data objData = new Data();
        totally = objData.getValue();
        System.out.println(totally);
        
    }
       
}

class Data implements Emain{
    int result;
    
    int getValue(){
        result = a + b + c;
        return(result);
    }
    
}


###############################

/*Sobrecarga  De Constructor*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int a;
        int b;
        MyClass objMyClass  = new MyClass(67);
        MyClass objMyClass2 = new MyClass(55, 11);
        
        a = objMyClass.x;
        b = objMyClass2.result;
        System.out.println(a);
        System.out.println(b);
    }   
}

class MyClass{
    
    int x;
    int result;
    
    MyClass(int i){
        this.x = i;
    }
    
    MyClass(int y, int z){
        this.x = y;
        result = x + z;
        
    }
}

################################

/*Arguments Variable*/

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        varArgs(10,20,30);
    }
    static void varArgs(int ... z){
        int result;
        result = z[0] + z[1];
        System.out.println(result);
    }

}

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        varArgs(10,20,30);
    }
    static void varArgs(int ... z){
        int result;
        result = z[0] + z[1];
        System.out.println(result);
    }

}

//or

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        int totally = varArgs(10,20,30);
        System.out.println(totally);
    }
    static int varArgs(int ... z){
        int result;
        result = z[0] + z[1];
        return(result);
    }

}

//or

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
       Data objData = new Data();
       objData.setValue(33,89);
    }

}

class Data{
    
    static void setValue(int ... z){
        int a;
        a = z[0] + z[1];
        System.out.println(a);
    }
}

//Or Example

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        int e, f;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value 1:");
        e = scan.nextInt();
        
        System.out.println("Value 1:");
        f = scan.nextInt();
        
        GetValue objGet = new GetValue();
        objGet.getValue(e,f);
    }
}

class Data{
    
    int a;
    int b;
    
        void setValue(int ... z){
            this.a = z[0];
            this.b = z[1];
        }  
}

class GetValue extends Data{
    int result;
    void getValue(int ... x){
        setValue(x[0], x[1]);
        result = a + b;
        System.out.println("The result is " + result);
    }
}

################################

//Super & Args Variable

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int total;
        GetValue objGet = new GetValue(55,99);
        total = objGet.result;
        System.out.println(total);
    }
}

class Data{
    int a;
    int b;
    
    Data(int ... x){
        this.a = x[0];
        this.b = x[1];
    }    
}

class GetValue extends Data{
     int result;
     GetValue(int ... c){
        super(c[0], c[1]);
        result = a + b;
    }
}









