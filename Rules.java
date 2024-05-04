
//Rules..java // Rules page
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton b1, b2;
    String username;

    Rules(String username) {
        this.username = username;
        setBounds(500, 150, 800, 650);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel l1 = new JLabel("Welcome " + username + " to our Quiz game!");
        l1.setFont(new Font("Georgia", Font.BOLD, 28));
        l1.setForeground(new Color(0, 76, 255));
        l1.setBounds(50, 20, 700, 40);
        add(l1);
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(new Color(0, 31, 105));
        l2.setBounds(20, 90, 600, 400);
        l2.setText(
                "<html>" +
                        "<b><I>" + "--- Please read all the Instructions carefully before taking Quiz ---" + "</I></b>"
                        + "<br><br>" +
                        "1. The quiz contains total number of 10 questions" + "<br><br>" +
                        "2. All the questions are compulsory" + "<br><br>" +
                        "3. You will get 15 seconds for each question" + "<br><br>" +
                        "4. If you fail to answer the question in given time, no points will be alloted" + "<br><br>" +
                        "5. For every Right answer you'll get 10 points" + "<br><br>" +
                        "6. No points would be deducted for wrong answer" + "<br><br>" +
                        "7. There will be a 50-50 lifeline for one time use, you can use it if you get stuck on any question"
                        + "<br><br>" +
                        "<b><I>" + "--- All the Best, Do Well ! ---" + "</b></I>" + "<br><br>" +
                        "<html>");
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBackground(new Color(0, 76, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(new Color(0, 76, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new QuizGame().setVisible(true);
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new QuizQ(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Rules("");
    }
}
