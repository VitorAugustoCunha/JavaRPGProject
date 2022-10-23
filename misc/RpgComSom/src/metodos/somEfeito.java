package metodos;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class somEfeito {
    Clip clip;

    public void setArquivo(String somDoArquivo){
        try{
            File file = new File(somDoArquivo);
            AudioInputStream som = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open();
        }
        catch(Exception e){

        }
    }
    public void play(){
        clip.setFramePosition(0);
        clip.start();
    }
}
