package sources.animals;

public class Main {

	public static void main(String[] args) {
		ZOO zoo=new ZOO("zoo1", new IngrijitorZOO("Dan"));
		Girafa g=new Girafa("girafa 1");
		Zebra z=new Zebra("zebra 1");
		Girafa g1=new Girafa("girafa 2");
		Zebra z1=new Zebra("zebra 2");
		
		zoo.adaugaAnimal(g);
		zoo.adaugaAnimal(z);
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(z1);
		
		zoo.hranesteAnimale();
		
		

	}

}
