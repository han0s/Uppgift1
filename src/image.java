import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Arrays;


public class image {
    String adr;
    String[] recent = new String[5];
    int n = 0;

    image(){
/*        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        ImageIcon lol = null;
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            System.out.println("you chose to open this file: "+ chooser.getSelectedFile().getName());

            adr = chooser.getSelectedFile().getPath();
            addToRecent(adr);

        }



      */
    }

    void loadImage(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        ImageIcon lol = null;
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            System.out.println("you chose to open this file: "+ chooser.getSelectedFile().getName());

            adr = chooser.getSelectedFile().getPath();
            addToRecent(adr);

        }


    }

    public ImageIcon getpic(){

        ImageIcon temp = new ImageIcon(adr);

        return temp;
    }


    void addToRecent(String temp){

        if (n > recent.length){
            n = 0;
            recent[n] = temp;
            n++;

        }
        else {
            recent[n] = temp;
            System.out.println(recent[n]);
            System.out.println(Arrays.toString(recent));
            n++;
        }

    }

}
