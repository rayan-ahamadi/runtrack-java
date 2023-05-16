package jour04.job03;
import java.util.*;


public class MyThread {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        String text = randomString(length);
        int moitie = text.length() / 2;
        String text1 = text.substring(0, moitie);
        String text2 = text.substring(moitie);

        job03 classThread = new job03(text1);
        job03 classThread1 = new job03(text2);
        Thread thread = new Thread(classThread);
        Thread thread1 = new Thread(classThread1);
        thread.start();
        thread1.start();
        
    }

    public static String randomString(int length){
        Random random = new Random();

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        String str = "";
        for (int i=0;i<length;i++){
            int index = random.nextInt(alphabet.length);
            str += alphabet[index];
        }

        return str;
    }
}
