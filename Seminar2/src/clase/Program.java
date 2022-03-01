package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> angajati;
        AngajatiReader readerAngajati = new AngajatiReader();
        try {
            angajati = readerAngajati.citireAplicants("Fisiere/angajati.txt");
            for (Aplicant angajat : angajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}