package klasser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Splitt {

	private File fil;
	private int skiltgr;
	private int skiltnr;
	private String tekst;
<<<<<<< HEAD
	private String filNavn;
	
	public Splitt(String fil){
		this.fil = new File (fil);
	}
	
	public File getFile(){
		return this.fil;
	}
	
	
	public void dele(File fil){
			Scanner scanner;
			this.tekst = null;
			try {
				scanner = new Scanner(fil);
				while(scanner.hasNextLine()){
					String skilt = scanner.nextLine();
					System.out.println(skilt);
					String[] s = skilt.split("#");
					this.skiltgr = Integer.parseInt(s[0]);
					this.skiltnr = Integer.parseInt(s[1]);
					
					if (s[2] != null){
						this.tekst = s[2];
					}
				}	
			
			scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
=======

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
>>>>>>> 0113966b8ef654e54377d951fb749be321479cd7
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