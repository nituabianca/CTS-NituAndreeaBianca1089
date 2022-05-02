package main;



import observer.Autobuz;
import observer.Calator;
import observer.Observer;
import observer.Subiect;

public class Main {

	public static void main(String[] args) {
		Subiect autobuz=new Autobuz(32);
        Observer calator1=new Calator("Bianca");
        Observer calator2=new Calator("Cristi");
        Observer calator3=new Calator("Iulia");

        autobuz.adaugaCalatori(calator1);
        autobuz.adaugaCalatori(calator2);
        autobuz.notificareCalatori();
        autobuz.adaugaCalatori(calator3);
        autobuz.stergeCalatori(calator2);
        autobuz.notificareCalatori();

	}

}
