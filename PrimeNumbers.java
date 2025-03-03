package SecondYearQ5;
import java.util.Scanner;

public class Program {
	public static boolean isPrime(int Number) {
		if(Number == 1) {
			return false;
		}
		if(Number == 2) {
			return true;
		}
		for(int i = 2 ; i < Number ; i++) {
			if(Number % i == 0) {
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int number2 = 1;
		/*boolean isprime = true;
		
		isprime = isPrime(number);
		System.out.println(isprime);
		*/
		boolean first = true;
		System.out.print("[");
		
		while(number2 <= number) {
			boolean isprime = true;
			isprime = isPrime(number2);
			if(isprime == true) {
				if(first == true) {
					System.out.print(number2);
					first = false;
				}
				else {
					System.out.print(" ,"+ number2);
				}
			}
			number2++;
		}
		
		System.out.println("]");
		
		in.close();
	}
}

