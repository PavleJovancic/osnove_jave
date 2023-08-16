package d15_08;

public class Task10 {
    public static void main(String[] args) {
        //Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
        // Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja.
        // Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
        //Primer izvrsenja
        //File: profile-image.log
        //Size: 25Mb
        //Download speed: 3Mb/s
        //Estimated time: 8s

        String fileName = "OnceUponATimeInAmerica.mov";
        int fileSize = 1278;
        int downloadSpeed = 5;

        int estimatedTime = fileSize / downloadSpeed;

        System.out.println("File: " + fileName);
        System.out.println("Size: " + fileSize + "Mb");
        System.out.println("Download speed: " + downloadSpeed + "Mb/s");
        System.out.println("Estimated time: " + estimatedTime + "s");


    }
}
