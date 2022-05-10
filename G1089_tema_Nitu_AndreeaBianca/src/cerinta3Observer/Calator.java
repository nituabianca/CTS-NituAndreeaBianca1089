package cerinta3Observer;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void primesteAnunt(String anunt) {
        System.out.println(nume + ", ati primit urmatorul anunt: " + anunt);
    }

}
