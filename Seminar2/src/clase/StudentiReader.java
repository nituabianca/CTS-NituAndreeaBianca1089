package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements AplicantiReader {
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student studentNou = new Student();

            AplicantReader.citireAplicant(input, studentNou);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

            studentNou.setAn_studii(an_studii);
            studentNou.setFacultate(facultate);

            studenti.add(studentNou);
        }
        input.close();
        return studenti;
    }
}