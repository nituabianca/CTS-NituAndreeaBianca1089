package memento;

public class Autobuz {
	private String numeSofer;
	private double consumMediu;
	private int nrLocuri;
	private String model;
	private int anFabricatie;
	public Autobuz(String numeSofer, double consumMediu, int nrLocuri, String model, int anFabricatie) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.nrLocuri = nrLocuri;
		this.model = model;
		this.anFabricatie = anFabricatie;
	}
	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", consumMediu=" + consumMediu + ", nrLocuri=" + nrLocuri
				+ ", model=" + model + ", anFabricatie=" + anFabricatie + "]";
	}
	
	public MementoAutobuz creeazaMemento() {
		return new MementoAutobuz(this.numeSofer, this.consumMediu);
	}
	
	public void restaurareMemento(MementoAutobuz mementoAutobuz) {
		this.numeSofer=mementoAutobuz.getNumeSofer();
		this.consumMediu=mementoAutobuz.getConsumMediu();
	}
	public String getNumeSofer() {
		return numeSofer;
	}
	public double getConsumMediu() {
		return consumMediu;
	}
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	public void setConsumMediu(double consumMediu) {
		this.consumMediu = consumMediu;
	}
	
	
}
