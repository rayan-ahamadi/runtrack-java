import java.util.Scanner;
public class job14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première valeur : ");
        int var1 = scanner.nextInt();
        System.out.println("Entrez la deuxième valeur : ");
        int var2 = scanner.nextInt();

        System.out.println("La somme des deux valeurs est : " + (var1+var2) );

        scanner.close();
    }
}
