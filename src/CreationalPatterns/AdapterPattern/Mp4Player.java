package CreationalPatterns.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 File name : " + fileName);
    }
}
