import java.util.Scanner;
import java.util.Locale;

public class Program15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horasMensais;
        double valHora, salarioBruto, inss, sindicato, salarioLiquido;

        // entrada de dados
        System.out.println("Quanto você ganha por hora? ");
        valHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalha mensalmente? ");
        horasMensais = sc.nextInt();

        // processamento
        salarioBruto = horasMensais * valHora;
        inss = 8 * salarioBruto / 100;
        sindicato = 5 * salarioBruto / 100;
        salarioLiquido = salarioBruto - inss - sindicato;

        // saida de dados
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + sindicato);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        sc.close();
    }
}