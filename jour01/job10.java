import java.util.Scanner;

public class job10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre nom ? ");
        String nom = scanner.nextLine();

        System.out.println("Quel est votre prénom");
        String prenom = scanner.nextLine();

        System.out.println("Bonjour ! " + nom +" "+ prenom);

        scanner.close();
    }
    
    
}
