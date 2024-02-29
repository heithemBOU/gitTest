import HeithemBourbia.HeithemBourbia;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        // Appel des méthodes de la classe Membre1
        int somme = HeithemBourbia.calculerSomme(tableau);
        double moyenne = HeithemBourbia.calculerMoyenne(tableau);

        // Affichage des résultats
        System.out.println("Somme du tableau: " + somme);
        System.out.println("Moyenne du tableau: " + moyenne);
    }
}
