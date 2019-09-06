package Conexiones;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TryClass {
    
    static TrayIcon trayIcon;
    
    public TryClass() {
        show();
    }
        
    public static void show(){
    if(!SystemTray.isSupported()){
            System.exit(0);
        }
        trayIcon = new TrayIcon(createIcon("/Iconos/Recurso 3.png", "Icon"));
        trayIcon.setToolTip("Dulceria Tazmania V2.0");
        final SystemTray tray = SystemTray.getSystemTray();
        final PopupMenu menu = new PopupMenu();
        MenuItem about = new MenuItem("Acerca De");
        MenuItem exit = new MenuItem("Salir");
        menu.add(about);
        menu.addSeparator();
        menu.add(exit);
        about.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Tazmania v2.0 \nCreador:ITM");
        });
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        trayIcon.setPopupMenu(menu);
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
        }
    }
    
    protected static Image createIcon(String path, String desc){
        URL imageURL = TryClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
    }
}
