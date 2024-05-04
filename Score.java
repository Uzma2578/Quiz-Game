
//Score.java //Scorecard page
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton b1;

    Score(String username, int score) {
        setBounds(500, 150, 650, 450);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icon/score.jpeg"));
        JLabel l1 = new JLabel(il);
        l1.setBounds(20, 120, 350, 250);
        add(l1);

        JLabel l2 = new JLabel("Thankyou " + username + " for playing our quiz game!");
        l2.setBounds(40, 40, 700, 30);
        l2.setFont(new Font("Raleway", Font.ITALIC, 26));
        add(l2);

        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(400, 200, 300, 30);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 29));
        l3.setForeground(new Color(0, 31, 105));
        add(l3);

        b1 = new JButton("Play Again!");
        b1.setBackground(new Color(0, 76, 255));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 26));
        b1.setBounds(400, 270, 200, 40);
        b1.addActionListener(this);
        add(b1);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new QuizGame().setVisible(true);
    }

    public static void main(String[] args) {
        new Score(" ", 0).setVisible(true);
    }
}
