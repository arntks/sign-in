package klasser;
<<<<<<< HEAD

import java.io.File;
=======
>>>>>>> 0113966b8ef654e54377d951fb749be321479cd7
import java.util.Scanner;
import java.io.File;

public class runSignIn {
	
	
	public static void main(String[] args){
<<<<<<< HEAD
		String n�kkel = lesKort();
		Splitt splitt = new Splitt(n�kkel);
		File fil = splitt.getFile();
		splitt.dele(fil);
	}

	private static String lesKort(){
		Scanner scanner = new Scanner(System.in);
		String kortnr = scanner.next(); 
		scanner.close();
=======
		File n�kkel = lesKort();
		Splitt fil = new Splitt(n�kkel);
		fil.dele();
	}

	private static File lesKort(){
		Scanner input = new Scanner(System.in);
		File kortnr = new File(input.nextLine());
		input.close();
>>>>>>> 0113966b8ef654e54377d951fb749be321479cd7
		return kortnr;
	}
	
}
