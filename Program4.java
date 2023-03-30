import java.util.Scanner;
import java.util.Locale;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as 4 notas bimestrais: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A média das 4 notas bimestrais é: %.2f%n", media);

        sc.close();
    }
}