import java.util.Locale;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float tempFahrenheit, tempCelsius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempFahrenheit = sc.nextFloat();

        // Processamento
        tempCelsius = 5 * ((tempFahrenheit - 32) / 9);

        // Saída 
        System.out.printf("Temperatura convertida para Celsius: %.1f%n", tempCelsius);

        sc.close();
    }
}