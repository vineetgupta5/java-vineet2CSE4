import java.io.*;
class Geeks {
    public static void main(String[] args) {

        byte[] byteArray = { 86, 105, 110, 101, 101, 116 };
        String str3 = new String(byteArray);
        System.out.println("Name: " + str3);

        byte[] byteArray1 = { 118, 105, 110, 101, 101, 116, 46, 99, 115, 50, 56, 64, 105, 105, 108, 109, 46, 101, 100, 117 };
        String str4 = new String(byteArray1);
        System.out.println("Email: " + str4);
    }
}
