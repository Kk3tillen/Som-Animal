/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author kezia
 */
public class Galinha implements Animal{

    @Override
    public void emitirSom(Animal galinha) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/sonsAnimais/galinha.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
  
        } catch (Exception ex) {
            System.out.println("/sonsAnimais/" + galinha + ".wav");
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
}
