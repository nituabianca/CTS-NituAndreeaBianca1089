package main;

import state.Autobuz;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz(120);
		autobuz.pleacaInCursa();
		autobuz.ieseDinService();
		autobuz.ajungeLaCapat();
		autobuz.intraInService();
		autobuz.ajungeLaCapat();
		autobuz.ieseDinService();

	}

}
