
public class typeCast {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte is 1 byte variable, meaning it's range is only -128 to 127

        int c = a; // This is implicit type casting
        byte d = (byte) c; // this is explicit type casting
        int prod = a*b; // This is promotion
        
        System.out.println(prod);
    }
}
