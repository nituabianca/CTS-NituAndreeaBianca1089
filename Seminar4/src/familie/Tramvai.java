package familie;

public class Tramvai extends MijlocTransport{
	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		String result="Tramvai "+nrInmatriculare;
		return result;
	}
}
