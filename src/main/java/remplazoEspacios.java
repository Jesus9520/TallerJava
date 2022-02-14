import java.util.Scanner;

public class remplazoEspacios {
    public static void main(String[] args) {
        System.out.println("ingrese una frase");
        Scanner reducirEspacios = new Scanner(System.in);
        String frase = reducirEspacios.nextLine();
        frase= frase.replace(" ","");

        System.out.println(frase);

    }
}
