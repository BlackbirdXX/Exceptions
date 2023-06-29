package HomeWork02;

import java.util.Random;

// Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task02 {

    public static void main(String[] args) {

        int[] intArray = arrayGenerator();
        Random random = new Random(0);
        while (true) {
            int d = random.nextInt(3);
            try {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e); // Можно дописать собственный опработчик ошибки, но встроенного вполне хватает.
            }
        }
    }

    static int[] arrayGenerator() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

}
