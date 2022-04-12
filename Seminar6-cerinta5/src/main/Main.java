package main;

import clase.Autobuz;
import clase.Facade;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz();
		Facade.deschideUsi(autobuz);
		Facade.lasaLiberUsi(autobuz);
	}
}
