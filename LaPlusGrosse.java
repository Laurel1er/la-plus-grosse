import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LaPlusGrosse {
    
        public static void main(String[] args) throws FileNotFoundException, IOException {
 
            List<Personne> records = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader("LargeDataSet copy.csv"))) {
                /*String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    Personne personne = new Personne(values[0], values[1], values[2], values[3], values[4], values[5]);
                    records.add(personne);*/

                // Filtre depuis Gemini --> A revoir?!
                Map<String, Long> pcByCountry = br.lines()
                    .map(line -> line.split(";"))
                    .collect(Collectors.groupingBy(fields -> fields[4], Collectors.counting()));
                System.out.println(pcByCountry);
                
            }

            List<String> countryAndPostalCode = records.stream()
                .map(Personne::getCountryAndPostalCode)
                .collect(Collectors.toList());

            System.out.println(countryAndPostalCode);
        }
}