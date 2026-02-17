package CoreRender;
import Utils.Vector2;

import javax.swing.JFrame;
import java.awt.*;

public class RenderFrame extends JFrame{

    private final RenderPanel rp;

    public RenderFrame(String win_title, int width, int height){
        rp = new RenderPanel(new Vector2(width, height), Color.LIGHT_GRAY, true);
        this.add(rp);
        this.setTitle(win_title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);        

    }

    public RenderPanel getRenderPanel(){
        return rp;
    }

    
}