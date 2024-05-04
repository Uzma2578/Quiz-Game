
//QuizQ.java // Quiz page
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizQ extends JFrame implements ActionListener {
    JButton next, lifeline, submit;
    JRadioButton opt1, opt2, opt3, opt4;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    ButtonGroup options;
    String username;

    QuizQ(String username) {
        this.username = username;
        setBounds(200, 50, 1000, 750);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("./icon/mhss2.jpg"));
        JLabel l1 = new JLabel(il);
        l1.setBounds(0, 0, 350, 300);
        add(l1);
        ImageIcon il2 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz logo.jpg"));
        JLabel l2 = new JLabel(il2);
        l2.setBounds(610, 0, 380, 300);
        add(l2);
        ImageIcon il3 = new ImageIcon(ClassLoader.getSystemResource("./icon/mhss logo.png"));
        JLabel l3 = new JLabel(il3);
        l3.setBounds(330, 0, 300, 300);
        add(l3);

        qno = new JLabel("");
        qno.setFont(new Font("Georgia", Font.PLAIN, 24));
        qno.setBounds(100, 400, 40, 30);
        add(qno);

        question = new JLabel("");
        question.setFont(new Font("Georgia", Font.PLAIN, 24));
        question.setBounds(130, 400, 900, 30);
        add(question);

        q[0][0] = "Which keyword is used for accessing the features of a package?";
        q[0][1] = "import";
        q[0][2] = "package";
        q[0][3] = "extends";
        q[0][4] = "export";

        q[1][0] = "Which package contains the Random class?";
        q[1][1] = "java.util package";
        q[1][2] = "java.lang package";
        q[1][3] = "java.awt package";
        q[1][4] = "java.io package";

        q[2][0] = "Which of the following option leads to the portability and security of Java?";
        q[2][1] = "Bytecode is executed by JVM";
        q[2][2] = "The applet makes the Java code secure and portable";
        q[2][3] = "Use of exception handling";
        q[2][4] = "Dynamic binding between objects";

        q[3][0] = "Which of the following is not a Java features?";
        q[3][1] = "Dynamic";
        q[3][2] = "Architecture Neutral";
        q[3][3] = "Use of pointers";
        q[3][4] = "Object-oriented";

        q[4][0] = "What is the return type of the hashCode() method in the Object class?";
        q[4][1] = "Object";
        q[4][2] = "int";
        q[4][3] = "long";
        q[4][4] = "void";

        q[5][0] = "Which of the following is a valid long literal?";
        q[5][1] = "ABH8097";
        q[5][2] = "L990023";
        q[5][3] = "904423";
        q[5][4] = "0xnf029L";

        q[6][0] = "What does the expression float a = 48 / 0 return?";
        q[6][1] = "0";
        q[6][2] = "Not a Number";
        q[6][3] = "Infinity";
        q[6][4] = "Run time exception";

        q[7][0] = "Which option is false about the final keyword?";
        q[7][1] = "A final method cannot be overridden in its subclasses.";
        q[7][2] = "A final class cannot be extended.";
        q[7][3] = "A final class cannot extend other classes.";
        q[7][4] = "A final method can be inherited";

        q[8][0] = "How many threads can be executed at a time?";
        q[8][1] = "Only one thread";
        q[8][2] = "Multiple threads";
        q[8][3] = "Only main (main() method) thread";
        q[8][4] = "Two threads";

        q[9][0] = "Which of the following is a reserved keyword in Java?";
        q[9][1] = "object";
        q[9][2] = "strictfp";
        q[9][3] = "main";
        q[9][4] = "system";

        qa[0][1] = "import";
        qa[1][1] = "java.util package";
        qa[2][1] = "Bytecode is executed by JVM";
        qa[3][1] = "Use of pointers";
        qa[4][1] = "int";
        qa[5][1] = "0xnf029L";
        qa[6][1] = "Infinity";
        qa[7][1] = "A final class cannot extend other classes.";
        qa[8][1] = "Multiple threads";
        qa[9][1] = "strictfp";

        opt1 = new JRadioButton("");
        opt1.setBounds(140, 450, 600, 30);
        opt1.setFont(new Font("Georgia", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);

        opt2 = new JRadioButton("");
        opt2.setBounds(140, 480, 600, 30);
        opt2.setFont(new Font("Georgia", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);

        opt3 = new JRadioButton("");
        opt3.setBounds(140, 510, 600, 30);
        opt3.setFont(new Font("Georgia", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);

        opt4 = new JRadioButton("");
        opt4.setBounds(140, 540, 600, 30);
        opt4.setFont(new Font("Georgia", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);

        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

        next = new JButton("Next");
        next.setBounds(780, 490, 150, 30);
        next.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        next.setBackground(new Color(0, 76, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(780, 550, 150, 30);
        lifeline.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lifeline.setBackground(new Color(0, 76, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(780, 610, 150, 30);
        submit.setEnabled(false);
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        submit.setBackground(new Color(0, 76, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        start(0);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = " ";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = " ";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for (int i = 0; i < pa.length; i++) {
                if (pa[i][0].equals(qa[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        } else if (ae.getSource() == lifeline) {
            if (count == 0 || count == 1 || count == 2 || count == 4 || count == 8 || count == 9) {
                opt3.setEnabled(false);
                opt4.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        String time = "Time left - " + timer + " seconds ";
        g.setColor(Color.red);
        g.setFont(new Font("Times New Roman", Font.BOLD, 26));

        if (timer > 0) {
            g.drawString(time, 740, 390);
        } else {
            g.drawString("Times Up!!", 790, 390);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        }
        catch (Exception e) {
        e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) {
                if (options.getSelection() == null) {
                    pa[count][0] = " ";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }

                for (int i = 0; i < pa.length; i++) {
                    if (pa[i][0].equals(qa[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            } else {
                if (options.getSelection() == null) {
                    pa[count][0] = " ";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
    
        opt1.setText(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setText(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setText(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setText(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }

    public static void main(String[] args) {
        new QuizQ("").setVisible(true);
    }
}
