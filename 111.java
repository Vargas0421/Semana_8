package ejercicio.pkg1;
import javax.swing.JOptionPane;
public class Ejercicio1 {

        
        int pedir;
        int mostrar;
        
        public void pPedir(){
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
    

