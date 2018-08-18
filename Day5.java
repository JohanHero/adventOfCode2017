import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
	
//	private static int runner;
//	private static int counter;
//	private static int temp;
	public static void main(String [] cmdLn) throws FileNotFoundException {
		
		
		FileReader in = new FileReader("inputDay5.txt");
		 
		Scanner s = new Scanner(in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
			while ( s.hasNextLine()) {
				
				a.add(stringToInt(s.nextLine()));
			
			}
			int temp = 0;
			int prev = 0;
			int counter = 0;
			int index = 0;
			
			while (index < a.size()) {
			  
			temp = a.get(index);

			
			prev = index;
			index = index + temp;
			a.set(prev,temp+1);
			counter++;

			
			}
			System.out.println(counter);
	}
			
			
	public static int stringToInt (String s ) {
				int a = Integer.parseInt(s);
				
				return a;
			}
}
	
