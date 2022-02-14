import java.util.Scanner;

public class PersonaP {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Digite su edad ");
        int edad = entrada.nextInt();
        System.out.println(" Digite la letra segun su sexo: M en caso de ser mujer y H de ser hombre");
        String aux = entrada.nextLine();
        char sexo = entrada.nextLine().toUpperCase().charAt(0);
        System.out.println(" Digite su peso ");
        double peso = entrada.nextDouble();
        System.out.println(" Digite su altura ");
        double altura = entrada.nextDouble();

        Persona const_1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona cont_2 = new Persona(nombre, edad, sexo);
        Persona const_3 = new Persona();

        const_3.setEdad(13);
        const_3.setNombre(nombre);
        const_3.setPeso(95);
        const_3.setAltura(altura);
        const_3.setSexo(sexo);

        cont_2.setPeso(60);
        cont_2.setAltura(altura);

        System.out.println("Es mayor de edad constructor1: " + const_1.mayorEdad());
        System.out.println("Es mayor de edad constructor2: " + cont_2.mayorEdad());
        System.out.println("Es mayor de edad constructor3: " + const_3.mayorEdad());



        byte IMC1 = const_3.calcularIMC();
        byte IMC2 = cont_2.calcularIMC();
        byte IMC3 = const_1.calcularIMC();
        const_1.pesoIdeal(IMC1);
        cont_2.pesoIdeal(IMC2);
        const_3.pesoIdeal(IMC3);
        System.out.println(IMC1);
        System.out.println(IMC2);
        System.out.println(IMC3);
        

    }
}

