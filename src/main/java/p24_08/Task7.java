package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji simulira digitalni meni za pasta bar.
// Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//naziv paste ………………………….cena rsd
//Informacije su uparene po poziciji, to znaci da je:
//pasta na poziciji 0, sa cenom sa pozicije 0
//pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//Primer izvrsenja:
//AGLIO E OLIO ………………… 500 rsd
//PRIMAVERA…………………340 rsd
//ARRABBIATA ………………….420 rsd
//NAPOLITANA ………………….440 rsd
//POLLO E SPINACI ………………….550 rsd
        ArrayList<Integer> price = new ArrayList<>();
        ArrayList<String> food = new ArrayList<>();
        price.add(1400);
        price.add(2000);
        price.add(399);
        price.add(120);
        price.add(200);

        food.add("Pizza");
        food.add("Lasagna");
        food.add("Fish");
        food.add("Bread");
        food.add("Soup");

        for (int i = 0; i < food.size(); i++){
        System.out.println(food.get(i) + "................" + price.get(i) + " rsd");
        }
    }
}
