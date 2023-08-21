package p21_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      //Napisati program koji od brojeva od 1 do 10 formira string tako da se na pocetnu vrednost stringa … (tri tacke) sa leve strane dodaju neparni brojevi a sa desne parni.
        //Primer izvrsenja:
        //97531…246810
        Scanner s =new Scanner(System.in);

        String sum = "...";

        for (int i = 1; i <=10; i++){
            if (i % 2 == 0){
                sum = sum + i;
            } else {
                sum =  i + sum;
            }
        } System.out.println(sum);

    }
}
