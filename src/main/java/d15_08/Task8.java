package d15_08;

public class Task8 {
    public static void main(String[] args) {
        //Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
        //Svaka komponenta boje je u opsegu od 0 do 255(informativno)
        //Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
        //Primer izvrsenja:
        //Originalna boja: RGB(140, 12,  100)
        //Kontrastna boja: RGB(115, 243, 155)

        int originalRed = 178;
        int originalGreen = 75;
        int originalBlue = 199;

        int contrastRed = 255 - originalRed;
        int contrastGreen = 255 - originalGreen;
        int contrastBlue = 255 - originalBlue;

        System.out.println("Original color: RGB(" + originalRed + ", " + originalGreen + ", " + originalBlue + ")");
        System.out.println("Contrast color: RGB(" + contrastRed + ", " + contrastGreen + ", " + contrastBlue + ")");


    }
}
