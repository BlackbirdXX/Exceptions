package HomeWork01;

import java.util.Random;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива 
// и возвращающий новый массив, каждый элемент которого равен частному 
// элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное 
// исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task03 {
    
    public static void main(String[] args) {
        arrayDivision(arrayGenerator(), arrayGenerator());
    }

    static float[] arrayGenerator(){
        Random random = new Random();
        float[] array = new float[random.nextInt(8,10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    static void arrayDivision(float[] a, float[] b){
        if (a.length != b.length){
            throw new RuntimeException("Ошибка. Размер массивов не равен.");
        }
        else {
            float[] result = new float[a.length];
            for (int i = 0; i < result.length; i++) {
                if (b[i] == 0){
                    throw new RuntimeException("Ошибка. Деление на 0 не возможна.");
                }
                else {
                result[i] = a[i] / b[i];
                System.out.printf(result[i] + " ");
                }
            }
        }
    }


}
