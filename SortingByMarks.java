package SortingByMarks;
import java.util.Scanner;
//import java.util.HashMap;
import java.util.TreeMap;
import java.util.Comparator;

public class Program {
	public static String GetName(String name) {
		int IndexName = name.indexOf('#');
		String RealName = name.substring(0, IndexName);
		
		return RealName;
	}
	public static int GetMark(String name) {
		int IndexMarks = name.indexOf('#');
		
		String StringMark = name.substring(IndexMarks + 1);
		int Mark = Integer.parseInt(StringMark);
		
		return Mark;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of students : ");
		String NoWord = in.nextLine();
		int NoStudents = Integer.parseInt(NoWord);
		
	    TreeMap<Integer , String>map = new TreeMap<>(Comparator.reverseOrder());
		
		for(int i = 0 ; i < NoStudents ; i++) {
			String name = in.nextLine();
			int Marks = GetMark(name);
			String Name = GetName(name);
			
			map.put(Marks, Name);
			
		}
		
		map.reversed();
		map.forEach((key, value) -> System.out.println(value + ": " + key));

		/*String name = in.nextLine();
		int Marks = GetMark(name);
		String Name = GetName(name);
		
		Map<String , Integer> map = new HashMap<>();
		*/
		
		
		in.close();
	}

}
