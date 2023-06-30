package HomеWork03;

public class Application {

    public static void main(String[] args) {
        System.out.println("Программа для записи карточки контакта в фаил.\n");
        String newFileName = "HomеWork03//notebook//"; // Расположение директории, где будут храниться фаилы.
        boolean permission = false; // Переменная проверки записи для последующей работы с ней.
        do {
            String newCard = FillingInTheData.getCard(); // Получаем строку.
            if (newCard.equals("exit")) { // Выход из приложения по условию
                permission = true;
                break;
            } else {
                permission = VerificationBlock.checkCard(newCard); // Проверяем строку на соответствие формату.
                if (permission == true) {
                    // Если строка прошла проверку, то подготавливаем ее (метод putList).
                    // А именно парсим и переводим номер телефона в Long(Int - маловат)
                    // и записываем в ArrayList<Object>.
                    // Метод writeCard вытаскивает фамилию из фаила и добавляет ее к имени файла.
                    // И потом делает запись в файл, если его нет, то создает.
                    try {
                        Writer.writeCard(FillingInTheData.putList(newCard), newFileName);
                    } catch (MyFileNotFoundException e) {
                        System.out.printf("%s : %s", e.getMessage(), e.getFileName());
                    }
                } else {
                    System.out.println("Данные введены не правильно. Повторите ввод.\n");
                }
            }
        } while (permission == false); 
        // Если запись не получилась с первого раза, посторяем снова.
        // Приложение отрабатывает только на одну запись в файл. 
        // Приложение крашится только при проблемме с записью файла.
    }
}
