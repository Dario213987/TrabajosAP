import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
public class cifraoCesar2 {
    public static void main(String[] args) throws IOException {
        // args ruta_input ruta_output movimiento codODecod(c o d)
        int i =0;
        int e=0;
        int movimiento;
        if(Objects.equals(args[3], "d")){
            movimiento=-Integer.parseInt(args[2]);
        }else {
            movimiento = Integer.parseInt(args[2]);
        }
        //no sé muy bien al momento como contar los elementos de una lista más allá de esto:
        for(String linea: Files.readAllLines(Paths.get(args[0]))){
            i++;
        }
        //creo una array del con un tamaño igual al número de lineas
        String[] codificado = new String[i];
        //paso los valores
        for(String linea: Files.readAllLines(Paths.get(args[0]))){
            codificado[e]=linea;
            e++;
        }
        //desplazo las letras
        for(int a = 0; a<codificado.length; i++){
            codificado[a] = desplazamiento(codificado[a], movimiento);
            a++;
        }
        StringBuilder str = new StringBuilder();
        //concateno los string respetando las líneas
        for(String linea : codificado){
            str.append(linea).append("\n");
        }
        //envío el string ya completo al archivo
        Files.writeString(Paths.get(args[1] ), str.toString());
        System.out.println("El proceso ha sido llevado a cabo de manera exitosa");

    }
    private static String desplazamiento(String texto , int movimiento) {
        String abecedario = "abcdefghijklmnopqrstuvwxyz ";
        char[] array = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            for (int e = 0; e < abecedario.length(); e++) {
                if (texto.charAt(i) == abecedario.charAt(e)) {
                    if (e + movimiento > abecedario.length() - 1) {
                        int a = e + movimiento - abecedario.length();
                        array[i] = abecedario.charAt(a);
                    } else if(e+movimiento<0){
                        int a = e + movimiento + abecedario.length();
                        array[i]=abecedario.charAt(a);
                    }else {
                        array[i] = abecedario.charAt(e + movimiento);
                    }
                }
            }
        }
        return new String(array);
    }
}
