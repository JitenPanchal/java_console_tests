package Armstrong;

public class ArmstrongTest {

    public static void main(String[] args) {

        int number = 27;
        int copy = number;



        double sum = 0.0;
        while (number > 0) {

            int digit = number % 10;
            number = number/10;
            sum = sum + Math.pow(digit,3);
        }

        if (sum == copy)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
