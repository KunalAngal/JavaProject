package Project;
import javax.swing.*;
import java.awt.*;

public class WinnerDialog extends JFrame {
    JLabel winnerLabel;

    WinnerDialog(String winner){
        this.setSize(400,400);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        winnerLabel = new JLabel("winner is " + winner);
        winnerLabel.setBounds(50,135,300,50);
        winnerLabel.setFont(new Font("poppoins", Font.BOLD, 24));
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);
        winnerLabel.setVerticalAlignment(JLabel.CENTER);
        winnerLabel.setHorizontalTextPosition(JLabel.CENTER);
        winnerLabel.setVerticalTextPosition(JLabel.CENTER);

        this.add(winnerLabel);
        this.setVisible(true);
    }

}
