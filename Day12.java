import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

public class Day12 {
	public static  ArrayList <String> uniquePrograms = new ArrayList<>();

	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("inputDay12.txt");
		Scanner s = new Scanner(fr);
		Stack<Integer> theStack = new Stack<Integer>();
		String line;
		String [] stringArr = new String [100];
		int [] intArr = new int [100];
		int firstInt = 0;
		int connecter = 46;	
	
		ArrayList <Integer> uniquePrograms = new ArrayList<>();
		uniquePrograms.add( 0);
		theStack.push(0);
		theStack.push(46);
		int counter= 0;
		while(true) {
			
		
		
		//Pushes every program into the stack if its not a duplicate
		while(s.hasNextLine()) {
			counter++;
			line =  s.nextLine();
			line = line.replaceAll("<->", ",").trim();
			stringArr = line.split(",");
			intArr = stringToInt(stringArr);
			firstInt = intArr[0];
			if(firstInt == connecter) {
				
				for(int i = 0; i < intArr.length; i++) {
					if(!(uniquePrograms.contains(intArr[i]))) {
					uniquePrograms.add(intArr[i]);
					theStack.push(intArr[i]);
				}
			}
				System.out.println("The stack contains : " + theStack.toString() );
				System.out.println("And we have: " + uniquePrograms.size() + " programs!");
				System.out.println("I know I know, the program crashed but it works, isn't it!?");
				System.out.println("bla bla bla, I dont wanna se the Big O notation either...");
				connecter = theStack.pop();
				

			}
			
			
//			System.out.println(Arrays.toString(intArr));
			System.out.println(uniquePrograms);
			
		}
		 fr = new FileReader("inputDay12.txt");
		 s = new Scanner(fr);
		
		}

	

	}

	private static int[] stringToInt(String[] stringArr) {
		
		int [] a = new int [stringArr.length];
		
		for(int i = 0; i < stringArr.length; i++) {
			if(stringArr[i].contains(" ") )
				stringArr[i] = stringArr[i].replaceAll("\\s", "");
		}
		
		for(int i = 0; i < stringArr.length; i++) {
			a[i] = Integer.parseInt(stringArr[i]);
		}
		
		
		return a;
	}
	private static void addProgram(String s) {
		
		for( int i = 0; i < uniquePrograms.size(); i++) {
			
			if(s.equals(uniquePrograms.get(i))) {
				break;
			}
		}
	}
	
	
}
	