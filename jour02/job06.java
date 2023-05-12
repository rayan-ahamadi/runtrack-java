package jour02;

public class job06 {
    public static void main(String[] args){
        int somme = 0;
        for (int i=1; i<=100; i+=2){
            somme+=i;
        }
        System.out.println("La somme des nombres pairs en 1 et 100 est " + somme);
    }
}
