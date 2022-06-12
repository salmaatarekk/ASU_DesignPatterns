package CreationalPatterns.Adapter2;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPLayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPLayer = new VlcPlayer();
        else if(audioType.equalsIgnoreCase("Mp4"))
            advancedMusicPLayer = new mp4Player();

    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPLayer.playVlc(fileName);
        else if(audioType.equalsIgnoreCase("Mp4"))
            advancedMusicPLayer.playMp4(fileName);
    }
}
