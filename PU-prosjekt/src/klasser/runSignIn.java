package klasser;

import java.util.Scanner;

public class runSignIn {
	
	public static void main(String[] args){
		String n�kkel = lesKort();
		System.out.println(n�kkel);
	}

	private static String lesKort(){
		Scanner scanner = new Scanner(System.in);
		String kortnr = scanner.next();
		scanner.close();
		return kortnr;
	}
	
}
