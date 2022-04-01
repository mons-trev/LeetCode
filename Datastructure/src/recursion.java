import java.util.Scanner;

public class recursion {

	public static int recursion_factorial(int n) {
		if(n==1) return 1;
		
		else {
			return n*recursion_factorial(n-1);
		}
	}
	
	public static int iteration_factorial(int n) {
		int sum=1;
		for(int i=1; i<n+1; i++) {
			sum*=i;
		}
		return sum;
	}
	public static int iteration_fibonacci(int n) {
		int first=0;
		int second=1;
		int result=0;
		for(int i=3; i<=n; i++) {
			result=first+second;
			first=second;
			second=result;
			System.out.println("~iter");
		}
		return result;
	}
	public static int recursion_fibonacci(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		else {
			System.out.println("~recur");
			return recursion_fibonacci(n-1)+recursion_fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(recursion_factorial(n));
		System.out.println(iteration_factorial(n));
		System.out.println(iteration_fibonacci(n));
		System.out.println(recursion_fibonacci(n));
		sc.close();
	}

}
