package myTetris;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundPlayer {

    private static Clip clip = null;
    private static int position = 0;
    
    
    public static void soundPlay() {

        String AlienProjectTetris = "C://Work/github/Angi/proba/proba/BirthdayGameForDaniel/src/resource/AlienProjectTetris.wav";
        AudioInputStream audioInputStream = null;
        
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(AlienProjectTetris).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("File not found" + ex);
        } catch (LineUnavailableException ex) {
            System.out.println(ex);
        }
        clip.setFramePosition(position);
        clip.start();
    }
    
   public static void soundStop() {
       position = clip.getFramePosition();
       clip.stop();
   }
}
