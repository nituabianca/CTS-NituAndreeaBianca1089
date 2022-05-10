package cerinta2Proxy;

public class Main {

	public static void main(String[] args) {
        Rezervare rezervare1 = new Bilet(145);
        rezervare1.anuleazaRezervare();
        Rezervare rezervare2 = new Bilet(55);
        rezervare2.anuleazaRezervare();
        Rezervare rezervare3 = new Bilet(335);
        rezervare3.anuleazaRezervare();

	}

}
