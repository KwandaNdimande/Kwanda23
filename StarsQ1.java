package Stars;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
			
			Scanner in = new Scanner(System.in);
			int Number = in.nextInt();
		
			for(int i = Number ; i > 0 ; i--){
				int whileCount = i;
				while(whileCount != 0){
					System.out.print("*");
					whileCount--;
				}
				System.out.println();
			}
		

		in.close();
		}

	}

