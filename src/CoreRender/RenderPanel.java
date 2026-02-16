package CoreRender;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Vector;

import Node.Node;

public class RenderPanel extends JPanel  {

    Node window;

    public RenderPanel(Node root){
        window = new Node();
        window.addChild(root);
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
        window._draw(g);
    }

}
