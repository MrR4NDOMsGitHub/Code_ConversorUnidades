package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Gabella Ocampo (JEFE)
 *         Beatriz Feijoo Tain
 *         Cristina Martínez Ferro
 *         Adrián Aguiar González
 */

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String resp;

        String[] opciones = {"Lonxitude", "Potencia", "Temperatura", "Salir"};
        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp) {
                case "Lonxitude":
                    Lonxitude Obj = new Lonxitude();
                    Obj.MainLonx();
                    break;
                case "Potencia":
                    Potencia w = new Potencia();
                    w.MainPot();
                    break;
                case "Temperatura":
                    Temperatura temp = new Temperatura();
                    temp.MainTemp();
                    break;

            }
        } while (!resp.equals("Salir"));

    }
}
