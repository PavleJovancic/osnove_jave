package d12_09;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Kreirati klasu ZeleniKarton koja ima:
        //ime i prezime studenta
        //broj indeksa
        //naziv predmeta
        //ime i prezime profesora
        //ocenu - od 5 do 10
        //gettere i settere
        //konstruktore
        //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
        //metodu stampaj koja stampa podatke u formatu:
        //		(naziv predmeta) - (ocena)
        //		Student: ime i prezime, broj indeksa
        //		Profesor: ime i prezime
        //
        //	U glavnoj klasi:
        //kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
        //Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
        //(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite


        ArrayList<GreenCard> exams = new ArrayList<>();
        GreenCard exam1 = new GreenCard("Nikola Nikolic", 12456, "Programiranje 101","Milos Milosevic", 10);
        GreenCard exam2 = new GreenCard("Petar Petrovic", 12456, "Programiranje 202","Milos Milosevic", 7);
        GreenCard exam3 = new GreenCard("Petar Petrovic", 12456, "Programiranje 303","Milos Milosevic", 8);
        GreenCard exam4 = new GreenCard("Petar Petrovic", 12456, "Programiranje 404","Milos Milosevic", 5);


        exams.add(exam1);
        exams.add(exam2);
        exams.add(exam3);
        exams.add(exam4);


        for (int i = 0; i < exams.size(); i++) {
            exams.get(i).printGreenCardInfo();
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < exams.size(); i++) {
            sum = sum + exams.get(i).getGrade();
        }
        double avgGrade = sum * 1.0 / exams.size();

        System.out.println("Average grade is: " + avgGrade);


    }
}
