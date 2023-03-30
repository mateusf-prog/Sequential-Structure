import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] agrs) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double area, raio;
        
        // Entrada de dados
        System.out.print("Informe o raio do círculo: ");
        raio = sc.nextDouble();

        // Processamento
        area = PI * (raio * raio);

        // Saída de dados
        System.out.printf("ÁREA: %.2f%n", area);
        
        sc.close();
    }
}