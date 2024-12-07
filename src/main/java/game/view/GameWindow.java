package game.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

  public GameWindow() {
    setTitle("Snake Game");
    setSize(800, 600);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    initializeComponents();
  }

  private void initializeComponents() {
    JPanel panel = new JPanel();
    add(panel);
  }
}
