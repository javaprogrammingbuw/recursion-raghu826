import java.util.Scanner;

public class Fibonacci {
	
	public static int fib(int n) {
		
		int a=0;
		int b=1;
		
		for (int i=1; i<=n;i++) {
			
			int sum = a+b;
			a = b;
			b = sum;
		}
			return a;
			
	}
	
	public static int  fibRek(int n) {
	
	if (n<2)
		return n;
	else 
		return fibRek(n-1)+ fibRek(n-2);
	}
	
	public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			System.out.println("Enter the number:" + n);
			
			System.out.println(fib(n));
			System.out.println(fibRek(n));
			scan.close();
	}
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. 
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter.
	//This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.
}
