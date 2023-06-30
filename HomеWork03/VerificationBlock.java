package HomеWork03;

public class VerificationBlock {
    public static boolean checkCard(String inputString) {
        // Метод проверки карточки контакта на соответствие
        boolean permissionWord = false;
        boolean permissionNumber = false;
        boolean outOfValue = true;
        String[] splitCard = inputString.split(" ");
        
        // Проверка на нужное колличество строк.
        try {
            if (splitCard.length != 4) {
                outOfValue = false;
                throw new OutOfValueException("Ошибка, не верное колличество данных. Нужно 4, а введено ",
                        splitCard.length);

            }
        } catch (OutOfValueException e) {
            System.out.println(e.getMessage() + e.getQuantity());
        }

        // Проверка Ф.И.О.
        int i = 0;
        while (i < splitCard.length - 1) {
            try {
                permissionWord = checkNumberInWord(splitCard[i]);
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
                permissionWord = false;

            }
            if (permissionWord == false) {
                break;
            }
            i++;
        }
        // Проверка намера телефона.
        try {
            permissionNumber = checkFullNumber(splitCard[3]);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();

        }
        // сложение двух проверок
        if (permissionWord == true && permissionNumber == true && outOfValue == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumberInWord(String word) throws Exception {
        // Метод проверки наличия цифр в строках.
        boolean hasDigits = true;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigits = false;
                throw new RuntimeException("В имени не должно содержаться цифр.");
            }
        }
        return hasDigits;
    }

    public static boolean checkFullNumber(String word) throws Exception {
        // Проверка на отсутствие символов, кроме цифр.
        boolean isOnlyDigits = true;
        for (int i = 0; i < word.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(word.charAt(i))) {
                isOnlyDigits = false;
                throw new RuntimeException("Номер телефона не соответствует формату.");
            }
        }
        return isOnlyDigits;
    }
}
