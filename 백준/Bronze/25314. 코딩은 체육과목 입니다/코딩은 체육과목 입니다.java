import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            
            sc.close();
            
            String result = "";
            
            for(int i = 1; i <= N/4; i++){
                result += "long ";
            } 
            System.out.println(result + "int");
        }
    }