package d18_09;

public class AudioControl extends Control {
    // //Kreirati klasu AudioControl koja nasledjuje klasu Control i
    //        //gettere, settere i konstruktore
    //        //ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
    //        //implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
    //        //
    private boolean increaseDecrease;

    public AudioControl() {
    }

    @Override
    public void action(VideoPlayer videoPlayer) {
        int newVolume = videoPlayer.getVolume();
        if (this.increaseDecrease && (videoPlayer.getVolume() - 1) >= 0){
            newVolume -= 1;
        } else if (!this.increaseDecrease && (videoPlayer.getVolume() + 1) <= 100){
            newVolume += 1;
        }
        videoPlayer.setVolume(newVolume);
    }

    public boolean isIncreaseDecrease() {
        return increaseDecrease;
    }

    public void setIncreaseDecrease(boolean increaseDecrease) {
        this.increaseDecrease = increaseDecrease;
    }
}
