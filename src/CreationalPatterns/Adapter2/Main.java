package CreationalPatterns.Adapter2;

public class Main {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("Mp3", "beyond the horizon.mp3");
        audioPlayer.play("Mp4", "alone.mp4");
        audioPlayer.play("vlc", "far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
