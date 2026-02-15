import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.util.Vector;

public class RenderPanel extends JPanel  {

    Vector<Node> nodes = new Vector<>();

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
        for (Node n : nodes) {
            n._draw(g);
        }
    }

    public void addNode(Node n){
        nodes.add(n);
    }

    public void removeNode(Node n){
        nodes.remove(n);
    }

}
