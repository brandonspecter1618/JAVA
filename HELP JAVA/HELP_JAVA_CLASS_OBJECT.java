//CLASS AND OBJECT

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
import java.util.Scanner;

public class JavaTest {
	
	private int number;
	
	public JavaTest(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		JavaTest myObj = new JavaTest(10);
		JavaTest myObj2  = new JavaTest(68);
		
		System.out.println(myObj.getNumber());
		System.out.println(myObj2.getNumber());
	}
}

#########################################################

//import java.util.Scanner;
public class javaTest {
	
	Scanner input = new Scanner(System.in);
	int x;
	
	public static void main(String[] args) {
		
		int result;
		Scanner input = new Scanner(System.in);
		javaTest objInp1 = new javaTest();
		javaTest objInp2 = new javaTest();
		
		
		System.out.println("Value1");
		objInp1.x = input.nextInt();
		
		System.out.println("Value2");
		objInp2.x = input.nextInt();
		
		result = objInp1.x + objInp2.x;
		
		
		System.out.println(result);
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



































