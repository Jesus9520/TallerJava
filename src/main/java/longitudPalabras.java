import java.util.Scanner;

public class longitudPalabras {

    public static void main(String[] args) {
        System.out.println("ingrese una frase");
        Scanner imprimirPalabra = new Scanner(System.in);
        String frase = imprimirPalabra.nextLine();
        int numA=0,numE=0,numI=0,numO=0,numU=0;

        for (int i=0; i<frase.length();i++){
            if(frase.charAt(i) == 97){
                numA++;
            }

            if(frase.charAt(i) == 101 ){
                numE++;
            }

            if(frase.charAt(i) == 105 ){
                numI++;
            }

            if(frase.charAt(i) == 111 ){
                numO++;
            }

            if(frase.charAt(i) == 117 ){
                numU++;
            }
        }

        System.out.println("la longitud de la frase es:" + frase.length() + "caracteres");
        System.out.println("el número de vocales a es:" + numA);
        System.out.println("el número de vocales e es:" + numE);
        System.out.println("el número de vocales i es:" + numI);
        System.out.println("el número de vocales o es:" + numO);
        System.out.println("el número de vocales u es:" + numU);

    }
}