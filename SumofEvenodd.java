public class SumofEvenodd {

    public static void main(String[] args) {
        int[] numbers = {26, 12, 35, 44, 65, 56, 77, 38, 29, 20};

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
