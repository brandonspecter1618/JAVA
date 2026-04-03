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
//EXAMPLE 1

// File test1

/*
 *
 * @author hepta.brendo.p
 */

package br.com.mycompany.packet1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

///////////////////////////////////////////////////////////////////////
//EXAMPLE 2


//PACKET 1 arquivo principal onde a mesma vai importar uma classe externa Calc

package br.com.packet1;
import br.com.packet2.Calc; //Aqui estou puxando uma classe que está em outro pacote
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {

    public static void main(String[] args) {
        int a, b;
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        
        a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2: "));
        
        Calc objCalc = new Calc(a, b); //Aqui estou transformando a classe de outro package em objeto
        
        JOptionPane.showMessageDialog(frame, "The result is " + objCalc.CalcAB()); //Aqui utilizando esse objeto a partir da classe externa.
        
    }
}

//PACKET 2 Aqui é onde está a classe de onde vai ser importado

package br.com.packet2;

/**
 *
 * @author hepta.brendo.p
 */
public class Calc {
    int a, b;
    public Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int CalcAB(){
        int result = a + b;
        return(result);
    }
}

/////////////////////////////////////////////////////////////////////////////////
//EXAMPLE 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.packet1;
import br.com.packet2.Calc;  //Aqui é onde eu vou pegar a classe Externa
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hepta.brendo.p
 */
public class JsTest1618 {

    public static void main(String[] args) {
        int a, b;
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        
        try{
            a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value1: "));
            b = Integer.parseInt(JOptionPane.showInputDialog(frame, "Value2: "));

            Calc objCalc = new Calc();
            objCalc.setCalc(a, b); //Aqui pegando a função set da classe externa

            JOptionPane.showMessageDialog(frame, "The result is " + objCalc.CalcAB());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "ATENÇÃO: DIGITE UM NÚMERO" + "\n" + "Error: " + e);
            
            
        }finally{ //Aqui sempre executa
            
            frame.dispose(); //Utilizado pra fechar o Jframe 
        }        
    }
}


package br.com.packet2;

/**
 *
 * @author hepta.brendo.p
 */
public class Calc {
    int a, b;
    public void setCalc(int a, int b){ //função que vai ser recuperada em outro arquivo
        this.a = a;
        this.b = b;
    }
    
    public int CalcAB(){
        int result = a + b;
        return(result);
    }
}





/////////////////////////////////////////////////////////////////////////////////
