import java.util.Scanner;
import java.util.Locale;

public class Program17 {
    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, valorLatas, valorGaloes, metragemFaltando, litrosFaltando, galoesAdicionais;
        int latasNecessarias, galoesNecessarios;

        // Entrada de dados
        System.out.print("Informe a área em m² a ser pintada: ");
        area = sc.nextDouble();

        // Processamento
        latasNecessarias = (int)Math.ceil((area / 6 / 18)); 
        valorLatas = latasNecessarias * 80;
        galoesNecessarios = (int)Math.ceil((area / 6 / 3.6));  
        valorGaloes = galoesNecessarios * 25;
         
        metragemFaltando = ((latasNecessarias -1) * 6 * 18) - area;
        litrosFaltando = (metragemFaltando / 6) * 1.10;
        galoesAdicionais = Math.ceil(Math.abs(litrosFaltando / 3.6));

        // Saída de dados
        System.out.printf("Latas necessárias: %d, valor: R$ %.2f%n", latasNecessarias, valorLatas);
        System.out.printf("Galões necessários: %d, valor: R$ %.2f%n", galoesNecessarios, valorGaloes);
        System.out.printf("--Mistura--%nlatas: %d%ngalões: %.0f%n", (latasNecessarias-1), galoesAdicionais);

        sc.close();
    }
}