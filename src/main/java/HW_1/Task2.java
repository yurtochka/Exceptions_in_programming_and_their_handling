// исправить код, если необходимо
package HW_1;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        try {
            int d = 3;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
