import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        System.out.println("ingrese un día de la semana");
        Scanner imprimirDiaLaboral = new Scanner(System.in);
        String dia = imprimirDiaLaboral.next();
        dia = dia.toLowerCase();
        switch (dia){

            case "lunes":
                System.out.println("Lunes es un día laboral");
                break;
            case "martes":
                System.out.println("Martes es un día laboral");
                break;
            case "miercoles":
                System.out.println("Miercoles es un día laboral");
                break;
            case "jueves":
                System.out.println("Jueves es un día laboral");
                break;
            case "viernes":
                System.out.println("Viernes es un día laboral");
                break;
            case "sabado":
                System.out.println("Sabado no es un día laboral");
                break;
            case "domingo":
                System.out.println("Domingo no es un día laboral");
                break;
            default:
                System.out.println("ingrese un día de la semana correctamente");

        }
    }
}
