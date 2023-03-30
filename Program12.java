import java.util.Scanner;
import java.util.Locale;

public class Program12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura, calc;

        // Entrada dedos
        System.out.print("Informe sua altura (em metros): ");
        altura = sc.nextFloat();

        // Processamento
        calc = (72.7 * altura) - 58;

        // Saída de dados
        System.out.printf("Peso ideal: %.2f%n", calc);

        sc.close();
    }
}