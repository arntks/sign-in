package klasser;

public class Skilt_med_tekst extends Skilt{
	
	private String tekst;
	
	public Skilt_med_tekst(int skiltnr, String tekst){
		this.skiltnr = skiltnr;
		this.skiltgruppe = 2;
		this.tekst = tekst;
	}
	
	public String hentTekst(){
		return this.tekst;
	}

	@Override
	public void hentBilde() {
		//metode som henter ut bilde 
		
		//filnavn11
		
	}

}
