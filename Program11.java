import java.util.Scanner;
import java.util.Locale;

public class Program11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v1, v2;
        double real, calc1, calc2, calc3;

        System.out.println("Digite dois números inteiros: ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        System.out.println("Digite um número real: ");
        real = sc.nextDouble();

        // processamento
        calc1 = ((v1 * 2) * 2) + (v2 / 2);
        calc2 = (v1 * 3) + real;
        calc3 = Math.pow(real, 3);
        
        // saida
        System.out.printf("O produto do dobro do primeiro com metade do segundo: %.2f%n", calc1);
        System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f%n", calc2);
        System.out.printf("O terceiro elevado ao cubo: %.2f%n", calc3);

        sc.close();
    }
}