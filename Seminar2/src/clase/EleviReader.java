package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements AplicantiReader{
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elevNou = new Elev();

            AplicantReader.citireAplicant(input2, elevNou);

            int clasa = input2.nextInt();
            String tutore = input2.next();

            elevNou.setClasa(clasa);
            elevNou.setTutore(tutore);

            elevi.add(elevNou);
        }

        input2.close();
        return elevi;
    }
}