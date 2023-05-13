package jour03;
import java.util.*;
public class job05 {
    public static void main(String[] args){
        int[] monTableau = {1, 2, 3, 2, 4, 1, 5, 4, 6, 7, 5, 8};

        // Trier le tableau
        Arrays.sort(monTableau);

        // Parcourir le tableau pour afficher les valeurs uniques
        System.out.println("Les valeurs uniques du tableau sont :");
        for (int i = 0; i < monTableau.length; i++) {
            // Ignorer les doublons
            if (i > 0 && monTableau[i] == monTableau[i-1]) {
                continue;
            }
            System.out.println(monTableau[i]);
        }

    }   

}
