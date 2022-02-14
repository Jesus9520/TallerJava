import java.util.Scanner;

public class Conte2 {
    //método que valida si la cadena es numerica
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        String num1, cadenaNum="";

        do {
            System.out.println("ingrese un número");
            Scanner imprimirNumero = new Scanner(System.in);
            num1 = imprimirNumero.next();
        } while (!isNumeric(num1));

        int n1 = Integer.parseInt(num1);

        for (int i=n1; i<=1000;i+=2 ){
            cadenaNum= cadenaNum + String.valueOf(i) + "-";
        }
        System.out.println(cadenaNum);
    }
}