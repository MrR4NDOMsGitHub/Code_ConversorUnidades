package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Potencia {

    public Potencia() {
    }

    public void MainPot() {
        Scanner tec = new Scanner(System.in);
        String resp;

        String[] opciones = {"KW a CV", "CV a KW", "KW a Ft/Lb", "Ft/Lb a KW", "Salir"};
        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp) {
                case "KW a CV":
                    System.out.println("Dime un número en kw");
                    KWaCV(tec.nextDouble());
                    break;
                case "CV a KW":

                    System.out.println("Introduce un número: ");

                    break;
                case "KW a Ft/Lb":
                    System.out.println("Dime un número");

                    break;
                case "Ft/Lb a KW":

                    break;
            }
        } while (!resp.equals("Salir"));
    }
    public void KWaCV(double KW){
        double conversion=KW*1.34102;
        System.out.println("El número "+KW+" en CV es: "+conversion);
    }
}
