/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;
import javax.swing.Timer;
/**
 *
 * @author adamh
 */
public class GameTimer {

    private Timer timer;
    private int timeLeft;
    private int maxTime;

    public GameTimer(int seconds, Runnable onTick, Runnable onTimeOut) {

        maxTime = seconds;
        timeLeft = seconds;

        timer = new Timer(1000, e -> {

            timeLeft--;

            onTick.run();

            if(timeLeft <= 0){
                timer.stop();
                onTimeOut.run();
            }
        });
    }

    public void start(){
        timeLeft = maxTime;
        timer.start();
    }

    public void restart(){
        timeLeft = maxTime;
        timer.restart();
    }

    public void stop(){
        timer.stop();
    }

    public int getTimeLeft(){
        return timeLeft;
    }
}
