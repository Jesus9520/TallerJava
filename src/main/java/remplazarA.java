import java.util.Scanner;

public class remplazarA {
    public static void main(String[] args) {
        String frase="la sonrisa sera la mejor arma contra la tristeza";
        String fraseCambio=frase.replace('a','e');

        System.out.println("ingrese la frase que quiere unir a una cadena");
        Scanner imprimirRemplazar = new Scanner(System.in);
        String cambio = imprimirRemplazar.nextLine();

        System.out.println(fraseCambio +" " +cambio);
    }
}