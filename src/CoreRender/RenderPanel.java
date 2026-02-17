package CoreRender;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Vector;

import RenderServer.*;
import Utils.Vector2;

public class RenderPanel extends Canvas implements RenderServer {

    private BufferStrategy bufferStrategy;
    private Vector2 size;
    private FluxColor backgroundColor;
    private ArrayList<DrawQuery> drawCalls;
    private boolean visible;

    public RenderPanel(Vector2 size, FluxColor background, boolean isVisible){
        drawCalls = new ArrayList<>();
        this.setSize(new Dimension(size.x, size.y));
        this.setBackground(FluxColor.toColor(background));
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
                    g.setColor(Color.black);
                    g.fillRect(dq.position.x, dq.position.y, dq.scale.x, dq.scale.y);
                }

                // drawQueue - ends

                g.dispose();
            } while (bufferStrategy.contentsRestored());

            bufferStrategy.show();
            Toolkit.getDefaultToolkit().sync();
        } while (bufferStrategy.contentsLost());
    }



    public void draw(DrawQuery dq) {
        drawCalls.add(dq);
    }

    public void clear() {

    }

    public void background() {

    }


    public void setColor(FluxColor c) {

    }


    public void background(FluxColor c) {

    }
}
