import HeithemBourbia.HeithemBourbia;
import static wissemBoumahdef.WissemBoumahdef.calculateFactorial;
import static wissemBoumahdef.WissemBoumahdef.isEven;


public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 5,6,7,8};


        // Appel des méthodes de la classe Membre1
        int somme = HeithemBourbia.calculerSomme(tableau);
        double moyenne = HeithemBourbia.calculerMoyenne(tableau);

        // Affichage des résultats
        System.out.println("Somme du tableau: " + somme);
        System.out.println("Moyenne du tableau: " + moyenne);


        int number = 7;
        int factorial = calculateFactorial(number);
        System.out.println("Factorielle de " + number + " : " + factorial);

        // Vérification si 4 est pair
        boolean isEven = isEven(number);
        if (isEven) {
            System.out.println(number + " est pair.");
        } else {
            System.out.println(number + " n'est pas pair.");
        }

    }
}
