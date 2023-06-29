package HomeWork02;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. Ввод текста вместо числа 
// не должно приводить к падению приложения, вместо этого, необходимо 
// повторно запросить у пользователя ввод данных.

public class Task01 {

    public static void main(String[] args) {
        getFloatFromConsole();
    }

    static void getFloatFromConsole() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число (для выхода введите : 0) : ");
            String newString = scanner.nextLine();
            try {
                Float num = Float.parseFloat(newString);
                if (num == 0.0) {
                    scanner.close();
                    break;
                }
                System.out.println(num);

            } catch (Exception e) {
                System.out.println("Введено не подходящее значение.");
            }

        }
    }
}
