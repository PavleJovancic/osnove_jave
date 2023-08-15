package p15_08;

public class Zadatak3 {
    public static void main(String[] args) {
// Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]
    String fullName = "John Smith";
    String phoneNumber = "+381612345678";
    String address = "First Street 1a";
    String city = "New York";
    String eMail = "mymail@yahoo.com";
        System.out.println("Contact information:");
        System.out.println(fullName);
        System.out.println(phoneNumber + ", " + address + ", " + city);
        System.out.println(eMail);



    }
}
