package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Temperatura {

    public Temperatura() {
    }

    public void MainTemp() {
        Scanner tec = new Scanner(System.in);

        String resp;
        String resp2;

        String[] opciones = {"Celsis", "Fahrenheit", "Kelvin", "Rankine", "Delisle", "Newton", "Réamur", "Romer", "Salir"};

        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione valor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

            if (resp.equals("Salir")) {
                break;
            }

            System.out.println("Introduce " + resp);

            double valor = tec.nextDouble();

            double base = ACelsisTodo(resp, valor);

            resp2 = (String) JOptionPane.showInputDialog(null, "Seleccione conversion"
                    + ": ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp2) {

                case "Celsis":
                    ConversionFinal(resp2, base);
                    break;

                case "Fahrenheit":
                    ConversionFinal(resp2, base);
                    break;

                case "Kelvin":
                    ConversionFinal(resp2, base);
                    break;

                case "Rankine":
                    ConversionFinal(resp2, base);
                    break;

                case "Delisle":
                    ConversionFinal(resp2, base);
                    break;

                case "Newton":
                    ConversionFinal(resp2, base);
                    break;

                case "Réamur":
                    ConversionFinal(resp2, base);
                    break;

                case "Romer":
                    ConversionFinal(resp2, base);
                    break;
            }

        } while ((!resp.equals("Salir")) || (!resp2.equals("Salir")));

    }

    public Double ACelsisTodo(String resp, double valor) {

        double Grados = 0;

        switch (resp) {

            case "Celsis":
                Grados = valor;
                break;

            case "Fahrenheit":
                Grados = (valor - 32) * 5 / 9;
                break;

            case "Kelvin":
                Grados = valor - 273.15;
                break;

            case "Rankine":
                Grados = (valor - 491.67) * 5 / 9;
                break;

            case "Delisle":
                Grados = (valor + 100) / 1.5;
                break;

            case "Newton":
                Grados = valor / 0.33;
                break;

            case "Réamur":
                Grados = (5 * valor) / 4;

                break;

            case "Romer":
                Grados = (valor - 7.5) / 0.525;
                break;
        }
        return Grados;

    }

    public void ConversionFinal(String resp2, double base) {

        double resultado = 0;

        switch (resp2) {

            case "Celsis":
                resultado = base;
                break;

            case "Fahrenheit":
                resultado = (base * 9 / 5) + 32;
                break;

            case "Kelvin":
                resultado = base + 273.15;
                break;

            case "Rankine":
                resultado = base * 9 / 5 + 491.67;
                break;

            case "Delisle":
                resultado = (base * 1.5) - 100;
                break;

            case "Newton":
                resultado = base * 0.33;
                break;

            case "Réamur":
                resultado = 4 * base / 5;

                break;

            case "Romer":
                resultado = base * (21 / 40) + 7.5;
                break;
        }
        System.out.println("El resultado de la conversion a " + resp2 + " es: " + resultado);
    }

}
