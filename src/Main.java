import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main extends JFrame implements ActionListener {

    JButton test1 = new JButton("test1");
    JButton test2 = new JButton("test2");
    JButton test3 = new JButton("test3");
    JButton test4 = new JButton("test4");
    JButton test5 = new JButton("test5");
    JButton test6 = new JButton("test6");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();


    Main(){
        setPreferredSize(new Dimension(300,300));

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));


//        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(false);

        p1.setPreferredSize(new Dimension(300,100));
        p2.setPreferredSize(new Dimension(300,100));
        p3.setPreferredSize(new Dimension(300,100));

        p1.setBackground(Color.GREEN);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.CYAN);
        contentPane.setBackground(Color.BLACK);




        add(p1);
        add(p2);
        add(p3);

        p1.add(test1);
        p2.add(test2);
        p2.add(test3);
        p3.add(test4);
        p3.add(test5);
        p3.add(test6);










        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
	    new Main();

    }

    @Override
     public void actionPerformed(ActionEvent e){


    }
}
