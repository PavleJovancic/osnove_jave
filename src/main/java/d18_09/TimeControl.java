package d18_09;

public class TimeControl extends Control{
    ////Kreirati klasu TimeControl koja nasledjuje klasu Control i
    //        //konstruktore
    //        //ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
    //        //implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
    //        //
    private boolean seek;

    public TimeControl() {
    }

    @Override
    public void action(VideoPlayer videoPlayer) {
        int newTime = videoPlayer.getCurrentTime();
        if (this.seek && (videoPlayer.getCurrentTime() - 15) >= 0){
            newTime -= 15;
        } else if (!this.seek && (videoPlayer.getCurrentTime() + 15) <= videoPlayer.getLength()){
            newTime += 15;
        }
        videoPlayer.setCurrentTime(newTime);
    }

    public boolean isSeek() {
        return seek;
    }

    public void setSeek(boolean seek) {
        this.seek = seek;
    }
}
