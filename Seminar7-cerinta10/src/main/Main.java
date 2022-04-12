package main;

import clase.PlataCardBancar;
import clase.PlataCardSTB;
import clase.PlataSMS;
import clase.Validator;

public class Main {

	public static void main(String[] args) {
		PlataCardSTB plataCardStb=new PlataCardSTB();
		Validator validator=new Validator(plataCardStb, 2);
		PlataSMS plataSms=new PlataSMS();
		Validator validator2=new Validator(plataSms, 2);
		validator.platesteCalatorie();
		PlataCardBancar plataCardBancar=new PlataCardBancar();
		validator.setModalitatePlata(plataCardBancar);
		validator.platesteCalatorie();


	}

}
