package jour02;
import java.util.*;
public class job07 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println("La factorielle du nombre " + n + " est : " + factorielle);
        sc.close();
    }
}
