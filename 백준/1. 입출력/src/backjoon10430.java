import java.util.Scanner;
public class backjoon10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int answer1 = (A+B)%C;
        int answer2 = ((A%C) + (B%C))%C;
        int answer3 = (A*B)%C;
        int answer4 = ((A%C)*(B%C))%C;
        
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
	}

}
