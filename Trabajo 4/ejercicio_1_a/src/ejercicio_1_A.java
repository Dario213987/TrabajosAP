import java.util.Arrays;

public class ejercicio_1_A {

    //args : num1 num2 num3 letra(a o b)
    public static void main(String[] args) {
        int[] numeros = new int[args.length-1];
        String ascendiente = "A";
        String descendiente = "D";
        for(int i= 0; i < args.length-1; i++){
            numeros[i] = Integer.parseInt(args[i]);
        }
            switch (args[3]) {
                case "a" -> System.out.println(ascendiente+": "+ Arrays.toString(ordenarCreciente(numeros)));
                case "b" -> System.out.println(descendiente+": "+ Arrays.toString(ordenarDecreciente(numeros)));
            }


    }

    private static int[] ordenarCreciente(int[] numeros) {
        boolean completo = false;
        while (!completo) {
            boolean[] ordenado = new boolean[numeros.length - 1];
            for(int e = 0; e< numeros.length-1;e++) {
                for (int i = 0; i  <numeros.length - 1; i++) {
                    if (numeros[i] > numeros[i + 1]) {
                        int tmp = numeros[i];
                        numeros[i] = numeros[i + 1];
                        numeros[i + 1] = tmp;
                    }
                }
                ordenado[e] = true;
            }
            completo = estaOrdenado(ordenado);
        }
        return numeros;
    }

    private static int[] ordenarDecreciente(int[] numeros) {
        boolean completo = false;
        while (!completo) {
            boolean[] ordenado = new boolean[numeros.length - 1];
            for(int e = 0; e< numeros.length-1;e++) {
                for (int i = 0; i < numeros.length - 1; i++) {
                    if (numeros[i] < numeros[i + 1]) {
                        int tmp = numeros[i];
                        numeros[i] = numeros[i + 1];
                        numeros[i + 1] = tmp;
                    }
                }
                ordenado[e] = true;
            }
            completo = estaOrdenado(ordenado);
        }
        return numeros;
    }


    private static boolean estaOrdenado(boolean[] ordenado) {
        boolean completo = false;
        for (int i = 0; i < ordenado.length - 1; i++) {
            if (i == 0) {
                completo = ordenado[i];
            } else {
                completo = completo && ordenado[i];
            }

        }
        return completo;
    }
}
