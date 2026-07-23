/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spellingbee;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author adamh
 */
public class WorldLoader {
    
    public static ArrayList<Word> loadWords(String filename){
        
        ArrayList<Word> words = new ArrayList<>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            String line;
            
            while((line = br.readLine()) != null){
                String[] data = line.split("\\|");
                
                Word word = new Word(
                data[0],
                data[1],
                data[2]);
                
                words.add(word);
            }
            br.close();
            
            
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return words;
    }
    
}
