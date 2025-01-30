/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion1;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class EVALUACION1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float salario = 0;
        float sem = 0;
        float ivm = 0;
        float cc = 0;

        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "indique su salario"));

        sem = (float) (salario * 0.0925);
        ivm = (float) (salario * 0.0508);
        cc = (float) (sem + ivm);

        JOptionPane.showInputDialog(null, " La empresa debera abonar:" + " " + cc + " " + "por concepto de SEM e IVM");

        
        
        
        
               
        
                
    }
    
}
