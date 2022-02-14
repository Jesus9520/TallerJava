import java.util.Scanner;

public class GestionCinematografica {
    public static void main(String[] args) {
        int aux = 0;
        Scanner entrada = new Scanner(System.in);


        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");

            System.out.println("Digite un numero");
            aux = entrada.nextInt();
            if (aux < 1 || aux > 8) {
                System.out.println("OPCIÓN INCORRECTA. Recuerda que solo son validos los numeros del 1 al 8");
            }
        } while (aux != 8);

    }
}
