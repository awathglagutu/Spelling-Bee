/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;

/**
 *
 * @author adamh
 */
public class AudioPlayer {
    
    public static Clip createClip(String path, GameSettings settings)throws Exception{
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(path));
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        if(settings != null){
        FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        int sliderValue = settings.getVolume();
        
        if(sliderValue <= 0f){
            volumeControl.setValue(volumeControl.getMinimum());
        }
        else{
        float volume = sliderValue / 100f;
        float gain = 20f * (float) Math.log10(volume);
        
        gain = Math.max(gain, volumeControl.getMinimum());
        volumeControl.setValue(gain);
        }
    }
        return clip;
    }
    
    public static void playAudio(String path, GameSettings settings){
    try {
        Clip clip = createClip(path, settings);

        Object lock = new Object();
        clip.addLineListener(event -> {
            if (event.getType() == LineEvent.Type.STOP) {
                synchronized (lock) {
                    lock.notifyAll();
                }
            }
        });

        clip.start();

        synchronized (lock) {
            lock.wait(); // waits until STOP event fires
        }
        clip.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public static void playSound(String path, GameSettings settings){
        
        if(!settings.isSoundEnabled()){return;}
        
    try{
        Clip clip = createClip(path, settings);
        
        clip.addLineListener(event -> {
            if (event.getType() == LineEvent.Type.STOP){
                clip.close();
            }
        });
        
        clip.start();
        
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
