package clase;

public class PlataCardBancar implements ModalitatePlata{
	@Override
	public void plateste(float sumaDePlata) {
		System.out.println("S-a achitat cu cardul bancar suma de "+sumaDePlata+" lei");
		
	}
}
