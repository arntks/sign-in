package klasser;

import java.util.Scanner;
import java.io.File;

public class runSignIn {
	
	public static void main(String[] args){
		File nøkkel = lesKort();
		Splitt fil = new Splitt(nøkkel);
		fil.dele();
	}

	private static File lesKort(){
		Scanner input = new Scanner(System.in);
		File kortnr = new File(input.nextLine());
		input.close();
		return kortnr;
	}
	
}
