package HomеWork03;

import java.util.ArrayList;
import java.util.Scanner;

public class FillingInTheData {

    public static ArrayList<Object> putList(String inputString) {
        // Метод записи данных в список и перевода номера телефона в Integer
        String[] splitCard = inputString.split(" ");
        ArrayList<Object> card = new ArrayList<>();
        try {
            for (int i = 0; i < splitCard.length - 1; i++) {
                card.add("<" + splitCard[i] + ">");
            }
            card.add("<" + Long.parseLong(splitCard[3]) + ">");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка подготовки данных.");
        }
        return card;
    }

    public static String getCard() {
        // Метод для получения данных из консоли.
        String result = new String();
        Scanner scanner = new Scanner(System.in, "cp866");

        // Если закрыть сканер, то он почему то больше не откроется. Так что пускай так
        // и висит. Интернет говорит, что это популярная проблема и трудно лечится.
        try {
            System.out.println("Введите контактные данные");
            System.out.println("В формате (Иванов Иван Иванович 89211234567)");
            System.out.println("Данные разделить пробелом. : ");
            System.out.println("Для выхода - exit  : \n");
            result = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка ввода.");
        }
        return result;
    }
}
