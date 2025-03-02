import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int m = sc.nextInt();

		int temp=0;
		
		int basket[] = new int[n]; 
		for(int i=0;i<basket.length;i++) {
			basket[i] = i+1;	
		}
		
		for(int i=0;i<m;i++) { 
			int a = sc.nextInt()-1; 
			int b = sc.nextInt()-1; 
			
			while(a<b) { 
				temp = basket[a]; 
				basket[a] = basket[b]; 
				basket[b] = temp; 
				a++;	
				b--;	
			}
		}
		sc.close();
		
		for(int i=0;i<basket.length;i++) {
			System.out.print(basket[i]+" ");
		}
		
		
	}
}