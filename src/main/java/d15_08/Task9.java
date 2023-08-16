package d15_08;

public class Task9 {
    public static void main(String[] args) {
        //Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.
        // Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb.
        // Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu
        //naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
        //*****************************
        //***********procenat %
        //*****************************
        //Primer izvrsenja:
        //profile-image.png 7Mb/2Mb
        //*****************************
        //*********** 28%
        //*****************************

        String fileName = "SmokeOntheWater.mp3";
        double originalFileSize = 5.4;
        double downloadedFileSize = 3.1;

        double downloadPercentage = (originalFileSize / downloadedFileSize) * 100;
        System.out.println(fileName + " " + originalFileSize + "Mb/" + downloadedFileSize + "Mb");
        System.out.println("*****************");
        System.out.println("********* " + downloadPercentage + "%");
        System.out.println("*****************");

    }
}
