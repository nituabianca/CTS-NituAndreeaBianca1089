package clase;

public class Autobuz implements MijlocTransport{
	private String numeSofer;
	private int nrLocuri;
	private int nrCalatori;
	
	public int getNrCalatori() {
		return nrCalatori;
	}

	public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
		super();
		this.numeSofer = numeSofer;
		this.nrLocuri = nrLocuri;
		this.nrCalatori = nrCalatori;
	}

	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", nrLocuri=" + nrLocuri + ", nrCalatori=" + nrCalatori + "]";
	}


	@Override
	public void opresteInStatie() {
		System.out.println("Autobuzul a oprit in statie cu "+this.nrCalatori);
		
	}

	@Override
	public void setNrCalatori(int nrCalatori) {
		this.nrCalatori=nrCalatori;
		
	}

}
