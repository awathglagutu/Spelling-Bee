/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;

/**
 *
 * @author adamh
 */
public class AudioPlayer {
    public static void playAudio(String path){
    try {
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(path));
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

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
    
    public static void playSound(String path){
    try{
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(path));
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
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
