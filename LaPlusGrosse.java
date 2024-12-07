import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaPlusGrosse {
    private static final String COMMA_DELIMITER = ";";
    
        public static void main(String[] args) throws FileNotFoundException, IOException {

            List<List<Personne>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("LargeDataSet copy.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(COMMA_DELIMITER);
                    System.out.println(values[1]);
//                    records.add(Arrays.asList(values));
            }
//            for (List<String> list : records) {
//                System.out.println(list);
//            }
        }
    }
    
}