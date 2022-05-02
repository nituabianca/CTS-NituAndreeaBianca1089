package main;

import template.Tramvai;
import template.TramvaiProbe;

public class Main {

	public static void main(String[] args) {
	        Tramvai tramvai=new Tramvai();
	        tramvai.parcurgeTraseu();
	        tramvai.parcurgeTraseuInvers();

	        //doar de exemplificat faptul ca pastreaza acelasi template
	        TramvaiProbe tramvaiProbe=new TramvaiProbe();
	        tramvaiProbe.parcurgeTraseu();

	}

}
