import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GestorCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();
        double[] calificaciones = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i+1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
        
        Arrays.sort(calificaciones);
        
        // Calcular mediana
        double mediana;
        if (n % 2 == 0) {
            mediana = (calificaciones[n/2 - 1] + calificaciones[n/2]) / 2.0;
        } else {
            mediana = calificaciones[n/2];
        }
        
        // Calcular moda
        HashMap<Double, Integer> frecuencias = new HashMap<>();
        for (double calif : calificaciones) {
            frecuencias.put(calif, frecuencias.getOrDefault(calif, 0) + 1);
        }
        
        double moda = calificaciones[0];
        int maxFrecuencia = 1;
        for (HashMap.Entry<Double, Integer> entry : frecuencias.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        
        // Calcular desviación estándar
        double suma = 0;
        for (double calif : calificaciones) {
            suma += calif;
        }
        double media = suma / n;
        
        double sumaDiferencias = 0;
        for (double calif : calificaciones) {
            sumaDiferencias += Math.pow(calif - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaDiferencias / n);
        
        System.out.println("\nResultados:");
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
        System.out.println("Desviación estándar: " + desviacionEstandar);

        scanner.close();
    }
}