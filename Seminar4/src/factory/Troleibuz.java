package factory;

public class Troleibuz extends MijlocTransport{
	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		String result="Troleibuz "+nrInmatriculare;
		return result;
	}
}
