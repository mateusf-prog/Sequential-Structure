import java.util.Scanner;
import java.util.Locale;

public class Program8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float ganhoHora;
        int horaMensal;
        float resultado;

        System.out.println("Quanto você ganha por hora?");
        ganhoHora = sc.nextFloat();
        System.out.println("Quantas horas você trabalha por mês?");
        horaMensal = sc.nextInt();

        // Processamento
        resultado = horaMensal * ganhoHora;
        
        // Saída de dados
        System.out.printf("Salário total: R$ %.2f%n", resultado);

        sc.close();
    }
}