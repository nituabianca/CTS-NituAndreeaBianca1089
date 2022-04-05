package builderV2;

public class AutobuzLinie {
	private int nrLinie;
	private String numeSofer;
	private boolean deschideUsile;
	private boolean areOprire;
	private String textRulat;
	private String model;
	private int nrCalatori;
	
	public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile, boolean areOprire, String textRulat,
			String model, int nrCalatori) {
		this.nrLinie = nrLinie;
		this.numeSofer = numeSofer;
		this.deschideUsile = deschideUsile;
		this.areOprire = areOprire;
		this.textRulat = textRulat;
		this.model = model;
		this.nrCalatori = nrCalatori;
	}
	@Override
	public String toString() {
		return "AutobuzLinie [nrLinie=" + nrLinie + ", numeSofer=" + numeSofer + ", deschideUsile=" + deschideUsile
				+ ", areOprire=" + areOprire + ", textRulat=" + textRulat + ", model=" + model + ", nrCalatori="
				+ nrCalatori + "]";
	}
}
