package klasser;

import java.io.File;
import java.util.Scanner;

public class runSignIn {
	
	
	public static void main(String[] args){
		String n�kkel = lesKort();
		Splitt splitt = new Splitt(n�kkel);
		File fil = splitt.getFile();
		splitt.dele(fil);
	}

	private static String lesKort(){
		Scanner scanner = new Scanner(System.in);
		String kortnr = scanner.next(); 
		scanner.close();
		return kortnr;
	}
	
}
