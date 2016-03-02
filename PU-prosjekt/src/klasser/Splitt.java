package klasser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Splitt {

	private File fil;
	private int skiltgr;
	private int skiltnr;
	private String tekst;

	public Splitt(File fil){
		this.fil = fil;
	}


	public void dele(){
		Scanner scanner;
		this.tekst = null;
		try {
			scanner = new Scanner(this.fil);
			while(scanner.hasNextLine()){
				String skilt = scanner.nextLine();
				String[] line = skilt.split("#", 2);
				this.skiltgr = Integer.parseInt(line[0]);
				this.skiltnr = Integer.parseInt(line[1]);

				if (line[2] != null){
					this.tekst = line[2];
				}
			}	

			scanner.close();}
		catch (FileNotFoundException ex) 
		{
			System.out.println("File does not found");
		}
	}

	public void makeSkilt(){
		if(skiltgr == 1){
			Skilt  skilt1 = new SkiltFart(skiltnr);
		}else if(skiltgr ==2){
			Skilt  skilt2 = new Skilt_med_tekst(skiltnr, tekst);

		}else if(skiltgr == 3){
			Skilt  skilt3 = new Skilt_uten_tekst(skiltnr);
		}else{
			throw new IllegalArgumentException("DETTE ER IKKE EN SKILTGRUPPE!!!!");
		}

	}

}