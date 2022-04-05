package builder;

public class AutobuzLinie {

	private int nrLinie;
	private String numeSofer;
	private boolean deschideUsile;
	private boolean areOprire;
	private String textRulat;
	private String model;
	private int nrCalatori;
	
	
	public AutobuzLinie() {

		this.nrLinie = 1;
		this.numeSofer = "Andrei";
		this.deschideUsile = true;
		this.areOprire = true;
		this.textRulat = "Hello";
		this.model = "Renault";
		this.nrCalatori = 60;
	}
	public int getNrLinie() {
		return nrLinie;
	}
	public void setNrLinie(int nrLinie) {
		this.nrLinie = nrLinie;
	}
	public String getNumeSofer() {
		return numeSofer;
	}
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	public boolean isDeschideUsile() {
		return deschideUsile;
	}
	public void setDeschideUsile(boolean deschideUsile) {
		this.deschideUsile = deschideUsile;
	}
	public boolean isAreOprire() {
		return areOprire;
	}
	public void setAreOprire(boolean areOprire) {
		this.areOprire = areOprire;
	}
	public String getTextRulat() {
		return textRulat;
	}
	public void setTextRulat(String textRulat) {
		this.textRulat = textRulat;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrCalatori() {
		return nrCalatori;
	}
	public void setNrCalatori(int nrCalatori) {
		this.nrCalatori = nrCalatori;
	}
	@Override
	public String toString() {
		return "AutobuzLinie [nrLinie=" + nrLinie + ", numeSofer=" + numeSofer + ", deschideUsile=" + deschideUsile
				+ ", areOprire=" + areOprire + ", textRulat=" + textRulat + ", model=" + model + ", nrCalatori="
				+ nrCalatori + "]";
	}

	
	
	
}
