package CreationalPatterns.AdapterPattern;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equals("Vlc")){
            advancedMusicPlayer = new VlcPlayer();
        }
        else if(audioType.equals("Mp4"))
            advancedMusicPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("Vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equals("Mp4"))
            advancedMusicPlayer.playMp4(fileName);
    }
}
