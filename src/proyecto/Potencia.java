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

                    break;
                case "CV a KW":

                    System.out.println("Introduce un número: ");

                    break;
                case "KW a Ft/Lb":
                    System.out.println("Escribe un numero:");
                    KWaFtLb(tec.nextDouble());

                    break;
                case "Ft/Lb a KW":

                    break;
            }
        } while (!resp.equals("Salir"));
    }
    public void KWaFtLb(double valor){
        double res=valor*737.562149;
        System.out.println("El resultado de la conversion es: "+res);
    }
}
