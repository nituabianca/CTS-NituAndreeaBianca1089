package cerinta3Observer;

import java.util.HashSet;
import java.util.Set;

public class Avion implements Subiect{
    private Set<Observer> observers;
    private int nrZbor;

    public Avion(int nrZbor) {
        this.nrZbor = nrZbor;
        observers = new HashSet<>();
    }
    @Override
    public void activeazaAnunturi(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezactiveazaAnunturi(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifica(String anunt) {
        for (Observer observer : observers) {
            observer.primesteAnunt(anunt);
        }
    }

    public void decoleaza() {
    	notifica("Avionul " + nrZbor + " va decola.");
    }


    public void aterizeaza() {
    	notifica("Avionul " + nrZbor + " va ateriza.");
    }
}
