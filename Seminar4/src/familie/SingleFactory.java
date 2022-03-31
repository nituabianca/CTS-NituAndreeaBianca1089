package familie;
//Companie de transport public in comun - STB
//Trebuie implementat modulul care se ocupa de crearea de obiecte din familia MijlocTransport. 
//Compania detine urmatoarele tipuri de mijloace de transport: autobuz, troleibuz si tramvai. 
//Sa se implementeze modulul care creeaza obiecte din aceasta familie.

public class SingleFactory {
	public MijlocTransport createObject(TipTransport tip, String nr)
	{
		switch(tip) {
			case AUTOBUZ:
				return new Autobuz(nr);
			case TRAMVAI:
				return new Tramvai(nr);
			case TROLEIBUZ:
				return new Troleibuz(nr);
		}
		return null;
	}
}
