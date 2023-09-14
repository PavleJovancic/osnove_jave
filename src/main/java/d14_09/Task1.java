package d14_09;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Napisati klasu Student koja ima
        //
        //broj indeksa
        //ime i prezime
        //tip studija (osnovne, master, doktorske)
        //niz ispita
        //konstuktore koje mislite da ce vam trebati
        //gettere i settere za indeks, ime i prezime, tip studija
        //getter za niz predmeta
        //metodu dodaj ispit u niz ispita
        //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
        //metodu stampaj koja stampa u formatu:
        //(broj indeksa) - (ime i prezime) - (tip studija)
        //Predmeti:
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //Prosecna ocena: (prosecna ocena)
        //
        //
        //Napisati klasu Ispit koja ima
        //naziv predmeta
        //ocenu (u rasponu od 5 do 10)
        //Ime i prezime profesora koji predaje predmet
        //konstuktore koje mislite da ce vam trebati
        //gettere i settere za sve atribute
        //metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
        //metodu koja stampa ispit u formatu:
        //(naziv predmeta) - (profesor) - (ocena)

        Student student = new Student(12324, "Nikola Nikolic", "master");

        Exam first = new Exam("Biology", 8, "Milos Milosevic");
        Exam second = new Exam("Chemistry", 9, "Milan Milanovic");
        Exam third = new Exam("Physics", 5, "Aleksa Aleksic");
        Exam forth = new Exam("History", 5, "Natalija Natalkovic");
        Exam fifth = new Exam("English", 9, "Andjela Andjelkovic");
        Exam sixth = new Exam("German", 7, "Andjela Andjelkovic");

        student.addExam(first);
        student.addExam(second);
        student.addExam(third);
        student.addExam(forth);
        student.addExam(fifth);
        student.addExam(sixth);

        student.printStudentInformation();




    }
}
