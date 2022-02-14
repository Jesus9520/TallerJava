public class NumeroParImpar {

    public static void main(String[] args) {
        String numPar="",numImpar="";

        for (int i=1;i<=100;i++){
            if(i%2==0){
                numPar=numPar +String.valueOf(i)+"-";

            }else{
                numImpar=numImpar +String.valueOf(i)+"-";

            }
        }

        System.out.println("numeros pares:");
        System.out.println(numPar);

        System.out.println("numeros impares:");
        System.out.println(numImpar);
    }
}

