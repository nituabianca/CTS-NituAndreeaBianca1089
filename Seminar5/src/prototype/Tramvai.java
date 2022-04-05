package prototype;

public class Tramvai implements MijlocTransport {

	private String numeVatman;
	
	
	
	public Tramvai(String numeVatman) {
		this.numeVatman = numeVatman;
	}

	@Override
	public String toString() {
		return "Autobuz [numeVatman=" + numeVatman + "]";
	}
	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) super.clone();
	}

}
