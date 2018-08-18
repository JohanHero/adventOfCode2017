import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Day8{
	
	private static  int max = 0;
	private static int maxPart2 = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader in = new FileReader("inputDay8.txt");	 
		Scanner s = new Scanner(in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		HashMap<String, Integer> registers = new HashMap<>();
		String line = null;
		String register = null;
		int registerToCompare = 0;
		int registerValue = 0;
		int integerToCompare = 0;
		
		//Just adds every register the the hashmap with the values of 0. 
		while (s.hasNextLine()) {
			
			line = s.nextLine();
			register = line.substring(0, line.indexOf(" "));
			//Adds every register and puts the value to 0. 
			registers.put(register, 0);
		}
		s.close();
		
		FileReader in2 = new FileReader("inputDay8.txt");	 
		Scanner s2 = new Scanner(in2);
		
				
				while (s2.hasNextLine()) {
					
					line = s2.nextLine();
					String bajs = line;
					register = line.substring(0, line.indexOf(" "));

					
					registerValue = registers.get(register);	
					String [] theLine = line.split(" ");
					
					registerToCompare = registers.get(theLine[4]);
					
					
					if(bajs.contains("<") && !(bajs.contains("<="))) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf("<")+2));
						if( registerToCompare < integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
							
						
					}
					
					else if (bajs.contains(">") && !(bajs.contains(">="))) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf(">")+2));
						if( registerToCompare > integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
					
					}
					else if (bajs.contains("==")) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf("==")+3));
						if( registerToCompare == integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
						
					}
					else if (bajs.contains("<=")) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf("<=")+3));
						if( registerToCompare <= integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
	
					}
					else if (bajs.contains(">=")) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf(">=")+3));
						if( registerToCompare >= integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
	
					}
					else if (bajs.contains("!=")) {
						integerToCompare = Integer.parseInt(bajs.substring(bajs.indexOf("!=")+3));
						if( registerToCompare != integerToCompare) {
							if ( bajs.contains("inc")) {
								int intToAdd = Integer.parseInt(bajs.substring(bajs.indexOf("inc")+4, bajs.indexOf("if")-1));
								registers.put(register, registers.get(register)+intToAdd);

								}
								else {
									int intToSub = Integer.parseInt(bajs.substring(bajs.indexOf("dec")+4, bajs.indexOf("if")-1));
									registers.put(register, registers.get(register)-intToSub);

								}
							
						}
						
						
					}
						
						max = registers.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
						
						if ( max > maxPart2)
							maxPart2 = max;
					
				}
				
				 max = registers.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
				System.out.println(" Part 1: " + max);
				System.out.println(" Part 2: " + maxPart2);
		
		
	}

}
