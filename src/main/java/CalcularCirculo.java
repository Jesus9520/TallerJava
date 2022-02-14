import java.util.Scanner;

import static java.lang.Math.*;

public class CalcularCirculo {

    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        String radio;

        do {
            System.out.println("ingrese el radio del circulo");
            Scanner imprimirCirculo = new Scanner(System.in);
            radio = imprimirCirculo.next();
        } while (!isNumeric(radio));

        double r = Double.parseDouble(radio);
        double area = PI * pow(r, 2);

        System.out.println("el area del circulo es: " + area);

    }


}