import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Arrays;


public class image {
    private String adr;
    private String[] recent = new String[5];
    private int fileCount = 0;
    private ImageIcon temp;

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
        else {
            System.exit(0);
        }


    }

    public ImageIcon getPic(){

        temp = new ImageIcon(adr);

        return temp;
    }

    public ImageIcon selectPic(String x){
        temp = new ImageIcon(x);

        return temp;
    }

    public String[] getRecent(){
        return recent;

    }

    public String getFilePath(){
        return adr;
    }


    void addToRecent(String x){

        if (fileCount >= recent.length){
            fileCount = 0;
            recent[fileCount] = x;
            fileCount++;

        }
        else {
            recent[fileCount] = x;
            System.out.println(recent[fileCount]);
            System.out.println(Arrays.toString(recent));
            fileCount++;
        }

    }

}
