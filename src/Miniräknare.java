import java.awt.*;
import java.util.Scanner;

public class Miniräknare {
    public static void main(String[] args) {

        String Anwser;

        double number1, number2;
        String tecken;

        Scanner number = new Scanner(System.in);

        System.out.println("Fösta nummret");
        number1 = number.nextInt();

        System.out.println("Andra nummret");
        number2 = number.nextInt();

        Scanner teckenscan = new Scanner(System.in);

        System.out.println("Välj tecken");
        tecken = teckenscan.next();

        if (tecken == "+");
        {
            System.out.println("Svar:" + (number1 + number2));
        }
    }
}
