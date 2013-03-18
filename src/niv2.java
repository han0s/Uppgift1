import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class niv2 extends JFrame implements ActionListener {


    JButton button;
    boolean running = true;



    String[] recent_pic_source = new String[5];
    JComboBox recent_pics = new JComboBox();
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel p2 = new JPanel();
    JLabel pic_source = new JLabel();

    JLabel actual_pic = new JLabel();
    JScrollPane picPanel = new JScrollPane(actual_pic);
    ImageIcon pict;
    image img;



    niv2(){
        setPreferredSize(new Dimension(500,500));
        setResizable(false);
        JPanel mainPanel = new JPanel(new FlowLayout());

        JPanel topPanel = new JPanel(new GridBagLayout());


        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        add(mainPanel);
        mainPanel.add(topPanel);
        picPanel.setPreferredSize(new Dimension(500,440));
        mainPanel.add(picPanel);


        button = new JButton("test");

        topPanel.add(button, c);

        recent_pics.setPreferredSize(new Dimension(375,30));
        topPanel.add(recent_pics,c);

        img = new image();

        button.addActionListener(this);
        recent_pics.addActionListener(this);



        setVisible(true);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        new niv2();
    }

    public void load(){
        img.loadImage();
        pict = img.getpic();
        actual_pic.setIcon(pict);
        pic_source.setText(img.adr);

            updateRecent();




    }

    public void updateRecent(){

        for (String s: recent_pic_source){
            recent_pic_source = img.recent;
        }
        for (String s: recent_pic_source){
            System.out.println(s);
        }

        recent_pics.addItem(img.adr);



    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            load();

        }
        if (e.getSource() == recent_pics){

        }
    }
}
