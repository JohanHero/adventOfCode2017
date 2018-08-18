import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
/**
 * Läs in och hitta max
 * Lagra vart max är och nollställ
 * metod för att +1 så många gånger som max var
 * 
 * @author Johan
 *
 */

public class Day6 {
	public static int loopcounter;
	
	public static void main(String[] args) throws FileNotFoundException {

	
		FileReader in = new FileReader("inputDay6.txt");
		 
		Scanner s = new Scanner(in);
		//Arraylist to store and compare all strings that we build from our intarrays
		ArrayList<String> memory = new ArrayList<>();
		
		String line;
		int max;
		int counter = 0;
		line  = s.nextLine();
		s.close();
		String [] sArray = line.split(("\\s+"));
		
		
		int [] a =  stringToInt(sArray);
		String sOfArray = Arrays.toString(a);
		memory.add(sOfArray);
			
			while((checkForDup(memory))) {
				max = findMax(a);
				a = intSpread(max, a);
				sOfArray = Arrays.toString(a);
				System.out.println(sOfArray);
				memory.add(sOfArray);
	
				counter++;
			}
			 
		System.out.println("counter = " +counter);
		
		
	}
	
	private static boolean checkForDup(ArrayList<String> a) {
		HashSet<String> h = new HashSet<String>();
		
 		
		for(int i = 0; i < a.size(); i++) {
			
			if(	h.add(a.get(i))==false){
				
			return false;
				}
			}
			
		return true;
		}
	

	private static  int [] intSpread(int max, int[] a) {
		//Find index of max
		int index=0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == max) {
				index = i;
			break;
			}
		}

		int count=0;
		//resets indexvalue of max
		a[index] = 0;
		
		
		//Jumps one step forward and if we are in the end of the array we jumps to the start
		if(index == 15)
			index =0;
		else {
	index = index +1;
		}
		
		while(count < max) {
			
			a[index]  = a[index]+1;
			
			if (index == a.length-1) {
				count++;
				
				index = 0;
			}
			else {
				count++;
				index++;
			
			}
		}
		
		return a;
		
		
	}

	private static boolean checkForEqual(String a, ArrayList<String> b) {
		for(int i = 0; i < b.size(); i++) {
			if( a.compareTo(b.get(i))==0) {
				return true;
			}
			
				
		}
		return false;
	}

	private static  int findMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
		
		
	}

	public static int stringToInt (String s ) {
		int a = Integer.parseInt(s);
		
		return a;
	}
	
	   public static int [] stringToInt(String [] inputArray){
		      int [] intArray = new int [inputArray.length];
		      for(int i = 0; i<intArray.length;i++){
		        intArray [i] = Integer.parseInt(inputArray[i]);
		      }
		      return intArray;
		    }
}
