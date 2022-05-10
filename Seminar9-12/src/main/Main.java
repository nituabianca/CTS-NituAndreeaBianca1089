package main;

import chainOfResponsibility.AutobuzHandler;
import chainOfResponsibility.Handler;
import chainOfResponsibility.MetrouHandler;
import chainOfResponsibility.TramvaiHandler;
import chainOfResponsibility.TroleibuzHandler;

public class Main {

	public static void main(String[] args) {
		Handler troleibuz=new TroleibuzHandler(3);
		Handler autobuz=new AutobuzHandler(3);
		Handler tramvai=new TramvaiHandler(3);
		Handler metrou=new MetrouHandler(3);
		
		troleibuz.setNextHandler(autobuz);
		autobuz.setNextHandler(tramvai);
		tramvai.setNextHandler(metrou);

		troleibuz.afisareRecomandare(8);
		troleibuz.afisareRecomandare(1);
		troleibuz.afisareRecomandare(14);
		troleibuz.afisareRecomandare(4);

		System.out.println("Cluj");

		Handler troleibuzCluj=new TroleibuzHandler(2);
		Handler autobuzCluj=new AutobuzHandler(5);
		Handler tramvaiCluj=new TramvaiHandler(1000);
		Handler metrouCluj=new MetrouHandler(3);
		
		metrouCluj.setNextHandler(tramvaiCluj);
		tramvaiCluj.setNextHandler(troleibuzCluj);
		troleibuzCluj.setNextHandler(autobuzCluj);
		
		metrouCluj.afisareRecomandare(1);
		metrouCluj.afisareRecomandare(2);
		
	
	
	}

}
