import java.util.Scanner;
public class sumatoriaMayoresAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números quiere introducir:");
        int largo = Integer.parseInt(sc.nextLine());
        int[] numeros = new int[largo];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca el " + (i + 1) + "° número:");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("¿A que número deberan ser mayores para sumarse?");
        int numX = Integer.parseInt(sc.nextLine());
        System.out.println("El resultado es: "+sum(numeros, numX));

    }
    private static int sum(int[] numeros, int numX){
        int resultado = 0;
        for(int numero : numeros){
            if(numero>numX){
                resultado += numero;
            }
        }
        return resultado;
    }
}