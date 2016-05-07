import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdInReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
