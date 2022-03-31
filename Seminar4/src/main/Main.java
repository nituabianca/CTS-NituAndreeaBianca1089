package main;

import factory.AutobuzFactory;
import familie.MijlocTransport;
import familie.SingleFactory;
import familie.TipTransport;
import singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		//EXERCITIUL 1 - SINGLETON	
		System.out.println("EXERCITIUL 1 - SINGLETON");
		System.out.println();

		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		
		//EXERCITIUL 2 - FACTORY
		System.out.println();
		System.out.println("EXERCITIUL 2 - SINGLE FACTORY");
		System.out.println();
		
		SingleFactory f=new SingleFactory();
		MijlocTransport mt1=f.createObject(TipTransport.AUTOBUZ ,"DB 31 NAB" );
		MijlocTransport mt2=f.createObject(TipTransport.TRAMVAI ,"B 30 NBA" );
		MijlocTransport mt3=f.createObject(TipTransport.TROLEIBUZ ,"B 005 MNA" );
		
		System.out.println(mt1);
		System.out.println(mt2);
		System.out.println(mt3);
		
		//EXERCITIUL 3 - FACTORY
		System.out.println();
		System.out.println("EXERCITIUL 3 - FACTORY");
		System.out.println();
		factory.MijlocTransport autobuz=new AutobuzFactory().createObject("AHSB");
		System.out.println(autobuz.toString());
		
	}

}
