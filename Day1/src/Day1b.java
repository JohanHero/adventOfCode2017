import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1b{

    public static void main(String[] cmdLn)throws FileNotFoundException {
    	Scanner s  = new Scanner(new File("inputDay1.txt"));
    	while(s.hasNextLine()) {
	    	
	    	String line  = s.nextLine();
	    	String [] a = line.split("");
			int [] intA =  stringToInt(a);
       
    	}
    }
     
    
    public static int [] stringToInt(String [] inputArray){
	      int [] intArray = new int [inputArray.length];
	      for(int i = 0; i<intArray.length;i++){
	        intArray [i] = Integer.parseInt(inputArray[i]);
	      }
	      return intArray;
	    }


  }

