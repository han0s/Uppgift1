import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main extends JFrame implements ActionListener {

    JButton load = new JButton("load");


    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel p2 = new JPanel();
    JLabel pic_source = new JLabel();

    JLabel actual_pic = new JLabel();
    JScrollPane picPanel = new JScrollPane(actual_pic);
    ImageIcon pict;

    Main(){
        setPreferredSize(new Dimension(500,500));

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));

        Box b1 = new Box(BoxLayout.X_AXIS);
        b1.setAlignmentX(LEFT_ALIGNMENT);



//        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(true);





//        contentPane.setBackground(Color.BLACK);


        add(b1);


        b1.add(load);
        b1.add(pic_source);


        add(picPanel);


        load.addActionListener(this);







        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
	    new Main();

    }

    @Override
     public void actionPerformed(ActionEvent e){
        if (e.getSource() == load){
            image img = new image();
            pict = img.getpic();
            actual_pic.setIcon(pict);
            pic_source.setText(img.adr);

        }


    }
}
