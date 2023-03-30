import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float tempFahrenheit, tempCelsius;

        System.out.print("Digite a temperatura em Celsius: ");
        tempCelsius= sc.nextFloat();

        // Processamento
        tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        // Saída 
        System.out.printf("Temperatura convertida para Fahrenheit: %.1f%n", tempFahrenheit);

        sc.close();
    }
}