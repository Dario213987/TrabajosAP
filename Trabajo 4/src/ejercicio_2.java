import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ejercicio_2 {
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
            System.out.println(numeros[i]);
        }
        System.out.println(sumatoria(numerosInt));
    }
    private static int sumatoria(int[] numeros){
        int respuesta = 0;
        for (int numero : numeros){
            respuesta += numero;
        }
        return respuesta;
    }
}
