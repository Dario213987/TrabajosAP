import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

    public class ejercicio_2_A {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            String separador = ",";
            String variables = null;
            System.out.println("Recuerde que los números deberán estar separados únicamente por una coma\nIntroduzca la ubicacion del archivo:");
            String rutaDeArchivo = sc.nextLine();
            for (String linea : Files.readAllLines(Paths.get(rutaDeArchivo))) {
                variables = linea;
            }
            String[] numeros = variables.split(separador);
            int[] numerosInt = new int[numeros.length];
            for (int i=0;i<numeros.length;i++){
                numerosInt[i]=Integer.parseInt(numeros[i]);
            }
            System.out.println("Que operacion desea realizar:\na)sumar\nb)multiplicar");
            String respuesta = sc.nextLine();
            int solucion = 0;
            boolean error = true;
            while(error) {
                switch (respuesta) {
                    case "a" -> {
                        solucion = sumatoria(numerosInt);
                        error = false;
                    }
                    case "b" -> {
                        solucion = multiplicar(numerosInt);
                        error = false;
                    }
                    default -> System.out.println("Entrada incorrecta, por favor responder con a o b");
                }
            }
            System.out.println("La solución es: "+ solucion);
        }
        private static int sumatoria(int[] numeros){
            int respuesta = 0;
            for (int numero : numeros){
                respuesta += numero;
            }
            return respuesta;
        }
        private static int multiplicar(int[] numeros){
            int respuesta = 1;
            for (int numero : numeros){
                respuesta*=numero;
            }
            return respuesta;
        }
    }
