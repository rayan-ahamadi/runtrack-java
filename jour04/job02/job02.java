package jour04.job02;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class job02 implements Runnable{
    public void run() {
        Instant debut = Instant.now();
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        try (FileWriter writer = new FileWriter("output.txt")) {
            String str = "";

            System.out.println("Veuillez saisir un nombre");
            int nb = scanner.nextInt();

            for (int i=0;i<nb;i++){
                int index = random.nextInt(alphabet.length);
                str += alphabet[index];
            }

            writer.write(str + "\n");
            writer.close();
            Instant fin = Instant.now();
            System.out.println("Chaine de caractères: " + str);
            System.out.println("temps d'éxecution : " + Duration.between(debut, fin) + "ms");
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        
      }
}

