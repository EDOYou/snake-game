package game;

import javax.swing.SwingUtilities;
import game.view.GameWindow;

public class SnakeGame {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      GameWindow gameWindow = new GameWindow();
      gameWindow.setVisible(true);
    });
  }
}
