package klasser;

import java.util.Scanner;
import java.io.File;

public class runSignIn {
	
	
	public static void main(String[] args){
		String nøkkel = lesKort() + ".txt";
		Splitt splitt = new Splitt(nøkkel);
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
