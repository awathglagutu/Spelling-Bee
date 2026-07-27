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
    private boolean soundEnabled;
    private boolean endlessModeEnabled;
    private boolean timerEnabled;
    private boolean showHintEnabled;
    private String theme;
    private String difficulty;
    private int volume;
    private int questions;
    
    public GameSettings(){
        resetToDefault();
    }
    
    public void resetToDefault(){
        soundEnabled = true;
        endlessModeEnabled = true;
        timerEnabled = true;
        showHintEnabled = true;
        theme = "Light";
        difficulty = "Medium";
        volume = 80;
        questions = 20;
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
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setQuestions(int questions){
        this.questions = questions;
    }
    
    public int getQuestions(){
        return questions;
    }
    
}
