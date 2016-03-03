package klasser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Splitt {

	private File fil;
	private int skiltgr;
	private int skiltnr;
	private String tekst;
	private ArrayList<Skilt> skiltGruppe = new ArrayList<Skilt>();
	
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
					
					if (s.length > 2){
						this.tekst = s[2];
					}
				this.makeSkilt();
				}	
			
			scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();}
			}

	public void makeSkilt(){
		
		if(skiltgr == 1){
			this.skiltGruppe.add(new SkiltFart(skiltnr));
		}else if(skiltgr ==2){
			this.skiltGruppe.add(new Skilt_med_tekst(skiltnr, tekst));
		}else if(skiltgr == 3){
			this.skiltGruppe.add(new Skilt_uten_tekst(skiltnr));
		}else{
			throw new IllegalArgumentException("DETTE ER IKKE EN SKILTGRUPPE!!!!");
		}

	}
	
	public ArrayList<Skilt> getSkiltGruppe(){
		return skiltGruppe;
	}
	
	
}