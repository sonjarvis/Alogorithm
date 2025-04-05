import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();
        
        Long res = Long.valueOf(0);
        for (int i = 1; i < n; i++) {
            res += i;
        }
        System.out.println(res);
        System.out.println(2);
    }

}