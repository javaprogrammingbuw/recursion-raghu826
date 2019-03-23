import java.util.Scanner;

public class Factorial {
	
	public static int Fact(int i) {
		if (i <= 1)
			return 1;
		else
			return i * Fact(i-1);
		
	}
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			
			System.out.println("Enter the number:" + i);
			
		System.out.println(Fact(i));
		scan.close();
	}
	//todo: implement a recursive functions which gives you the factorial value of a given number
}
