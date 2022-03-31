package factory;

public class Troleibuzfactory implements Factory{
	@Override
	public MijlocTransport createObject(String nrInmatriculare) {
		
		return new Troleibuz(nrInmatriculare);
	}
}
