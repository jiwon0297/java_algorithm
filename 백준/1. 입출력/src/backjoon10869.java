import java.util.Scanner;

public class backjoon10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        
        int plus = first + second;
        int mul = first * second;
        int diff = first - second;
        int sksnrl = first / second;
        int ahrt = first % second;
       
        System.out.println(plus);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(sksnrl);
        System.out.println(ahrt);
	}

}
