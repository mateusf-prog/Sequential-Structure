import java.util.Scanner;
import java.util.Locale;

public class Program14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        double peso, multa, excesso;

        // entrada de dados
        System.out.print("Informe o peso (kg): ");
        peso = sc.nextDouble();

        // processamento
        excesso = peso -  50;
        multa = excesso * 4.0;

        // saída de dados
        System.out.printf("João pescou %.2f kg de peixes.%n", peso);
        System.out.printf("João pescou %.2f kg acima do limite permitido.%n", excesso);
        System.out.printf("João terá que pagar R$ %.2f de multa.%n", multa);

        sc.close();
    }
}