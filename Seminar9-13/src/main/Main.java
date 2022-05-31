package main;

import memento.Autobuz;
import memento.ManagerMemento;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz("John",11.7,21,"Audi",2010);
		System.out.println(autobuz.toString());

		
		ManagerMemento manager=new ManagerMemento();
		manager.addMemento(autobuz.creeazaMemento());
		
		autobuz.setConsumMediu(14.9);
		autobuz.setNumeSofer("Johnny");
		
		manager.addMemento(autobuz.creeazaMemento());
		
		System.out.println(autobuz.toString());
		autobuz.setNumeSofer("ION");
		System.out.println(autobuz.toString());
		autobuz.restaurareMemento(manager.getMemento(0));
		System.out.println(autobuz.toString());
	}

}
