package jour02;
import java.util.Scanner;


public class job3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nb = scanner.nextInt();
        for (int i=0;i<=10;i++){
            int result = nb * i;
            System.out.println(nb + " X " + i + "=" + result);
        }
        scanner.close();
    }
}
