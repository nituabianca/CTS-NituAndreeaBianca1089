package cerinta2Proxy;

public class Bilet implements Rezervare{
	private int pret;
	
	public Bilet(int pret) {
		super();
		this.pret = pret;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Bilet [pret=" + pret + "]";
	}

	@Override
	public void anuleazaRezervare() {
        if (pret < 100) {
            System.out.println("Rezervarea a fost anulata.");
        } else {
            System.out.println("Rezervarea nu indeplineste conditiile pentru anulare gratuita.");
        }
	}

}
