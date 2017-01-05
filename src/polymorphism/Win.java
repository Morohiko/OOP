package polymorphism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hp on 04.01.2017.
 */
class Win extends JFrame {
    static String text;
    private JLabel label;
    Win(){
        super("window");
        setVisible(true);
        setSize(300, 200);
        createWin();
    }

    private void createWin(){
        System.out.println("text = " + text);
        JButton snakebtn = new JButton("Snake");
        JButton dogbtn = new JButton("Dog");
       label = new JLabel("text");
        //label.setText(text);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        setLayout(new GridLayout(3, 1));
        add(panel1);
        add(panel2);

        panel1.add(snakebtn);
        panel1.add(dogbtn);
        panel2.add(label);





        snakebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Snake();
                reloadText();
            }
        });
        dogbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dog();
                reloadText();
            }
        });
    }

    private void reloadText(){
        label.setText(text);
    }
}
