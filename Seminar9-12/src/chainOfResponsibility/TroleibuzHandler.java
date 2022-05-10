package chainOfResponsibility;

public class TroleibuzHandler extends Handler{

	public TroleibuzHandler(int limita) {
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
