package klasser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Splitt {

	private File fil;
	private int skiltgr;
	private int skiltnr;
	private String tekst;
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
					String[] s = skilt.split("#");
					this.skiltgr = Integer.parseInt(s[0]);
					this.skiltnr = Integer.parseInt(s[1]);
					
					if (s.length < 2){
						this.tekst = s[2];
					}
				}	
			
			scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();}
			}

	public Splitt(File fil){
		this.fil = fil;
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