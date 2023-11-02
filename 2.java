/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calse1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Calse1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String a;
        a = JOptionPane.showInputDialog("Introduzca el numero para realizar la tabla");     
        int cantidad = Integer.parseInt(a);
        
        int edad[] = new int [cantidad]; // decalracion de la variable 
        for (int i = 0; i < edad.length; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("digite la edad"));
        }
         for (int i = 0; i < edad.length; i++) {
            JOptionPane.showMessageDialog(null, edad[i]);
        }
    }
    
}
