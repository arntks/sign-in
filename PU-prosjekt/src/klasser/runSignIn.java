package klasser;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class runSignIn {
	
	
	public static void main(String[] args){
		String nokkel = lesKort() + ".txt";
		Splitt splitt = new Splitt(nokkel);
		File fil = splitt.getFile();
		splitt.dele(fil);
		ArrayList<Skilt> skilt = splitt.getSkiltGruppe();
		
		for (int i = 0; i < skilt.size(); i++){
			System.out.println("Skiltgruppe: " + skilt.get(i).getSkiltgruppe() +
					", Skiltnummer: " + skilt.get(i).getSkiltnr());
		}
	}

	private static String lesKort(){
		Scanner scanner = new Scanner(System.in);
		String kortnr = scanner.next(); 
		scanner.close();
		return kortnr;
	}
	
}
