package state;

public class Autobuz {
	private Stare stare;
	private int nrAutobuz;
	
	public Autobuz(int nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
		stare = new LaCapatDeLinie();
	}
	
	public Stare getStare() {
		return stare;
	}
	
	
	public int getNrAutobuz() {
		return nrAutobuz;
	}
	
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void setNrAutobuz(int nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}
	
	public void pleacaInCursa() {
		InCursa inCursa=new InCursa();
		inCursa.actualizareStare(this);
	}
	
	public void intraInService() {
		new LaReparat().actualizareStare(this);
	}
	
	public void ieseDinService() {
		new LaCapatDeLinie().actualizareStare(this);
	}
	
	public void ajungeLaCapat() {
		new LaCapatDeLinie().actualizareStare(this);
	}

	
	
}
