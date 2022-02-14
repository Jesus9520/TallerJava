    import java.util.Scanner;
    public class CompararNumerosPorConsola {
        //Método que valida si una cadena es numerica
        public static boolean isNumeric(String cadena){
            try {
                Integer.parseInt(cadena);
                return true;
            } catch (NumberFormatException nfe){
                return false;
            }
        }

        public static void main(String[] args) {
            String num_1, num_2;
            do{
                System.out.println("Ingrese un número");
                Scanner imprimirNumero = new Scanner(System.in);
                num_1 = imprimirNumero.next();
            } while (!isNumeric(num_1));
            int n1 = Integer.parseInt(num_1);

            do {
                System.out.println("ingrese el segundo número");
                Scanner imprimirNumero2 = new Scanner(System.in);
                num_2 = imprimirNumero2.next();
            } while (!isNumeric(num_2));

            int n2 = Integer.parseInt(num_2);

            if (n1 > n2) {
                System.out.println("el primer número es mayor que el segundo");
            } else if (n2 > n1) {
                System.out.println("el segundo numero es mayor que el primero");
            } else {
                System.out.println("los numeros ingresados son iguales ");
            }

        }
    }


