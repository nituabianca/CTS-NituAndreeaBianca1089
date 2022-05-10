package cerinta2Proxy;

public class BiletRezervare implements Rezervare{
	Bilet bilet;
	
	
	public BiletRezervare(Bilet bilet) {
		this.bilet = bilet;
	}


	@Override
	public void anuleazaRezervare() {
		bilet.anuleazaRezervare();
		
	}

}
