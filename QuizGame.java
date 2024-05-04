
//QuizGame.java // Starting page
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizGame extends JFrame implements ActionListener {
        JButton b1, b2;
        JTextField t1;
        JLabel l1, l2, l3;

        QuizGame() {
                setBounds(500, 150, 600, 500);
                getContentPane().setBackground(Color.WHITE);
                setLayout(null);
                ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icon/mhss1.png"));
                l1 = new JLabel(il);
                l1.setBounds(100, 0, 350, 100);
                add(l1);
                l2 = new JLabel("Welcome to our Java Quiz game !");
                l2.setFont(new Font("Georgia", Font.BOLD, 27));
                l2.setForeground(new Color(0, 76, 255));
                l2.setBounds(45, 110, 470, 40);
                add(l2);

                l3 = new JLabel("Enter your Name");
                l3.setFont(new Font("Raleway", Font.BOLD, 18));
                l3.setForeground(new Color(0, 76, 255));
                l3.setBounds(190, 180, 400, 30);
                add(l3);

                t1 = new JTextField();
                t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                t1.setBounds(70, 240, 400, 30);
                t1.setForeground(new Color(0, 31, 105));
                t1.setBackground(new Color(196, 210, 242));
                add(t1);

                b1 = new JButton("Rules");
                b1.setFont(new Font("Times New Roman", Font.BOLD, 22));
                b1.setBounds(70, 310, 140, 25);
                b1.setBackground(new Color(0, 76, 255));
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                add(b1);

                b2 = new JButton("Exit");
                b2.setFont(new Font("Times New Roman", Font.BOLD, 22));
                b2.setBounds(330, 310, 140, 25);
                b2.setBackground(new Color(0, 76, 255));
                b2.setForeground(Color.WHITE);
                b2.addActionListener(this);
                add(b2);
                setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                        if (t1.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, " Name cannot be Blank, Please enter a name!");
                        } else {
                                String name = t1.getText();
                                this.setVisible(false);
                                new Rules(name);
                        }
                } else {
                        System.exit(0);
                }
        }

        public static void main(String[] args) {
                new QuizGame();
        }
}
