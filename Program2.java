import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.printf("O número digitado foi %d%n", num);

        sc.close();
    }
}