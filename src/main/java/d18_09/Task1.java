package d18_09;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.

        VideoPlayer player = new VideoPlayer(540, 50);
        player.setCurrentTime(123);

        QualityOptimizerControl qualityOptimizerControl = new QualityOptimizerControl(75);
        qualityOptimizerControl.action(player);

        player.print();

        System.out.println();

        TimeControl timeControl = new TimeControl();
        System.out.print("Seek: ");
        String seek = s.next();
        if (seek.equals("forward")){
            timeControl.setSeek(false);
        } else if (seek.equals("backward")) {
            timeControl.setSeek(true);
        }
        timeControl.action(player);

        AudioControl audioControl = new AudioControl();
        System.out.print("Volume: ");
        String volume = s.next();
        if (seek.equals("up")){
            audioControl.setIncreaseDecrease(false);
        } else if (seek.equals("down")) {
            audioControl.setIncreaseDecrease(true);
        }
        audioControl.action(player);

        System.out.println();

        player.print();



    }
}
