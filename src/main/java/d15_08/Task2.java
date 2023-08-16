package d15_08;

public class Task2 {
    public static void main(String[] args) {
     //Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
        // Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
        // Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
        // Napomena: svaka informacija mora da bude u okviru posebne promenljive.


        String cardNumber = "1234 5678 8765 4321";
        int expirationMonth = 11;
        int expirationYear = 26;
        String cardholderFirstName = "John";
        String cardholderLastName = "Smith";

        System.out.println("*************************************");
        System.out.println("*    Credit Card                    *");
        System.out.println("*      ****                         *");
        System.out.println("*      ****                         *");
        System.out.println("*         " + cardNumber + "       *");
        System.out.println("*                valid > " + expirationMonth + "/" + expirationYear + "      *" );
        System.out.println("*                                   *");
        System.out.println("*      " + cardholderFirstName + " " + cardholderLastName + "                   *");
        System.out.println("*************************************");




    }
}
