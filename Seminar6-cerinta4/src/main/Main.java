package main;

import autobuz.AdapterValidatorMetrou;
import autobuz.AdapterValidatorObiecte;
import autobuz.Autobuz;
import metrou.ValidatorMetrou;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz();
		ValidatorMetrou metrou=new ValidatorMetrou();
		
		AdapterValidatorObiecte adaptorObiecte=new AdapterValidatorObiecte(metrou);
		adaptorObiecte.validareBilet();
		adaptorObiecte.validareAbonament();
		
		AdapterValidatorMetrou validator=new AdapterValidatorMetrou();
		validator.validareBilet();
		validator.validareAbonament();

	}

}
