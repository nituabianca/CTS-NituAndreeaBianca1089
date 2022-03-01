package clase;
public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumiriProiecte;
    protected static int pragPunctaj = 80;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareStatut() {
        if (punctaj > pragPunctaj)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public static int getPragPunctaj() {
        return pragPunctaj;
    }

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public String[] getDenumirProiect() {
        return denumiriProiecte;
    }



    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nr_proiecte;
        this.denumiriProiecte = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setDenumiriProiecte(int nr_proiecte, String[] denumireProiect) {
        this.nrProiecte = nr_proiecte;
        this.denumiriProiecte = new String[nr_proiecte];
        for(int i=0; i < nr_proiecte; i++)
        {
            this.denumiriProiecte[i] = denumireProiect[i];
        }
    }

    public void afisareSalariuZilnic(int salariu) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste" + salariu + " Euro/zi in proiect.");
    }

}