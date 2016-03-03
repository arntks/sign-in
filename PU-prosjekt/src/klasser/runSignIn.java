package klasser;

import java.util.Scanner;
import java.io.File;

public class runSignIn {
	
	
	public static void main(String[] args){
		String nokkel = lesKort() + ".txt";
		Splitt splitt = new Splitt(nokkel);
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
