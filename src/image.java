import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Created with IntelliJ IDEA.
 * User: hannes
 * Date: 15.3.2013
 * Time: 22.20
 * To change this template use File | Settings | File Templates.
 */
public class image {

    image(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");

        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            System.out.println("you chose to open this file: "+ chooser.getSelectedFile().getName());
        }


    }

}
