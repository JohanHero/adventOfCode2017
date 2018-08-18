import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Day2{

  public static void main(String[] cmdLn) throws FileNotFoundException  {
    Scanner s  = new Scanner(new File("inputDay2.txt"));
    int sum = 0;
    
    while(s.hasNext()) {
    	String line  = s.nextLine();
		String [] sArray = line.split(("\\s+"));
		int [] intArray = stringToInt(sArray);
		Arrays.sort(intArray);
		sum = sum + (intArray[intArray.length-1] - intArray[0]);
		
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
