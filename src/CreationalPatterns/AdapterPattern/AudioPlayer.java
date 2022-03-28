package CreationalPatterns.AdapterPattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("Mp3")){
            System.out.println("Playing mp3");
        }
        else if(audioType.equals("Mp4") || audioType.equals("Vlc") )
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println(audioType + "File name is not supported!");
        }
    }
}
