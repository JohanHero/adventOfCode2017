import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day9 {

	
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("inputDay9.txt");
		FileOutputStream out = new FileOutputStream("inputDay9FirstFix.txt");
		
		int r;
		while ((r = in.read()) != -1) {
			char c = (char) r;
			if(c == '!'){
				int vaska = in.read();
			}
			else {
				out.write(c);
			}
			
		}
		
		FileInputStream in2 = new FileInputStream("inputDay9FirstFix.txt");
		FileOutputStream out2 = new FileOutputStream("inputDay9SecondFix.txt");
		int garbageCounter = 0;
		int characterCounter = 0;
		
		
		while((r = in2.read( )) != -1){
			characterCounter++;
			char c = (char) r;
			if( c == '<') {
				int vaska = in2.read();
				garbageCounter++;
				garbageCounter--;
				while(vaska != '>') {
					vaska = in2.read();
					garbageCounter++;
				}
				
			}
			else {

			out2.write(c);
			}
		}
		
		
		
		
		FileInputStream in3 = new FileInputStream("inputDay9SecondFix.txt");
		FileOutputStream out3 = new FileOutputStream("inputDay9LastFix.txt");
		
		while((r = in3.read( )) != -1){
			char c = (char) r;
			if( c == ',') {
				
			}
			else {
			out3.write(c);
			}
		}
		
		
		int groupValue = 0;
		int sum = 0;
		FileInputStream in4 = new FileInputStream("inputDay9LastFix.txt");
		while ((r = in4.read()) != -1) {
			char c  = (char) r;
			
			if( c == '{') {
				groupValue++;
				sum = sum+ groupValue;
				
			}
			else {
				groupValue--;
			}
			
		}
		
		System.out.println("Part 1: " + sum);
		System.out.println("Part 2: " +garbageCounter );
		

		}
	}

