import java.util.Scanner;

public class CompararFrases {


    public static void main(String[] args) {

        Scanner imprimirFrase = new Scanner(System.in);

        System.out.println("Digite la primera frase:");
        String cadenaUno = imprimirFrase.nextLine();
        System.out.print("Digite la segunda frase a comparar: ");
        String cadenaDos = imprimirFrase.nextLine();
        if(cadenaUno.equals(cadenaDos))
        System.out.println("Son iguales las dos frases");
        else
            System.out.println("No son iguales");





    }

}





