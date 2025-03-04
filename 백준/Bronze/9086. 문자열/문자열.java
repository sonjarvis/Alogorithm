import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String st[] = new String[t];

        for(int i=0; i < t; i++) {
            String str = sc.next();
            st[i] = str.charAt(0)+ str.substring(str.length()-1);
        }

        sc.close();

        for(int i=0; i < t; i++) {
            System.out.println(st[i]);
        }

    }
}