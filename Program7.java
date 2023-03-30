import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, lado;

        // Entrada de dados
        System.out.printf("Informe o valor de algum lado do quadrado: ");
        lado = sc.nextDouble();


        // Processamento
        area = (lado * lado) * 2;

        // Saída de dados
        System.out.printf("O dobro da área de um quadrado é %.0f%n", area);

        sc.close();
    }
}