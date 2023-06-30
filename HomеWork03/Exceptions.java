package HomеWork03;

public class Exceptions {
    
}
class MyFileNotFoundException extends Exception{
    private String fileName;

    public MyFileNotFoundException(String mess, String fileName){
        super(mess);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
class OutOfValueException extends Exception{
    private int quantity;

    public OutOfValueException (String message, int quantity){
        super(message);
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}