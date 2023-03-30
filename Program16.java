import java.util.Scanner;
import java.util.Locale;

public class Program16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, valor;
        int latas;

        System.out.println("Informa a área em m² a ser pintada: ");
        area = sc.nextDouble();

        latas = (int)Math.ceil(area / 3 / 18);
        valor = latas * 80.0;
        
        System.out.printf("Quantidade de latas necessaŕias: %d%n", latas);
        System.out.printf("Valor total: R$ %.2f%n", valor);

        sc.close();
    }
}