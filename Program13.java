import java.util.Locale;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe se você é Homem ou Mulher: ");
        String resp = sc.next();
        
        if (resp.equals("Homen")) {
            System.out.print("Informe sua altura em metros (ex: 1.80): ");
            double altura = sc.nextDouble();
            double calc = (72.7 * altura) -58;
            System.out.printf("Seu pesoa ideal seria: %.2f%n", calc);
        } else {
            System.out.print("Informe sua altura em metros (ex: 1.80): ");
            double altura1 = sc.nextDouble();
            double calc1 = (62.1 * altura1) - 44.7;
            System.out.printf("Seu peso ideal seria: %.2f%n", calc1);
        }
        sc.close();
    }
}