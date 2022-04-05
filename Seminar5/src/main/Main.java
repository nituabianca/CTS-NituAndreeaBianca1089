package main;

import prototype.Autobuz;
import prototype.Tramvai;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz("Dorian");
		try {
		Autobuz autobuz1=(Autobuz) autobuz.copiaza();
		System.out.println(autobuz.toString()+"\n"+autobuz1.toString());
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Tramvai tramvai=new Tramvai("Andrei");
		
	}
}
