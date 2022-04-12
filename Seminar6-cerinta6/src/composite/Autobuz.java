package composite;

public class Autobuz implements Nod{

	private String producator;
	private String model;
	private int nrLocuri; 
	
	public Autobuz(String producator, String model, int nrLocuri) {
		super();
		this.producator = producator;
		this.model = model;
		this.nrLocuri = nrLocuri;
	}

	@Override
	public String toString() {
		return "Autobuz [producator=" + producator + ", model=" + model + ", nrLocuri=" + nrLocuri + "]";
	}

	@Override
	public void adaugaNod(Nod nod) throws Exception {
		throw new Exception("Nu se poate adauga");
		
	}

	@Override
	public void stergeNod(Nod nod) throws Exception{
		throw new Exception("Nu se poate sterge");
		
	}

	@Override
	public Nod getNod(int poz) throws Exception {
		throw new Exception("Nu se poate obtine");
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println(this.toString());		
	}

	@Override
	public float calculeazaSumGarantie(float pretPerLoc) {
		return nrLocuri*pretPerLoc;
	}


	
}
