package cerinta3Observer;

public class Main {

	public static void main(String[] args) {
        Avion avion = new Avion(133821);
        Calator calator1 = new Calator("Nitu");
        Calator calator2 = new Calator("Andreea");
        Calator calator3 = new Calator("Bianca");
        avion.activeazaAnunturi(calator1);
        avion.decoleaza();
        avion.dezactiveazaAnunturi(calator1);
        avion.decoleaza();
        avion.dezactiveazaAnunturi(calator2);
        avion.activeazaAnunturi(calator3);
        avion.aterizeaza();

	}

}
