import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        
        ordenarPorInsercion(arreglo);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        scanner.close();
    }
    
    public static void ordenarPorInsercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int valor = arreglo[i];
            int j = i - 1;
            
            // Invariante: arreglo[0..j] está ordenado
            while (j >= 0 && arreglo[j] > valor) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = valor;
            
            // Aquí se cumple que arreglo[0..i] está ordenado
            System.out.println("Paso " + i + ": " + Arrays.toString(arreglo));
        }
    }
}