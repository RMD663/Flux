import java.awt.Dimension;

import javax.swing.JFrame;

public class RenderFrame extends JFrame{

    RenderPanel rp = new  RenderPanel();

    RenderFrame(String win_title, int width, int height){
        rp.setPreferredSize(new Dimension(width, height));
        this.add(rp);
        this.setTitle(win_title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);        
    }   


    
}