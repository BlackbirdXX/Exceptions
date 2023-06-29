package HomeWork01;

import java.util.Random;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя.

public class Task02 {
    
    public static void main(String[] args) {
        arraySubtraction(arrayGenerator(), arrayGenerator());
    }

    static int[] arrayGenerator(){
        Random random = new Random();
        int[] array = new int[random.nextInt(8,10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    static void arraySubtraction(int[] a, int[] b){
        if (a.length != b.length){
            throw new RuntimeException("Ошибка. Размер массивов не равен.");
        }
        else {
            int[] result = new int[a.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = a[i] - b[i];
                System.out.printf(result[i] + " ");
            }
        }
    }

}
