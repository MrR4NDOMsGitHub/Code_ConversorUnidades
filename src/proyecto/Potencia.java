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
                    CVaKW(tec.nextDouble());

                    break;
                case "KW a Ft/Lb":
                    System.out.println("Dime un número");

                    break;
                case "Ft/Lb a KW":
                    FtLb_To_KW();
                    break;
            }
        } while (!resp.equals("Salir"));
    }


    public void FtLb_To_KW() {
        System.out.println("Introduce el valor:");
        Scanner tec = new Scanner(System.in);
        double valor = tec.nextDouble();
        double millas = Math.round((valor * 0.0014) * 100) / 100;
        System.out.println("El valor de " + valor + " FtLb son " + millas + " KW");

    }

    public void CVaKW(double num) {
        double KW = num * (0.7457);
        System.out.println("El numero " + num + " en KW es " + KW);
    }


    public void KWaCV(double KW){
        double conversion=KW*1.34102;
        System.out.println("El número "+KW+" en CV es: "+conversion);
    }
}
