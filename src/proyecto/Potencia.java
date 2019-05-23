package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Potencia {

    public Potencia() {
    }

    public void MainPot() {
        Scanner tec = new Scanner(System.in);

        String resp;
        String resp2;

        String[] opciones = {"Vatio", "KW", "CV", "CF", "MW", "Pé/Libra", "Salir"};

        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione valor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

            if (resp.equals("Salir")) {
                break;
            }

            System.out.println("Introduce " + resp);

            double valor = tec.nextDouble();

            double base = AvatiosTodo(resp, valor);

            resp2 = (String) JOptionPane.showInputDialog(null, "Seleccione conversion"
                    + ": ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp2) {

                case "Vatio":
                    ConversionFinal(resp2, base);
                    break;

                case "KW":
                    ConversionFinal(resp2, base);
                    break;

                case "CV":
                    ConversionFinal(resp2, base);
                    break;

                case "CF":
                    ConversionFinal(resp2, base);
                    break;

                case "MW":
                    ConversionFinal(resp2, base);
                    break;

                case "Pé/Libra":
                    ConversionFinal(resp2, base);
                    break;

                case "Salir":
                    ConversionFinal(resp2, base);
                    break;
            }

        } while ((!resp.equals("Salir")) || (!resp2.equals("Salir")));

    }


    public Double AvatiosTodo(String resp, double valor) {

        double vatios = 0;

        switch (resp) {

            case "Vatio":
                vatios = valor;
                break;

            case "KW":
                vatios = valor / 1000;
                break;

            case "CV":
                vatios = valor / 735.499;
                break;

            case "CF":
                vatios = valor / 745.7;
                break;

            case "MW":
                vatios = valor * 1000;
                break;

            case "Pé/Libra":
                vatios = valor * 0.7376;
                break;

        }
        return vatios;

    }
    public void ConversionFinal(String resp2, double base) {

        double resultado = 0;

        switch (resp2) {

            case "Vatio":
                resultado = base;
                break;

            case "KW":
                resultado = base * 1000;
                break;

            case "CV":
                resultado = base * 735.499;
                break;

            case "CF":
                resultado = base * 745.7;
                break;

            case "MW":
                resultado = base / 1000;
                break;

            case "Pé/Libra":
                resultado = base  / 0.7376;
                break;
        }
        System.out.println("El resultado de la conversion a " + resp2 + " es: " + resultado);
    }

}

