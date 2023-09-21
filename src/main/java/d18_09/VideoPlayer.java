package d18_09;

public class VideoPlayer {
    ////Kreirati klasu Packaging koja ima:
    //        //duzinu videa
    //        //trenutno vreme videa
    //        //jacinu zvuka
    //        //Kvalitet videa (144, 240, 360, 480, 720, 1080)
    //        //gettere, settere i konstruktore
    //        //metodu stampaj koja stampa podatke u formatu:
    //        //trenutno vreme videa
    //        //jacina zvuka
    //        //kavlitet videa
    //        //
    private int length;
    private int currentTime;
    private int volume;
    private int quality;

    public VideoPlayer(int length, int volume) {
        this.length = length;
        this.volume = volume;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void print(){
        System.out.println("Time: " + this.currentTime);
        System.out.println("Volume: " + this.volume);
        System.out.println("Quality: " + this.quality);
    }

}
