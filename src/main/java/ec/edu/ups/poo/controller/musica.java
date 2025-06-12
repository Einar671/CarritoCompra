package ec.edu.ups.poo.controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

public class musica {

    private Clip clip;

    public void cargarSonido(String ruta){
        try {
            URL url = getClass().getClassLoader().getResource(ruta);
            if (url == null) {
                System.out.println("No se encontró el archivo de sonido");
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void reproducir(){
        if(clip != null){
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void detener(){
        if(clip != null && clip.isRunning()){
            clip.stop();
        }
    }
}




