package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lonxitude {

    public Lonxitude() {
    }

    public void MainLonx() {
        Scanner tec = new Scanner(System.in);

        String resp;
        String resp2;

        String[] opciones = {"KMS", "Metros", "Cms", "Pulgadas", "Yardas", "Pés", "Millas", "Millas náuticas", "Salir"};

        do {
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione valor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

            if (resp.equals("Salir")) {
                break;
            }

            System.out.println("Introduce " + resp);

            double valor = tec.nextDouble();

            double base = AmetrosTodo(resp, valor);

            resp2 = (String) JOptionPane.showInputDialog(null, "Seleccione conversion"
                    + ": ", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp2) {

                case "KMS":
                    ConversionFinal(resp2, base);
                    break;

                case "Metros":
                    ConversionFinal(resp2, base);
                    break;

                case "Cms":
                    ConversionFinal(resp2, base);
                    break;

                case "Pulgadas":
                    ConversionFinal(resp2, base);
                    break;

                case "Yardas":
                    ConversionFinal(resp2, base);
                    break;

                case "Pés":
                    ConversionFinal(resp2, base);
                    break;

                case "Millas":
                    ConversionFinal(resp2, base);
                    break;

                case "Millas náuticas":
                    ConversionFinal(resp2, base);
                    break;
            }

        } while ((!resp.equals("Salir")) || (!resp2.equals("Salir")));

    }

    public Double AmetrosTodo(String resp, double valor) {

        double metros = 0;

        switch (resp) {

            case "KMS":
                metros = valor * 1000;
                break;

            case "Metros":
                metros = valor;
                break;

            case "Cms":
                metros = valor / 100;
                break;

            case "Pulgadas":
                metros = valor / 39.37;
                break;

            case "Yardas":
                metros = valor / 1.094;
                break;

            case "Pés":
                metros = valor / 3.281;
                break;

            case "Millas":
                metros = valor * 1609.344;

                break;

            case "Millas náuticas":
                metros = valor * 1852;
                break;
        }
        return metros;

    }

    public void ConversionFinal(String resp2, double base) {

        double resultado = 0;

        switch (resp2) {

            case "KMS":
                resultado = base / 1000;
                break;

            case "Metros":
                resultado = base;
                break;

            case "Cms":
                resultado = base * 100;
                break;

            case "Pulgadas":
                resultado = base * 39.37;
                break;

            case "Yardas":
                resultado = base * 1.094;
                break;

            case "Pés":
                resultado = base * 3.281;
                break;

            case "Millas":
                resultado = base / 1609.344;

                break;

            case "Millas náuticas":
                resultado = base / 1852;
                break;
        }
        System.out.println("El resultado de la conversion a " + resp2 + " es: " + resultado);
    }

}
