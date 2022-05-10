package main;

import command.Autobuz;
import command.ComandaPlecareTraseu;
import command.Operator;

public class Main {

	public static void main(String[] args) {
		Operator op=new Operator();
		Autobuz a1=new Autobuz("bmw");
		Autobuz a2=new Autobuz("audi");
		
		ComandaPlecareTraseu cpt=new ComandaPlecareTraseu(1, a1);
		op.invoca(cpt);
		op.invoca(new ComandaPlecareTraseu(2, a2));
		op.invoca(new ComandaPlecareTraseu(3,a1));
		op.invoca(new ComandaPlecareTraseu(4,a1));
		
		op.executaComanda();
		op.executaComanda();
		op.executaComanda();
		op.executaComanda();
	}

}
