package jour02;
import java.util.*;
public class job5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre âge ? : ");
        int age = scanner.nextInt();

        if (age < 16){
            System.out.println("Vous ne pouvez pas taffer");
        }else if (age >= 67){
            System.out.println("Vous êtes en retraite");
        }else if (age > 55){
            System.out.println("Vous aurez du mal à trouver un taff");
        }else {
            System.out.println("Vous pouvez travailler");
        }


        scanner.close();
    }
}
