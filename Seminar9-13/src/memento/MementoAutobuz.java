package memento;

public class MementoAutobuz {
	private String numeSofer;
	private double consumMediu;
	public MementoAutobuz(String numeSofer, double consumMediu) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
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
