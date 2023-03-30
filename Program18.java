import java.util.Locale;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tamanho, velInternet, tempoDownloadMin, velDonwload;

        System.out.println("Qual o tamanho do arquivo em MB: ");
        tamanho = sc.nextDouble();
        System.out.println("Qual a velocidade de sua internet em Mbps?");
        velInternet = sc.nextDouble();

        velDonwload = velInternet / 10;
        tempoDownloadMin =  Math.ceil(tamanho / velDonwload / 60);

        System.out.printf("O tempo aproximado de donwload é de %.0f minutos%n", tempoDownloadMin);

        sc.close();
    }
}