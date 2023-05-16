package jour04.job03;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class job03 implements Runnable {
    private String str;
    
    public job03(String str) {
        this.str = str;
    }

    public void run() {
        Instant debut = Instant.now();
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(str + "\n");
            writer.close();
            Instant fin = Instant.now();
            System.out.println("Chaine de caractères: " + str);
            System.out.println("temps d'éxecution : " + Duration.between(debut, fin) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
