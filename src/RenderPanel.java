import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.util.Vector;

public class RenderPanel extends JPanel implements ActionListener {

    Vector<Shape> shapes = new Vector<>();

    RenderPanel() {
    }

    RenderPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(true);
    }

    public void init()  {

    }


    public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g2D);
        draw(g2D);
    }

    public void draw(Graphics2D g){
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
