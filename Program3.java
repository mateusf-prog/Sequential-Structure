import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("A soma dos dois números informados é " + (num1 + num2));

        sc.close();   
    }
}