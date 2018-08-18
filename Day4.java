

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day4 {

	private static int sum;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader in = new FileReader("Day4.txt");
		 
		Scanner s = new Scanner(in);
			String line;
			while ( s.hasNextLine()) {
				line  = s.nextLine();
				String [] sArray = line.split(("\\s+"));
				 sum += compareWords(sArray);
				
			}		
			System.out.println(sum);
			
	}

	
	public static int compareWords(String a []) {
		
			for(int i = 0; i < a.length;i++) {
				for(int j = i+1; j <  a.length;j++) {
					if(a[i].compareTo(a[j]) == 0){
						return 0;
					}
				
				}
			}
		
		return 1;
		
	}
}
