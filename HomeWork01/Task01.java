package HomeWork01;
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.


class Task01{

public static void main(String[] args) {
    int[] array = new int[8];
    for (int i = 0; i < 8; i++) {
        array[i] = i;
    }
    square(-1);                       // Ошибку вызовет отрицательне число.
    accessArray(array, 10);     // Ошибку вызовет значение index вне пределах размера массива.
    division(3, 0);               // Стандартная ошибка деления на 0.
}

static void division(float a, float b){
    if (b == 0){
        throw new RuntimeException("Ошибка. Деление на ноль.");
    }
    else {
        System.out.println(a / b);;
    }
}
static void accessArray(int[] array, int index){
    if (index > array.length || index < 0){
        throw new RuntimeException("Ошибка. Индекс вне размера массива.");
    }
    else{
        System.out.println(array[index-1]);
    }
}

static void square(float a){
    if (a < 0){
        throw new RuntimeException("Ошибка. Числа меньше нуля не подходят.");
    }
    else{
        System.out.println(Math.sqrt(a));
    }
}

}
