import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a metragem: ");
        double metro = sc.nextDouble();

        double cent = metro * 100;

        System.out.printf("A conversão de metros para centímetros é: " + 
        "%.0f centímetros%n", cent);

        sc.close();
    }
}