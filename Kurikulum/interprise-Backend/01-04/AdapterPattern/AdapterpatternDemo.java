package Gradle;

public class AdapterpatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Benyond The horizon.mp3");
        audioPlayer.play("mp4","Alone mp.4");
        audioPlayer.play("vlc","Never gonna Give you Up.vlc");
        audioPlayer.play("avi","Horizon.avi");
    }
}
