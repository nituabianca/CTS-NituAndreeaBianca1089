package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements AplicantiReader {
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajatNou = new Angajat();

            AplicantReader.citireAplicant(input2, angajatNou);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajatNou.setSalariu(salariu);
            angajatNou.setOcupatie(ocupatie);

            angajati.add(angajatNou);
        }
        input2.close();
        return angajati;
    }
}