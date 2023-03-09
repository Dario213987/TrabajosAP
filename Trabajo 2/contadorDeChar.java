public class Main {
    public static void main(String[] args){
        char letra = '';
        String texto = "La bella y graciosa moza marchose a lavar la ropa, la mojó en el arroyuelo y cantando la lavó, la frotó sobre una piedra, la colgó de un abedul";
        int resultado = contadorDeCoincidencias(texto, letra);
        System.out.println("La letra "+letra+" aparece un total de "+resultado+" veces");
    }
    public static int contadorDeCoincidencias(String texto, char letra){
        int contador=0;
        for(int i=0;i<texto.length();i++){
            if(letra==texto.charAt(i)){
                contador++;
            }
        }
        return contador;
    }
}
