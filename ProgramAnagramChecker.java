package AnagramChecker;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean output = true;
		
		//System.out.print("Enter Fisrt word : ");
		String FirstWord = in.nextLine();
		//System.out.println();
		//System.out.print("Enter Second word : ");
		String SecondWord = in.nextLine();
		
		FirstWord.toLowerCase();
		SecondWord.toLowerCase();
		
		TreeSet<Character>set1 = new TreeSet<>();
		TreeSet<Character>set2 = new TreeSet<>();
		
		int wordLenght = FirstWord.length();
		
		if(wordLenght != SecondWord.length()) {
			System.out.println("False");
		}
		else {
			for(int i = 0 ; i < wordLenght ; i++) {
				set1.add(FirstWord.charAt(i));
				set2.add(SecondWord.charAt(i));
			}
			if(set1.equals(set2)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		//System.out.println(set1);
		//System.out.println(set2);
		in.close();
	}

}
