package CoreRender;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import RenderServer.*;
import Utils.Vector2;

public class RenderPanel extends Canvas implements RenderServer {

    private BufferStrategy bufferStrategy;
    private Vector2 size;
    private Color backgroundColor;
    private ArrayList<DrawQuery> drawCalls;
    private boolean visible;


    public RenderPanel(Vector2 size, Color background, boolean isVisible){
        this.drawCalls = new ArrayList<>();
        this.setSize(new Dimension(size.x, size.y));
        this.backgroundColor = background;
        this.setFocusable(true);
        this.setVisible(isVisible);
    }

    public void _init(){
        createBufferStrategy(3);
        bufferStrategy = getBufferStrategy();
    }

    public void render() {
        do {
            do {
                Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();

                // Clear
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());

                // drawQueue - begins
                for (DrawQuery dq : drawCalls){
                    g.setColor(dq.color);
                    g.fillRect(dq.position.x, dq.position.y, dq.scale.x, dq.scale.y);
//                    if (dq.sprite){
//                    }
                }
                // drawQueue - ends

                g.dispose();
            } while (bufferStrategy.contentsRestored());

            bufferStrategy.show();
        } while (bufferStrategy.contentsLost());
    }

    public void _clear(DrawQuery dq){
        drawCalls.remove(dq);
    }

    public void draw(DrawQuery dq) {
        drawCalls.add(dq);

    }

    public void clear() {
        drawCalls.clear();
    }

    public void background() {

    }


    public void setColor(Color c) {

    }


    public void background(Color c) {

    }
}
