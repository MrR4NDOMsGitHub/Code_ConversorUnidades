package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Temperatura {

    public Temperatura() {
    }

    public void MainTemp() {
        Scanner tec = new Scanner(System.in);
        String resp;

        String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius", "Salir"};
        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp) {
                case "Celsius a Fahrenheit":
                    System.out.println("Dime un número: ");
                    CelsiusAFarenheit(tec.nextDouble());

                    break;
                case "Fahrenheit a Celsius":

                    System.out.println("Introduce un número: ");

                    break;
                case "Celsius a Kelvin":
                    System.out.println("Escribe un numero:");

                    break;
                case "Kelvin a Celsius":

                    break;
            }
        } while (!resp.equals("Salir"));
    }
    public void CelsiusAFarenheit(double centigrados){
        double temperatura=(centigrados*1.8)+32;
        System.out.println("O resultado da conversión e: "+temperatura);
    }
    
}
