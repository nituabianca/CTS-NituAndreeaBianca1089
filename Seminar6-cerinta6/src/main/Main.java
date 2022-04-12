package main;

import composite.Autobuz;
import composite.Flota;
import composite.Nod;

public class Main {

	public static void main(String[] args) throws Exception {
		Autobuz autobuz1=new Autobuz("BMW", "E45S", 56);
		Autobuz autobuz2=new Autobuz("BMW", "E8238S", 66);
		Autobuz autobuz3=new Autobuz("Otokar", "w2e5S", 34);
		Autobuz autobuz4=new Autobuz("Otokar", "13e5S", 53);
		Autobuz autobuz5=new Autobuz("Mercedes", "e2e5S",61);
		Autobuz autobuz6=new Autobuz("Mercedes", "E4sqs5S", 73);
		
		Nod mari=new Flota("Autobuze mari");
		Nod mijlocii=new Flota("Autobuze mijlocii");
		Nod mici=new Flota("Autobuze mici");
		Nod flota=new Flota("STB");
		
		try {	
		
		mici.adaugaNod(autobuz1);
		mici.adaugaNod(autobuz3);
		
		mijlocii.adaugaNod(autobuz4);
		mijlocii.adaugaNod(autobuz5);
		
		mari.adaugaNod(autobuz2);
		mari.adaugaNod(autobuz6);
		
		flota.adaugaNod(mici);
		flota.adaugaNod(mijlocii);
		flota.adaugaNod(mari);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("garantie pt intreaga flota: "+flota.calculeazaSumGarantie(2));
		System.out.println("garantie pt flota-mij: "+mijlocii.calculeazaSumGarantie(2));
		
	}

}
