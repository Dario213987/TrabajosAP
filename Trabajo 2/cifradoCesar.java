import java.util.Scanner;
public class cifradoCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdizca el texto que desea cifrar:");
        String texto = sc.nextLine();
        String textoCifrado = desplazamiento(texto);
        System.out.println("El texto quedaría:\n"+textoCifrado);

    }

    private static String desplazamiento(String texto){
        String abecedario = "abcdefghijklmnopqrstuvwxyz ";
        char[] array = new char[texto.length()];
        for(int i=0;i<texto.length()-1; i++){
            for(int e=0;e<abecedario.length();e++){
                if(texto.charAt(i)==abecedario.charAt(e)) {
                    if (e + 2 > abecedario.length()-1) {
                        int a = e + 2 - abecedario.length();
                        array[i] = abecedario.charAt(a);
                    } else {
                        array[i] = abecedario.charAt(e + 2);
                    }
                }
            }
        }
       return new String(array);
    }

}