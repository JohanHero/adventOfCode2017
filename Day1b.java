import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1b{

    public static void main(String[] cmdLn)throws FileNotFoundException {
    	Scanner s  = new Scanner(new File("inputDay1.txt"));
    	int sum = 0;
    	while(s.hasNextLine()) {
	    	
	    	String line  = s.nextLine();
	    	String [] a = line.split("");
			int [] intA =  stringToInt(a);
			
	        for(int i = 0;i<(intA.length/2); i++){
	          if(intA[i] == intA[(intA.length/2)+i]){sum = sum+intA[i];}
	        }

	        int j = 0;
	        for(int i =(intA.length/2) ;i<(intA.length);i++){
	          if(intA[i] == intA[j])
	          {sum = sum+intA[intA.length/2+j];}
	          j++;
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