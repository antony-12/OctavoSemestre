package Conexiones;

import javax.swing.JProgressBar;

public class cargar1 extends Thread{
    JProgressBar progreso;
    double i = 50, j = 1;
    cargar hilo;
    
    public cargar1(JProgressBar progreso){
        super();
        this.progreso = progreso;
    }
    
    @Override
    public void run(){
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

    
    public void pausa2(){
        try
            {
                Thread.sleep(8500);
            } catch(InterruptedException e)
            {
                
            }
    }
    
}
