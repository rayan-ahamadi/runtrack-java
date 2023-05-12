package jour02;
import java.util.*;
public class job08 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int compteur = 0;
        int numero = scanner.nextInt();
        while (numero != 0) {
            numero /= 10;
            compteur++;
        }
        System.out.println("Le nombre de chiffres dans le nombre est : " + compteur);
        scanner.close();
    }
}
