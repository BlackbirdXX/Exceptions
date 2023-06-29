package HomeWork02;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь 
// вводит пустую строку. Пользователю должно показаться сообщение, 
// что пустые строки вводить нельзя.

public class Tasko4 {
    
    public static void main(String[] args) {
        getStringFromConsole();
    }

    static void getStringFromConsole() throws RuntimeException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку (для выхода введите : exit) : ");
            String newString = scanner.nextLine();
            try {
                if (newString.equals("exit")){
                    scanner.close();
                    break;
                }
                else if (!newString.isEmpty()) {
                    System.out.println(newString);
                }
                else if (newString.isEmpty()) {
                    System.out.println("Пустые строки создавать нельзя.");
                }
            } catch (Exception e) {
                System.out.println("Что то пошло не так.");
            }

        }
    }
}
