import java.util.Scanner;
import java.util.ArrayList;
public class job13 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre");
        int nb = scanner.nextInt();
        int i = 0;
        ArrayList<Integer> liste = new ArrayList<>();
        while (i != nb){
            liste.add(i);
            i++;
        }
        System.out.println("Les nombres avant sont : " + liste);
        

        scanner.close();

    }
}
