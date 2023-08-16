package d15_08;

public class Task11 {
    public static void main(String[] args) {
        //Napisati program koji izracunava velicinu slike na temelju dostupnih podataka.
        // Program cuva sledece informacije o slici:
        //Naziv slike
        //Rezoluciju (duzina i visina)
        //Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
        //Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
        //Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb), uzimajuci u obzir sledece konverzije:
        //1 kb = 1024b
        //1 Mb= 1024 kb
        //Primer izvrsenja
        //File: profile-image.log
        //Resolution: 1920 x 1080
        //Size (kb): 2025
        //Size (Mb):  1.977

        String fileName = "wallpaper.jpg";
        int horizontalResolution = 3840 ;
        int verticalResolution = 2160 ;

        int pixelNumber = horizontalResolution * verticalResolution;
        int sizeKB = pixelNumber / 1024;
        int sizeMB = sizeKB / 1024;

        System.out.println("File: " + fileName);
        System.out.println("Resolution: " + horizontalResolution + " x " + verticalResolution);
        System.out.println("Size (KB): " + sizeKB);
        System.out.println("Size (MB): " + sizeMB);
    }
}
