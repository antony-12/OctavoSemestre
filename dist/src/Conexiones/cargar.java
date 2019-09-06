package Conexiones;

import java.applet.AudioClip;
import javax.swing.JProgressBar;

public class cargar extends Thread{
    JProgressBar progreso;
    
    public cargar(JProgressBar progreso){
        super();
        this.progreso = progreso;
    }
    
    @Override
    public void run(){
        cargarAudio();
        for(int i=1;i<101;i++)
            {
                progreso.setValue(i);
                pausa(80);
            }
    }
    
    public void pausa(int mlSeg){
        try
            {
                Thread.sleep(mlSeg);
            } catch(InterruptedException e)
            {
                
            }
    }
    
    public void cargarAudio() {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/inicio.wav"));
        sonido.play();
        pausa2();
    }
    
    public void pausa2(){
        try
            {
                Thread.sleep(700);
            } catch(InterruptedException e)
            {
                
            }
    }
}
