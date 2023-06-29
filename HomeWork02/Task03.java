package HomeWork02;

// Дан следующий код, исправьте его там, где требуется 
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task03 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1,2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            // Данное исключение старше, поэтому оно должно обрабатываться после младших.
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b)  {
        // throws FileNotFoundException не используется в main, в этом методе не работаем с фаилами.
        // переменные a и b заданы в коде и в случае сложения ситуации как деление на 0 возникнуть не может.  
        System.out.println(a + b);
    }

}