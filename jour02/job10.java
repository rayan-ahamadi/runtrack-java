package jour02;

public class job10 {
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;
        int chiffre;
        while (nombre != 0) {
            chiffre = nombre % 10;
            somme += chiffre;
            nombre /= 10;
        }
        System.out.println("La somme des chiffres est : " + somme);
    }
}
