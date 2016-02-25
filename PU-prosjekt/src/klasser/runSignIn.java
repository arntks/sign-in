package klasser;

import java.util.Scanner;

public class runSignIn {
	
	public static void main(String[] args){
		String nøkkel = lesKort();
		System.out.println(nøkkel);
	}

	private static String lesKort(){
		Scanner scanner = new Scanner(System.in);
		String kortnr = scanner.next();
		scanner.close();
		return kortnr;
	}
	
}
