
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
                    KmsMillas(tec.nextDouble());
                    break;
                case "Transformar Millas a Kms":
                    
                    break;
                case "Transformar Millas a Pulgadas":
                    
                    break;
                case "Transformar Pulgadas a Millas":   
                    PulgadaMillas();
                    break;
            }
        } while (!resp.equals("Salir"));
    }

    public void KmsMillas(double valor){
        double res;
        res=valor*0.6214;
        System.out.println("El resultado de la conversión es: "+res);

    }
    public void PulgadaMillas(){
        System.out.println("Introduce el valor en pulgadas:");
        Scanner tec = new Scanner(System.in);
        double valor=tec.nextDouble();
        double millas = Math.round((valor/63360)*100)/100;
        System.out.println("El valor de "+valor+" pulgadas son "+millas+" millas");
    
    

    }
}

