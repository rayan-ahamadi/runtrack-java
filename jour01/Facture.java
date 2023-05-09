public class Facture {
    public static void main(String[] args){
        float prix = (float) 49.99;
        int quantite = 3; 
        float tarifHT = quantite *  (float) prix;
        float tva = (float) (0.2 * tarifHT);
        float total = tarifHT + (float)tva;
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + tva);
        System.out.println("Le montant total à payer est : " + total);
    }
}
