public class Ejercicio02_06 {
    public static void main(String[] args){
        double baseImportante = 22.75;
        System.out.printf("Base imponible %8.2f%n", baseImportante);
        System.out.printf("IVA            %8.2f%n", (baseImportante * 0.21));
        System.out.printf("────────────────────────%n");
        System.out.printf("Total          %8.2f%n", (baseImportante * 1.21));
    }
}
