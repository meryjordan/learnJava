/*
 * Author: Ing. Marie Kratochvilova
 * Date: 29.11.2017
 * Project: Create function for write even lines from file
 *  
 * */
package workWithFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Workwithfile {
	
	public static void writeEvenLineFromFile() {
		try{
			BufferedReader inputFile = new BufferedReader(new FileReader("myFile.txt")); //load file
			String strLine;
			int i = 0, countChar = 0;
			List<String> oddLine = new ArrayList<>(); //create array list for oddLine
			List<String> evenLine = new ArrayList<>();//create array list for evenLine
			
			while ((strLine = inputFile.readLine()) != null) {
				if ((i % 2) == 0) oddLine.add(strLine); 
				else evenLine.add(strLine);
				i++;
			}
			//write even line from file
			/*for (i = 0; i < evenLine.size(); i++) {
				System.out.println(evenLine.get(i));
			}*/
			
			//write number of occurrences of char A
			String strList = evenLine.toString();
			 for (i = 0; i < strList.length(); i++) {
				 if (strList.charAt(i) == 'a') {
					 countChar++;
				 }
			 }
			System.out.println("The number of occurrences of a char A is - " + countChar);
			
			
			inputFile.close();
			
		}catch(IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		// call function for write even lines from file
		writeEvenLineFromFile();
	}
	
}
