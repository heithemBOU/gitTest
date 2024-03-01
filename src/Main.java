import static wissemBoumahdef.WissemBoumahdef.calculateFactorial;
import static wissemBoumahdef.WissemBoumahdef.isEven;

public class Main {
    public static void main(String[] args) {

        int number = 4;
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