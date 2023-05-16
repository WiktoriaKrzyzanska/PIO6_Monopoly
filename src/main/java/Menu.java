import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu {
    private JFrame gameWindow;

    public Menu(JFrame window) {
        this.gameWindow = window;
        createMenu();
    }

    private void createMenu() {
        // Menu
        JPanel menuPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);

        // "start" button
        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // future start the game code
            }
        });

        menuPanel.add(startButton, constraints);
        gameWindow.getContentPane().add(menuPanel);
        gameWindow.setSize(400, 300);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);


    }
}







