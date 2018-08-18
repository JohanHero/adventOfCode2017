import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader in = new FileReader("inputDay11.txt");
		 
		Scanner s = new Scanner(in);
		
		int north = 0, south = 0, northWest = 0, northEast = 0,southWest = 0, southEast = 0;
	
		
		int x = 0; 
		int y = 0;
		int z = 0;
		int steps ;
		ArrayList<Integer> stepBag  = new ArrayList<>();
		
		while ( s.hasNextLine()) {
				String k =  s.nextLine();
				String [] stringArray = k.split("\\s*,\\s*");
				System.out.println(Arrays.toString(stringArray));
				
				for ( int i = 0; i < stringArray.length; i++) {
					if  (stringArray[i].equals("s")) {
						south++;
						y--;
						z++;
					}
					else if  (stringArray[i].equals("n")) {
						north++;
						y++;
						z--;
						
					}
					else if  (stringArray[i].equals("nw")) {
						northWest++;
						y++;
						x--;
						
					}
					else if  (stringArray[i].equals("ne")) {
						northEast++;
						z--;
						x++;
						
					}
					else if  (stringArray[i].equals("sw")) {
						southWest++;
						z++;
						x--;
					}
					else if  (stringArray[i].equals("se")) {
						southEast++;
						y--;;
						x++;
					}
					stepBag.add(((Math.abs(x) + Math.abs(y) + Math.abs(z))/2));	
					}
				
			}
			
			steps = ((Math.abs(x) + Math.abs(y) + Math.abs(z))/2);
			System.out.println(steps);
			System.out.println((findMax(stepBag)));
		
	}
	private static int findMax(ArrayList<Integer> a ) {
		 int max = Integer.MIN_VALUE;
		 for(int i  = 0; i < a.size();i++ ) {
			 if(a.get(i)>max)
				 max = a.get(i);
		 }

		
		return max;
		
	}
	
	

}
