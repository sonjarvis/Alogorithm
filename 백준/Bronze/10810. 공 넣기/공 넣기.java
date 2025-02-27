import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        for(int a = 0; a < m; a++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int b = I - 1; b < J; b++) {
                basket[b] = K;
            }
        }

        sc.close();

        for(int b = 0; b < basket.length; b++) {
            System.out.print(basket[b] + " ");
        }
    }
}