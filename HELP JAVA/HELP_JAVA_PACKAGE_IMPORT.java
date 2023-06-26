/* 

Como funciona Packet e o Import,

Os pacotes são utilizados para identificação
e separação lógica entre pastas diferente
a fim de ter uma organização melhorada no código


Quanto ao import, é utlizado para obter as classes
de um package.

import br.com.mycompany."package"."class";

import br.com.mycompany.packet1.test1;
*/

//////////////////////////////////////////////////////////////////////
 // File test1

/*
 *
 * @author hepta.brendo.p
 */

package br.com.mycompany.packet1;
public class test1 {  
        public String a = "hello";
}


//File test2
package br.com.mycompany.packet2;

import br.com.mycompany.packet1.test1;

/**
 *
 * @author hepta.brendo.p
 */
public class test2 {
    public static void main(String args[]){
        String a;
        test1 objT = new test1();
        a = objT.a;
        System.out.println(a);
    }
    
}


/////////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author hepta.brendo.p
 */

//File Name JavaTest.java

package com.specter.javacourse;
import com.specter.javacourse2.JavaTest2;
import javax.swing.JOptionPane;

public class JavaTest {
   public static void main(String args[]){
       int rsTest2;
       JavaTest2 objJavaTest2 = new JavaTest2();
       rsTest2 = objJavaTest2.getResult();
       
       try{
           JOptionPane.showMessageDialog(null, "O resultado final é " + rsTest2);
           System.out.println("O resultado final é " + rsTest2);
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
}

//File Name JavaTest2.java


package com.specter.javacourse2;

/**
 *
 * @author hepta.brendo.p
 */
public class JavaTest2 {
    public int getResult(){
        int a, b, rs;
        a   = 34;
        b   = 11;
        rs  = (a + b) * 2;
        return(rs);
    }
}




/////////////////////////////////////////////////////////////////////////////////

package br.com.mycompany.packet1;

/**
 *
 * @author hepta.brendo.p
 */
public class test1 {  
    
    public static void hi(int a, int b){
        int c = a;
        int d = b;
        int result = c + d;
            System.out.println(result);
    }
}



package br.com.mycompany.packet2;

import br.com.mycompany.packet1.test1;

/**
 *
 * @author hepta.brendo.p
 */
public class test2 {
    public static void main(String args[]){
        test1 objT = new test1();
        objT.hi(22,35);  
    }
    
}
////