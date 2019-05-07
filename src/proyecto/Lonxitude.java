
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lonxitude {
   Scanner tec = new Scanner(System.in);
         String resp;
        
        String[] opciones = {"Lonxitude", "Potencia", "", "Salir"};
        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp) {
                case "Lonxitude":
                    //Lonxitude
                    break;
                case "Potencia":
                    
                    break;
                case "":
                    
                    break;
                

            }
        } while (!resp.equals("Salir"));
    
}
