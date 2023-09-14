package p14_09;

public class Task3 {
    public static void main(String[] args) {
        //Kreirati klasu TestStep koja od privatnih atributa ima:
        //opis
        //actual vrednost
        //expected vrednost
        //errorMessage
        //konstuktor koji postavlja sve atribute
        //getere za sve elemente
        //settere nemamo
        //metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
        //metodu za stampu koja stampa test step u formatu:
        //|  Opis |
        //| Status(failed ili passed) | Error message (ako je test step failovao)
        //
        //
        //	Kreirati klasu TestCase koja od privatnih atributra ima:
        //ID
        //naziv
        //niz test koraka
        //metodu addTestStep koja dodaje test step u niz
        //metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
        //metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
        //metoda koja stampa status test case-a u formatu
        //ID - Naziv
        //|  Opis  |
        //|  Status(failed ili passed) | Error message (ako je test step failovao)
        //|  Opis  |
        //|  Status(failed ili passed) | Error message (ako je test step failovao)
        //|  Opis  |
        //|  Status(failed ili passed) | Error message (ako je test step failovao)
        //ukupan broj koraka / broj test caseva koji su faulovali
        //Stanje test casea

        TestCase testcase = new TestCase(1, "Test change the PIN function");

        TestStep firstStep = new TestStep("Click change the PIN button", "The system displays a message asking fthe user to enter the new PIN", "The system displays a message asking fthe user to enter the new PIN", "no message");
        TestStep secondStep = new TestStep("Enter 5555", "The system displays a message asking the user to confirm (re-enter) PIN","The system displays a message asking the user to confirm (re-enter) PIN", "no message");
        TestStep thirdStep = new TestStep("Re-enter 5555", "The system displays a message of successful operation","The system displays a message: operation failed",  "Test Failed");

        testcase.addTestSteps(firstStep);
        testcase.addTestSteps(secondStep);
        testcase.addTestSteps(thirdStep);

        testcase.printTestCase();
    }
}
