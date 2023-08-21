package p21_08;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
      //Napisati program koji sakriva uneti password..
        //Primer izvrsenja:
        //Unestite password: OvoJePassword123
        //Skriverni password: ****************
        Scanner s =new Scanner(System.in);

        System.out.println("Input password: ");
        String password = s.next();

        int counter = password.length();

        for (int i = 1; i <= counter; i ++){

            System.out.print("*");
            }

        }


    }

