/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;

/**
 *
 * @author adamh
 */
public class GameSettings {
    private boolean soundEnabled = true;
    private boolean endlessModeEnabled = true;
    private boolean timerEnabled = true;
    private boolean showHintEnabled = true;
    private String theme = "Light";
    private String difficulty = "Medium";
    
    public GameSettings(){
    }
    
    public boolean isSoundEnabled(){
        return soundEnabled;
    }
    
    public void setSoundEnabled(boolean soundEnabled){
        this.soundEnabled = soundEnabled;
    }
    
    public boolean isEndlessModeEnabled(){
        return endlessModeEnabled;
    }
    
    public void setEndlessModeEnabled(boolean endlessModeEnabled){
        this.endlessModeEnabled = endlessModeEnabled;
    }
    
    public boolean isTimerEnabled(){
        return timerEnabled;
    }
    
    public void setTimerEnabled(boolean timerEnabled){
        this.timerEnabled = timerEnabled;
    }
    
    public boolean isShowHintEnabled(){
        return showHintEnabled;
    }
    
    public void setShowHintEnabled(boolean showHintEnabled){
        this.showHintEnabled = showHintEnabled;
    }
    
    public String getTheme(){
        return theme;
    }
    
    public void setTheme(String theme){
        this.theme = theme;
    }
    
    public String getDifficulty(){
        return difficulty;
    }
    
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    
    
}
