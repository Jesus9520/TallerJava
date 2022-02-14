public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char energetico;
    protected double peso;

    public Electrodomestico() {
        this.color = "Blanco";
        this.energetico = 'F';
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precio, double peso) {
        this.energetico = 'F';
        this.color = "blanco";

        this.precioBase = precio;
        this.peso = peso;
    }

    public Electrodomestico(String color, char consumoEnergetico, double precio, double peso) {

        this.precioBase = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public String getColor() {
        return this.color;
    }

    public char getEnergetico() {
        return this.energetico;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public double getPeso() {
        return this.precioBase;
    }

    // Método comparar colores 
    private void comprobarColor(String color) {
        if (!color.equals("blanco"))
            if (!color.equals("azul"))
                if (!color.equals("negro"))
                    if (!color.equals("gris"))
                        if (!color.equals("rojo"))
                            this.color = "blanco";
    }
    // Metodo comprobar el consumo energetico
    private void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A')
            if (letra != 'B')
                if (letra != 'C')
                    if (letra != 'D')
                        if (letra != 'E')
                            if (letra != 'F')
                                this.energetico = 'F';

    }



}
