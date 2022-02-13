public class numerosParImpar {


        public static void main(String[] args) {
            int cont=1;
            String numPar = "",numImpar = "";

            while (cont<=100){
                if(cont%2==0){
                    numPar = numPar + String.valueOf(cont)+"-";
                    cont++;
                }else{
                    numImpar = numImpar + String.valueOf(cont)+"-";
                    cont++;
                }
            }

            System.out.println("numeros pares:");
            System.out.println(numPar);

            System.out.println("numeros impares:");
            System.out.println(numImpar);
        }
    }

