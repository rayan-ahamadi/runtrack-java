package jour02;

public class job09 {
    public static void main(String[] args) {
        int nombre = 1234;
        int premier = 0, dernier = 0;
        int chiffre, position = 1;
        while (nombre != 0) {
            chiffre = nombre % 10;
            if (position == 1) {
                dernier = chiffre;
            }
            premier = chiffre;
            nombre /= 10;
            position++;
        }
        System.out.println("Le premier chiffre est : " + premier);
        System.out.println("Le dernier chiffre est : " + dernier);
    }
}
