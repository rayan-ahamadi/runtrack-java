import java.util.Scanner;

public class job12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Première Chaine : ");
        String chaine1 = scanner.nextLine();
        System.out.println("Deuxième Chaine : ");
        String chaine2 = scanner.nextLine();

        chaine1 = chaine1 + chaine2; // concatène les deux chaînes
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // enlève de l'index 0 à l'index de fin de prmière chaîne
        chaine1 = chaine1.substring(chaine2.length()); // parcoure la chaîne et enlève à partir de cette index 


        System.out.println("Valeur de chaine 1 " + chaine1 + "\nValeur de chaine2 "  + chaine2);
        scanner.close();

    
    }
}
