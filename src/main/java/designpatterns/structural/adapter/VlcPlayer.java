package designpatterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC audio file: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
