import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day1{

	 public static void main(String[] cmdLn) throws FileNotFoundException  {
		    Scanner s  = new Scanner(new File("inputDay1.txt"));
		    int sum = 0;
		    
		    while(s.hasNextLine()) {
		    	
		    	String line  = s.nextLine();
		    	String [] a = line.split("");
				int [] intA =  stringToInt(a);
				for(int i = 0; i < intA.length-1;i++) {
					if(intA[i] == intA[i+1]) {
						sum=sum+intA[i];
					}
					
				}
				if(intA[0] == intA[intA.length-1]){
					sum = sum+intA[0];
				}
				    }
		 
		    System.out.println(sum);
		    
		  
		    }
	 
	 public static int [] stringToInt(String [] inputArray){
	      int [] intArray = new int [inputArray.length];
	      for(int i = 0; i<intArray.length;i++){
	        intArray [i] = Integer.parseInt(inputArray[i]);
	      }
	      return intArray;
	    }
       
}
