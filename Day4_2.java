
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Day4_2 {

	public static  int counter;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader in = new FileReader("Day4.txt");
		
		 
		Scanner s = new Scanner(in);
			String line;
			while ( s.hasNextLine()) {
				line  = s.nextLine();
				String [] sArray = line.split(("\\s+"));
				if(noAnagrams(sArray)){
					counter++;
				}
						
					}
						
			System.out.println(counter);
					
				}
			
	private static boolean noAnagrams(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (isAnagram(s[i], s[j])) {
                    return false;
                }
            }
        }
        return true;
	}
        
        private static boolean isAnagram(String s, String t) {
            char[] c = s.toCharArray();
            char[] d = t.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            return Arrays.equals(c, d);

        }

	
}