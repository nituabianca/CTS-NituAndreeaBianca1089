package clase;

public abstract class DecoratorAbstract implements Printer{
	Printer printer;
	
	public abstract void printeazaMesaj();
	
	
	public DecoratorAbstract(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void print() {
		printer.print();
		
	}

}
