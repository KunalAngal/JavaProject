package Project;
import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game_frame extends JFrame {
    public static final int frame_Width = 1014;
    public static final int frame_Height = 615;

    public GamePanel gamePanel;

//    JLabel left_paddle;
//    JLabel right_paddle;

    Game_frame(String p1, String p2, int scoreToWin) {
        gamePanel = new GamePanel(p1, p2, scoreToWin);
        this.setVisible(true);
        this.setSize(frame_Width,frame_Height);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game Frame");
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);
        this.add(gamePanel);
    }

//    public static void main(String[] args) {
//
//        Game_frame FR = new Game_frame();
//    }


}


