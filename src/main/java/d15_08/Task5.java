package d15_08;

public class Task5 {
    public static void main(String[] args) {
        // Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        // KOREN BROJA 3 neka bude konstanta 1.73.
        // Za stranicu trougla postavite proizvoljnu vrednost.
        //Primer izvrsenja programa:
        //a: 10
        //Povrsina je 43.25
        //Obim je 30

        int a = 3;
        double KORENBROJA3 = 1.73;
        double povrsinaTrougla = a * a * KORENBROJA3 / 4;
        int obimTrougla = a * 3 ;

        System.out.println("a: " + a);
        System.out.println("Povrsina je " + povrsinaTrougla);
        System.out.println("Obim je " + obimTrougla);


    }
}
