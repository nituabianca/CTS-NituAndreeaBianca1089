package clase;

public class DecoratorConcret extends DecoratorAbstract{

	private String mesaj;
	public DecoratorConcret(Printer printer, String string) {
		super(printer);
		this.mesaj=mesaj;
	}
	@Override
	public void printeazaMesaj() {
		System.out.println(mesaj);
		
	}
	
	

}
