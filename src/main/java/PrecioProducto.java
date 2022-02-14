import java.util.Scanner;

public class PrecioProducto {
    private static boolean isNumeric(String cadena){
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    public static void main(String[] args) {
        String precioArticulo;

        do {
            System.out.println("ingrese el precio del articulo");
            Scanner imprimirPrecio = new Scanner(System.in);
            precioArticulo = imprimirPrecio.next();
        }while(!isNumeric(precioArticulo));

        double r=Double.parseDouble(precioArticulo);
        double precioArtIva= r+(r*0.21);

        System.out.println("el precio final del articulo es: "+ precioArtIva);
    }
}
