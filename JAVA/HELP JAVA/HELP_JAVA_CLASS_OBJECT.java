
import java.util.Scanner;

//CLASS AND OBJECT

//Class Simple

public class JavaTest1618 {
    
    public static void main(String args[]){
        Test objTest = new Test();
        objTest.myFunc();
    }
}

class Test{
    public void myFunc(){
        try{
            int x = 58;
            System.out.println(x);
        
        }catch(Exception e){
            System.out.println("Error is: " + "\n" + e);
        }
        
    }
}

##########################################################
//CONSTRUCTOR 

//import java.util.Scanner;
public class javaTest {
	
	int x = 10;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		javaTest myobj = new javaTest();
		System.out.println(myobj.x);
	}
}

//or

//import java.util.Scanner;
package com.mycompany.test1;
import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class JavaTest1618 {
    
    private int x;  

    /*
    Public: Modificador default, pode ser acessado pela mesma classe, classes filhas e outras classes. 
    Private: Pode ser acessado somente pela própria classe. 
    Protected: Pode ser acessado pela mesma classe e classes filhas.
    */
    
    
    // Create a class constructor for the Main class
    public JavaTest1618(int z){  
        this.x = z;
    }
    
    public int getX(){
        return(x);
    }
    
    public static void main(String args[]){
        try{
            int a, b, result;
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Value 1: ");
            a = scan.nextInt();
            
            System.out.println("Value 2: ");
            b = scan.nextInt();
            
            // Create an object of class Main (This will call the constructor)
            JavaTest1618 objTest1 = new JavaTest1618(a);
            JavaTest1618 objTest2 = new JavaTest1618(b);
            
            result = objTest1.getX() + objTest2.getX();
            System.out.println("The result is " + result);
        
        }catch(Exception e){
        
        System.out.println("Error: " + e);
        
        }
    
    }
}


//or

package com.mycompany.test1;
import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class JavaTest1618 {
    
    public static void main(String args[]){
        setValue objSet = new setValue();
        objSet.myFunc();

    }
}

class Dados{
    private int a;
    private int b;
    
    public Dados(int x){
        this.a = x;
    }
    
    public Dados(int y){
        this.b = y;
    }
    
    public int getA(){
        
        return(a);
    }
    
    public int getB(){
        
        return(b);
    }
}

class setValue{

    public void myFunc(){
        try{
            Scanner scan = new Scanner(System.in);
            int a, b ,total;
            
                System.out.println("Value 1: ");
                a = scan.nextInt();

                System.out.println("Value 2: ");
                b = scan.nextInt();
            
                System.out.println(b);
                
                Dados objDados  = new Dados(a);
                Dados objDados2 = new Dados(b);

                total = objDados.getA() + objDados.getB();

                System.out.println("The result is " + total);

        }catch(Exception e){
            System.out.println("Error is " + "\n" + e);

        }
    }
}


########################################################

/**
 *
 * @author hepta.brendo.p
 */

package com.specter.javacourse;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaTest {
	public static void main(String[] args) {
            GetValue objGet = new GetValue();
            int total = objGet.setValue() + objGet.getValue();
            System.out.println(total);
	}
}

class Dados {
	
    public int a;
    public int b;    
}

class SetValue {
    public int setValue(){
        Scanner scan = new Scanner(System.in);
        Dados objData = new Dados();
        System.out.println("Values 1: ");
        objData.a = scan.nextInt();
        
        System.out.println("Values 2: ");
        objData.b = scan.nextInt();
        
        int result = objData.a + objData.b;
        return(result);
    }

}

class GetValue extends SetValue{
    public int getValue(){
        int a = 50;
        int b = 50;
        int result = a + b;    
        return(result);
    }
}


########################################################

/*Constructor Java */

import java.util.Scanner;

public class jsTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int result;
		
		System.out.println("Value 1:");
		a = input.nextInt();
		
		System.out.println("Value 2:");
		b = input.nextInt();
		
		Test objTest = new Test(a, b); //Constructor
        result = objTest.a + objTest.b;
        System.out.println("The result is " + result);
			
	}
}

class Test {
	int a;
	int b;
	
		Test(int x, int z){
			this.a = x;
			this.b = z;
		}
}

########################################################
//Polifirmismo

package jsTest;
import java.util.Scanner;

public class jsTest {
	public static void main(String args[]) {
	    SetValue objSet = new SetValue();
	    objSet.getValue();
		
	}
}

class Dados {
	private int a;
	private int b;
	
		int setValue(int x) {  
			this.a = x;
			return(a);
		}  //Poliformismo
		
		int setValue(int z) {
			this.b = z;
			return(b);
		}
	
}

class SetValue {
	
   int a; int b; int i; int l; int result;
   
       void getValue(){
    	    Scanner input = new Scanner(System.in);
			Dados objDados = new Dados();
			i = input.nextInt();
			l = input.nextInt();
			a = objDados.setValue(i);
			b = objDados.setValue(l);
			result = a + b;
			System.out.println(result);
				
			}
	
}


########################################################
//Class Extends

package jsTest;
import java.util.Scanner;

public class jsTest {
	public static void main(String args[]) {
	    int result;
		SetValue objSet = new SetValue();
	    objSet.a = 23;
	    objSet.b = 67;
	    result = objSet.setValue();
	    System.out.println(result);	
	}
}

class Dados {
	int a;
	int b;
}

class SetValue extends Dados {
	 int total;
	 	int setValue() {
	 		total = a + b;
	 		return(total);
	 	}
	
}

//or

package jsTest;
import java.util.Scanner;

public class jsTest {
	public static void main(String args[]) {
	    int a;
	    int b;
		int result;
		SetValue objSet = new SetValue();
	    a = objSet.setValue(45);
	    b = objSet.setValue(88);
	    result = a + b;
	    
	    System.out.println(result);	
	}
}

class Dados {
	int a;
	int b;
}

class SetValue extends Dados {
	 int total;
	 	int setValue(int x) {
	 		this.a = x;
	 		return(a);
	 	}
	 	
	 	int setValue(int z) {
	 		this.b = z;
	 		return(b);
	 	}
	
}

########################################################



































