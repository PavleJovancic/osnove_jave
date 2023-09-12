package d11_09;

public class Task1 {
    public static void main(String[] args) {
        //Kreirati klasu Autor koja ima
        //-ime i prezime
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu:
        //(ime autora) (prezime autora)
        //
        //Kreirati klasu Knjiga koji ima:
        //-ISBN
        //-naziv
        //-godina izdanja
        //-autor
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
        //(ISBN)
        //(naziv) - (godina izdanja)
        //autor: (ime autora) (prezime autora)
        //
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Author firstAuthor = new Author("Frank", "Herbert");
        Author secondAuthor = new Author("Isaac", "Asimov");
        Author thirdAuthor = new Author("Arthur", "Clark");


        Book firstBook = new Book(1231232, "Foundation", 1951, secondAuthor);
        Book secondBook = new Book(23124234, "I, Robot", 1950, secondAuthor);
        Book thirdBook = new Book(23342342, "A Space Odyssey", 1968, thirdAuthor);
        Book fourthBook = new Book(54645634, "Dune", 1965, firstAuthor);


        firstBook.printBookInformation();
        secondBook.printBookInformation();
        thirdBook.printBookInformation();
        fourthBook.printBookInformation();




    }
}
