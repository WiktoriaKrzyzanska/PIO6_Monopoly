import javax.swing.*;
import java.awt.*;

public class Window {
    private String title;
    private String gameName = "Moneyland";
    private static Window window = null;
    boolean resizeWindow = true;
    private Window(){}
    private void setWindow(){
        GraphicsDevice deviceSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        this.title = gameName;
        JFrame gameWindow = new JFrame(title);
        deviceSize.setFullScreenWindow(gameWindow);
        gameWindow.setResizable(resizeWindow);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static Window get(){
        if(Window.window == null){
            Window.window = new Window();
        }
        return Window.window;
    }
    public void closeWindow(){
        GraphicsDevice closeWindow = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        closeWindow.setFullScreenWindow(null);
    }

    public void run() {
        setWindow();
        closeWindow();
    }
}
