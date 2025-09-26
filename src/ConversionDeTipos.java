/**
 * Conversión de tipos
 */
public class ConversionDeTipos {
    public static void main(String[] args){
        int x = 2;
        int y = 9;
        double division;

        division = (double) y / (double) x;

        // Documenta la siguiente línea y observa como cambia el resultado.
        // division = y / x;

        System.out.println("El resultado de la division es " + division);
    }
}
