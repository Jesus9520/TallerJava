import java.util.Scanner;

public class NumeroPositivo {
    //método que valida si una cadena es numerica
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    // método de tipo main que lee de teclado un numero y verifica si es mayor o igual a 0
    public static void main(String[] args) {
        String num;
        do {
            System.out.println("ingrese un número");
            Scanner imprimirNumero = new Scanner(System.in);
            num = imprimirNumero.next();
        }while (!isNumeric(num)||Integer.parseInt(num)<0);

        System.out.println("el número ingresado fue: " + num);
    }
}
