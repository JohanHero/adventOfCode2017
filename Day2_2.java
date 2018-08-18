

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


//loop trough every int. Try to evenly divide them with every other int and when it hits break and add to sum.
public class Day2_2 {
	private static int sum;
	private static int counter = 0;
	
	public static void main(String [] cmdLn) throws FileNotFoundException {
	
		
		FileReader in = new FileReader("day2_2.txt");
		 
		Scanner s = new Scanner(in);
			String line;
			while (s.hasNextLine()) {
				line  = s.nextLine();
				String [] sArray = line.split(("\\s+"));
				int [] a =  stringToIntArray(sArray);
				sum += addDiv(a);
	
			}		
			System.out.println(counter);
			System.out.println(sum);
	}
	
	public static int [] stringToIntArray (String [] s ) {
		int [] a = new int [s.length];
		
		for(int i = 0; i < s.length; i ++) {
			a [i] = Integer.parseInt(s[ i]);
		}
		return a;
	}
	
	public static int addDiv(int [] a) {
		
		for( int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if( a[i] % a[j] == 0 ){
					counter++;
					return a[i] / a[j];
					
				}
				if(a[j] % a[i]== 0) {
					counter++;
					return a[j] / a[i];
				}
					
               }
           }
		return 0;
		
	}
}


