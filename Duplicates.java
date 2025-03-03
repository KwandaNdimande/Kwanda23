package Duplicates;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {
	public static void Duplicate_Finder(int []arr) {
		int newArrSize = arr.length;
		int[] newArr = new int[newArrSize];
		for(int i = 0 ; i < newArrSize ; i++) {
			newArr[i] = arr[i];
		}
		
		TreeSet<Integer>set =  new TreeSet<>();
		for(int i = 0 ; i < newArrSize ; i++) {
			for(int j = i+1 ; j < newArrSize ; j++) {
				if(newArr[i] == newArr[j]) {
					set.add(newArr[i]);
				}
			}
		}
		System.out.println(set);
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		String arraysize = in.nextLine();
		int ArraySize = Integer.parseInt(arraysize);
		int [] arr = new int[ArraySize];
		
		for(int i = 0 ; i < ArraySize ; ++i) {
			String numbers = in.nextLine();
			int ArrNumbers = Integer.parseInt(numbers);
			arr[i] = ArrNumbers;
		}
		
		/*for(int i = 0 ; i < ArraySize ; ++i) {
			System.out.print(arr[i] + " ");
		}
		*/
		Duplicate_Finder(arr);
		
		in.close();
	}

}
