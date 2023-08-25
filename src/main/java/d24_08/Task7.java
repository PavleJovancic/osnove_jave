package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //(Za vezbanje) Napisati program koji ucitava niz a duzine N.
        // Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
        //a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
        //
        //
        //	Unesite N: 6
        //Unesite broj: 1
        //Unesite broj: 5
        //Unesite broj: 2
        //Unesite broj: 7
        //Unesite broj: 8
        //Unesite broj: -1
        //
        //Niz a: 1, 5, 2, 7, 8, -1
        //Niz b: 1, 5, 2, 1, 1, 1
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        System.out.print("Input N: ");
        int n = s.nextInt();

        for (int i = 1; i <=5; i++){
            System.out.print("Input number: ");
            int number = s.nextInt();
            listA.add(number);
        }
        for (int i = 0; i < listA.size(); i++){
            if(i<3){
                listB.add(listA.get(i));
            } else {
                listB.add(1);
            }
        }
    }
}
