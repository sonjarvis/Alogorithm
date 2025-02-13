import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
        int C = sc.nextInt(); // 요리시간
        
		sc.close();
        
		M = H * 60 + M;
        M = M + C;

        H = (M / 60) % 24;    // 시(24시 이상이면 0시부터 시작)   
        int min = M % 60;     // 분 

        System.out.println(H + " " + min);
        
            
	}
}