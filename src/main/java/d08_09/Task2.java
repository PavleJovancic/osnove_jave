package d08_09;

public class Task2 {
    public static void main(String[] args) {
// //Kreirati klasu FacebookPost koja ima:
//        //   Od atributa:
//        //ime i prezime korisnika koji je objavio post
//        //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        //tekst objave
//        //broj lajkova
//        //broj deljenja
//        //  Od metoda:
//        //like(), koja povecava broj lajkova za 1.
//        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        //share(), koja povecava broj deljenja za 1
//        //print(), koja stampa objavu u formatu:
//        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        //(tekst objave)
//        //Likes (broj lajkova) | Shares (broj deljenja)
//        //
//        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//        //
//        //
//        //Primer stampanja:
//        //Milan Jovanovic >>> Pera Peric
//        //Ovo je tekst objave
//        //Likes 3 | Shares 1



        FacebookPost postOne = new FacebookPost();
        postOne.userPosting = "Milos Milosevic";
        postOne.userReceiving = "Pera Peric";
        postOne.text = "Hello";

        postOne.like();
        postOne.dislike();
        postOne.like();
        postOne.share();
        postOne.like();
        postOne.share();
        postOne.like();
        postOne.dislike();
        postOne.share();
        postOne.printPost();

        System.out.println();

        FacebookPost postTwo = new FacebookPost();
        postTwo.userPosting = "Pera Peric";
        postTwo.userReceiving = "Milos Milosevic";
        postTwo.text = "Bye";

        postTwo.share();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.share();
        postTwo.like();
        postTwo.dislike();
        postTwo.dislike();
        postTwo.share();
        postTwo.printPost();

    }
}
