public class EvenOdd {
    public static void main(String[] args) {
        int a[] = {12, 34, 57, 87, 35, 98, 74, 53};
        System.out.println("even numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }
    }
}
