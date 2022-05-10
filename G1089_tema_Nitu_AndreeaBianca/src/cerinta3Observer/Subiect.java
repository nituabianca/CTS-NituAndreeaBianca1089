package cerinta3Observer;

public interface Subiect {
	void notifica(String anunt);
	void activeazaAnunturi(Observer observer);
	void dezactiveazaAnunturi(Observer observer);
	
}
