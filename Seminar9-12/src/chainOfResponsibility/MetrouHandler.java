package chainOfResponsibility;

public class MetrouHandler extends Handler{

	public MetrouHandler(int limita) {
		super(limita);
		
	}

	@Override
	public void afisareRecomandare(int distanta) {
		if(distanta<limita) {
			System.out.println("Recomandarea dvs, este sa folositi troleibuzul");
		}
		else {
			super.nextHandler.afisareRecomandare(distanta);
		}
		
	}

}
