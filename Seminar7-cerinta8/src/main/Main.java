package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class Main {
	public static void main(String[] args) {
	MijlocTransport autobuz=new Autobuz("Andrei", 20, 3);
	autobuz.opresteInStatie();
	
	MijlocTransport autobuz1=new Autobuz("Andrei", 20, 3);
	autobuz1.opresteInStatie();
	MijlocTransport autobuzDeNoapte=new AutobuzDeNoapte((Autobuz)autobuz1);
	autobuzDeNoapte.opresteInStatie();
	
	}

}
