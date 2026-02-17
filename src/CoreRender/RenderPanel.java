package CoreRender;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import RenderServer.*;

public class RenderPanel extends JPanel implements RenderServer {


    RenderPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(true);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g2D);
        _draw(g2D);
    }

    public void _paintBackground(Graphics2D g2d){

    }

    public void _draw(Graphics2D g2d){
    }

    public void draw(DrawQuery dq){
            this.getGraphics();
    };
    public void clear(){

    }
    public void background(){

    }

    public void background(FluxColor c){
    }

    public void setColor(FluxColor c){

    }


}
