
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
                    System.out.println("Dime un número");
                    MillasPulgadas(tec.nextDouble());
                    break;
                case "Transformar Pulgadas a Millas":
                           
                        break;
            }
        } while (!resp.equals("Salir"));
    }
    
    public void MillasPulgadas(double milla){
        double conversion=milla*63360;
        System.out.println("El número" +milla+" en pulgadas es: " +conversion);
    }
}

