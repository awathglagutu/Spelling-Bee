/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;

/**
 *
 * @author adamh
 */
public class Word {
    
    private String spelling;
    private String definition;
    private String audioPath;
    
    public Word(String spelling, String definition, String audioPath){
        this.spelling = spelling;
        this.definition = definition;
        this.audioPath = audioPath;
    }
    
    //Getters
    
    public String getSpelling(){
        return spelling;
    }
    
    public String getDefinition(){
        return definition;
    }
    
    public String getAudioPath(){
        return audioPath;
    }
    
    
}
