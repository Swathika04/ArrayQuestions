public class PosNeg {
    public static void main(String[] args) {
        int[] numbers = { -23, 18, -34, 76, -11 };
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(numbers[i]);
        }
        System.out.print("Array After Modification: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

