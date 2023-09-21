package d19_09;

public class Task1 {
    public static void main(String[] args) {

        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode
        // i ispisati ukupnu cenu sa popustom.


        Cart cart = new Cart();
        SuperCard card = new SuperCard("1342 5543 5435 3455", "Nikola Nikolic", 30);

        TetraPak first = new TetraPak("328232-2823", "milk", 100, 110, true, 180);
        TetraPak second = new TetraPak("34566-457467", "yogurt", 100, 120, false, 150);

        GlassPackaging third = new GlassPackaging("235345-2344", "beer", 50, 70, 30, true, 89);
        GlassPackaging forth = new GlassPackaging("256567-4665", "coca-cola", 33, 50, 0, false, 76);

        first.print();
        second.print();
        third.print();
        forth.print();

        cart.addPackaging(first);
        cart.addPackaging(second);
        cart.addPackaging(third);
        cart.addPackaging(forth);

        cart.cartPrice(card);



    }
}
