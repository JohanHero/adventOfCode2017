import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Day10 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		 Stack < Integer> s = new Stack<Integer>();
		int length;
		int skipSize = 0;
		int pointer = 0;
		
		
		int [] list = new int [256];
		
		for (int i = 0; i < list.length; i++) {
			list [i] = i;
		}
		int [] test = {187,254,0,81,169,219,1,190,19,102,255,56,46,32,2,216};
		System.out.println(" Denna lista ska göras om" +Arrays.toString(list));
		System.out.println(" dessa nummer gör om listaN" + Arrays.toString(test));
	
		
		//forloop to go thrue every element in the input array. 
		for ( int i = 0; i < 16;i++) {
			
			length = test[i];
			int temp2 = length;
			int temp = pointer;
			System.out.println(" round " + i);
			if(i == 0)
			System.out.println(Arrays.toString(list));
			System.out.println("The input is " + length);
			System.out.println("pointer points at int  " + list[pointer] + " in the array ");
			
					for(int j = 0; j < length;j++) {
						
						s.push(list[pointer]);
						
						if (pointer == list.length-1) {
							pointer = 0;
//						System.out.println("hej din bajs");
							

						}
						else {pointer++;}
					}
				
			
				for( int j = 0;  j < length;j++) {
					list[temp]= s.pop();
					
					if(temp == list.length-1) {
//						System.out.println("bajsa p� dig");
						temp = 0;
						
					}
					else {temp++;}
				}
		
			System.out.println( "SkipSize is " + skipSize);
			System.out.println(Arrays.toString(list));
			
			
			if(pointer + skipSize > list.length-1) {
				int kvar = (pointer+skipSize) % 256 ;
				pointer  = kvar;
				temp = pointer;
			}
			else {
				pointer = pointer + skipSize;
				temp = pointer;
			}
			skipSize++;
			
		}
		System.out.println(Arrays.toString(list));
		int i = list[0]*list[1];
		System.out.println("Part 1: " + i);
		
		
	}

	
	
	
	
	
	

}
