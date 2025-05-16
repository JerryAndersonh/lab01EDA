import java.util.ArrayList;
import java.util.Scanner;

public class CribaEratostenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el límite superior para buscar primos: ");
        int n = scanner.nextInt();
        
        boolean[] esPrimo = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            esPrimo[i] = true;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= n; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (esPrimo[i]) {
                primos.add(i);
            }
        }
        
        System.out.println("Números primos hasta " + n + ": ");
        System.out.println(primos);
    }
}