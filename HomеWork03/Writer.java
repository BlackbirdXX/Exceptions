package HomеWork03;

import java.io.FileWriter;
import java.util.ArrayList;

public class Writer {

    public static void writeCard(ArrayList<Object> data, String path) throws MyFileNotFoundException {
        // Метод записи в файл, который добавляет имя файла по фамилии.
        String fileName = data.get(0).toString().replaceAll("[<>]", "");
        String currPath = path + fileName + ".txt";

        try (FileWriter fw = new FileWriter(currPath, true)) {
            for (int i = 0; i < data.size(); i++) {
                fw.append(data.get(i).toString() + " ");
            }
            fw.append("\n");
            System.out.println("Произведена запись в файл : " + currPath);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyFileNotFoundException("Не правильный или отсутствует путь к файлу.", currPath );
            
        }
    }
}
