import java.util.Scanner;
public class backjoon2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int answer1 = A*(B%10);
        int answer2 = A*((B%100)/10);
        int answer3 = A*(B/100);
        int answer4 = answer1 + answer2*10 + answer3*100;
        
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
	}

}
