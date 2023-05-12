package jour02;
import java.util.*;
public class job11 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taille du triangle :");
        int taille = scanner.nextInt(); 
        String etoile = "";
        for (int i=0; i<=taille; i++){
            etoile += "*";
            System.out.println(etoile);
        }
        scanner.close();

    }
}
