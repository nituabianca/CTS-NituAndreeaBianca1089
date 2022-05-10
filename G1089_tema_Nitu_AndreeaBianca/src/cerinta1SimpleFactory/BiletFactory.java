package cerinta1SimpleFactory;

public class BiletFactory {
	public static Bilete creeaza(TipBilet tip) throws Exception {
		switch(tip) {
		case BUSINESS:
			return new BiletBusinessClass();
		case ECONOMIC:
			return new BiletEconomicClass();
		default:
			throw new Exception("Nu exista acest tip de bilet.");	
		}
	}

}
