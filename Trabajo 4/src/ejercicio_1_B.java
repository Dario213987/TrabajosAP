import java.util.*;

public class ejercicio_1_B {
    public static void main(String[] args) {

        if (args.length >= 3) {
            int[] numeros = new int[args.length - 1];
            for (int i = 0; i < args.length - 1; i++) {
                numeros[i] = Integer.parseInt(args[i]);
            }
            fn(numeros, args[args.length - 1]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantos números quiere introducir:");
            int largo = Integer.parseInt(sc.nextLine());
            int[] numeros = new int[largo];
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Introduzca el " + (i + 1) + "° número:");
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("¿En que orden desea ordenar el intervalo?\na)creciente\nb)decreciente");
            String respuesta = sc.nextLine();
            fn(numeros, respuesta);

        }
    }


    private static void fn(int[] num, String letra) {
        switch (letra) {
            case "a" -> System.out.println(Arrays.toString(ordenarCreciente(num)));
            case "b" -> System.out.println(Arrays.toString(ordenarDecreciente(num)));
            default -> System.out.println("Entrada Incorrecta, por favor responder con a o b");
        }
    }

    private static int[] ordenarCreciente(int[] numeros) {
        boolean completo = false;
        while (!completo) {
            boolean[] ordenado = new boolean[numeros.length - 1];
            for (int e = 0; e < numeros.length - 1; e++) {
                for (int i = 0; i < numeros.length - 1; i++) {
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
            for (int e = 0; e < numeros.length - 1; e++) {
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
