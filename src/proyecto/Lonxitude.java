
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lonxitude {

    public Lonxitude() {
    }
   
    
    public void MainLonx(){
    Scanner tec = new Scanner(System.in);
         String resp;
        
        String[] opciones = {"Transformar Kms a Millas", "Transformar Millas a Kms", "Transformar Millas a Pulgadas","Transformar Pulgadas a Millas","Salir"};
        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp) {
                case "Transformar Kms a Millas":
                    //Lonxitude
                    break;
                case "Transformar Millas a Kms":
                    
                    break;
                case "Transformar Millas a Pulgadas":
                    
                    break;
                case "Transformar Pulgadas a Millas":
                           
                        break;
            }
        } while (!resp.equals("Salir"));
    }
}

