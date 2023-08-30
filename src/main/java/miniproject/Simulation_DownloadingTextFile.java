package miniproject;

import java.util.Scanner;

public class Simulation_DownloadingTextFile {
    public static void main(String[] args) {
        //**Zadatak: Simulacija skidanja tekstualnog fajla**
        //Napišite program koji simulira proces skidanja tekstualnog fajla.
        //Skidanje fajla se obavlja u paketima od po 5 karaktera.
        //Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
        //
        //Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
        //Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
        //Korisnik će biti upitan za podatke svakog paketa kroz for petlju.
        // Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla.
        // Na programu je da odredi koliko paketa je potrebno za ceo fajl.
        //Na kraju programa, ispišite sadržaj celog fajla.
        //Primer izvršenja 1:
        //Unesite veličinu fajla: 25
        //Unesite paket: soiek
        //Skinuto 20.0%
        //Unesite paket: ew43t
        //Skinuto 40.0%
        //Unesite paket: tr5y7
        //Skinuto 60.0%
        //Unesite paket: dbtu6
        //Skinuto 80.0%
        //Unesite paket: 6ghku
        //Skinuto 100.0%
        //Sadržaj fajla je: soiekew43ttr5y7dbtu66ghku
        //
        //Primer izvršenja 2:
        //Unesite veličinu fajla: 27
        //Unesite paket: soiek
        //Skinuto 18.5%
        //Unesite paket: ew43t
        //Skinuto 37.0%
        //Unesite paket: tr5y7
        //Skinuto 55.5%
        //Unesite paket: dbtu6
        //Skinuto 74.0%
        //Unesite paket: 6ghku
        //Skinuto 92.5%
        //Unesite paket: cc
        //Skinuto 100.0%
        //Sadržaj fajla je: soiekew43ttr5y7dbtu66ghkucc
        //Napomena: Posto je procenat realan broj, u stampi ce se prikazati vise cifara iza zareza.

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the file size: ");
        int fileSize = s.nextInt();

        int iterations = 0;
        if (fileSize % 5 ==0){
            iterations = fileSize / 5;
        } else {
            iterations = fileSize / 5 + 1;
        }

        int smallerPackageValue = fileSize % 5;
        double percentOfFiveBytePackageDownloaded = calculatePercentageOfFile(fileSize, 5);
        double percentOfSmallerPackageDownloaded = calculatePercentageOfFile(fileSize, smallerPackageValue);
        double percentOfFullDownload = 0;

        String fullPackage = "";

        for (int i = 1; i <= iterations; i++){
            System.out.println("Enter the package: ");
            String packageInput = s.next();
            if (packageInput.length() % 5 == 0) {
                fullPackage = fullPackage + packageInput;
                percentOfFullDownload = percentOfFullDownload + percentOfFiveBytePackageDownloaded;
                if (percentOfFullDownload >= 99.9){
                    System.out.println("Downloaded: 100%");
                } else {
                    System.out.println("Downloaded: " + percentOfFullDownload + "%");
                }
            }
            if (packageInput.length() == smallerPackageValue){
                fullPackage = fullPackage + packageInput;
                System.out.println("Downloaded: 100%");
            }
        }
        System.out.println("The content of the file is: " + fullPackage);
    }
    public static double calculatePercentageOfFile(int x, int y){
        double percentage = (1.0 * y / x) * 100;
        return percentage;
    }
}
