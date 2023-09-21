package d18_09;

public class QualityOptimizerControl extends Control {
    // //Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
    //        //ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
    //        //gettere, settere i konstruktore
    //        //implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
    //        //brzina interneta * 10.1, gde se uzima prvi veci kvalitet
    //        //npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
    //        //npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
    //        //npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
    //        // (144, 240, 360, 480, 720, 1080)

    private double internetSpeed;

    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void action(VideoPlayer videoPlayer) {
        double speed = this.internetSpeed * 10.1;
        if (speed > 720){
            videoPlayer.setQuality(1080);
        } else if (speed > 480) {
            videoPlayer.setQuality(720);
        }else if (speed > 360) {
            videoPlayer.setQuality(480);
        }else if (speed > 240) {
            videoPlayer.setQuality(360);
        }else if (speed > 144) {
            videoPlayer.setQuality(240);
        } else {
            videoPlayer.setQuality(144);
        }
    }


    public double getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }
}
