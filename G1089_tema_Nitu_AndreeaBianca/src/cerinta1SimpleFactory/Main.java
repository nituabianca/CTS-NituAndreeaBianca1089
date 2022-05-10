package cerinta1SimpleFactory;

public class Main {

	public static void main(String[] args) {
		BiletFactory fabrica=new BiletFactory();
		Bilete bilete=null;
		try {
		bilete=fabrica.creeaza(TipBilet.BUSINESS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		bilete.descriereBilet();
		
		try {
		bilete=fabrica.creeaza(TipBilet.ECONOMIC);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		bilete.descriereBilet();
	}

}
