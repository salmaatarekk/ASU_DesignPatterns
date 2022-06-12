package CreationalPatterns.Adapter2;

public class mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing Mp4 file name " + fileName);
    }
}
