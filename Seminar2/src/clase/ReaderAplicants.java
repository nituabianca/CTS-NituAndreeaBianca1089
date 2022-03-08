package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReaderAplicants {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}