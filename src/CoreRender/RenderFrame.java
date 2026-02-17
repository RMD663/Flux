package CoreRender;
import java.awt.Dimension;
import javax.swing.JFrame;

public class RenderFrame extends JFrame{

    private final RenderPanel rp;

    RenderFrame(String win_title, int width, int height){
        rp = new RenderPanel(width, height);
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