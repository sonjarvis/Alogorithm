import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        double result = 0, total_sum = 0;
        char c;

        for(int i=0;i<20;i++) {
            double grade = 0;
            double gpa = 0;

            String[] str_arr = sc.nextLine().split(" ");
            grade += Double.parseDouble(str_arr[1]);
            c = str_arr[2].charAt(0);

            switch(c) {
                case 'A':
                    if(str_arr[2].charAt(1) == '+') gpa += 4.5;
                    else gpa += 4.0;
                    break;
                case 'B':
                    if(str_arr[2].charAt(1) == '+') gpa += 3.5;
                    else gpa += 3.0;
                    break;
                case 'C':
                    if(str_arr[2].charAt(1) == '+') gpa += 2.5;
                    else gpa += 2.0;
                    break;
                case 'D':
                    if(str_arr[2].charAt(1) == '+') gpa += 1.5;
                    else gpa += 1.0;
                    break;
                case 'F':
                    gpa += 0;
                    break;
                case 'P':
                    gpa += 0;
                    grade = 0;
                    break;
            }
            total_sum += grade;
            result += grade*gpa;
        }

        sc.close();

        System.out.println(result/total_sum);
    }
}