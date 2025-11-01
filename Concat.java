import java.io.*;
class Geeks {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");
        String str3 = str1 + " " + str2;
        String str4 = str1.concat(" " + str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
