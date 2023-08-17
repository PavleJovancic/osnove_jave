package p17_08;

import java.util.Scanner;

public class UvodGrananje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = "John";
        // promenjiva.equals("Tekst");

        if (!name.equals("Smith")) {
            System.out.println("Name is not equal Smith");
        }
        String eMail = "mail@gmail.com";
        // promenjiva.equals("Tekst");

        if (eMail.contains("@gmail.com")) {
            System.out.println("email is gmail.com");
        }
        System.out.println("END");

    }
}
