package klasser;

public abstract class Skilt {
	
	protected int skiltnr;
	protected int skiltgruppe;
	
	public int getSkiltgruppe() {
		return skiltgruppe;
	}
	
	public int getSkiltnr() {
		return skiltnr;
	}
	
	public abstract void hentBilde();
	//metode som henter ut bilde basert på skiltnr og gruppe
	
}
