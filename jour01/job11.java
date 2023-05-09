import java.util.Scanner;

public class job11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre de minutes : ");
        int input = scanner.nextInt();

        int heures = input / 60;
        int restes = heures % 60; 

        System.out.println(input + " Est équivalent à " + heures + "h" + restes + "m");
        scanner.close();
    }
}
