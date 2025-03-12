import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int ans = 1;

        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}