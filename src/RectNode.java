import java.awt.Graphics2D;

public class RectNode extends Node{
    private Rect rect;
    public Vector2 positon;
    public Vector2 scale;

    RectNode(Vector2 position, Vector2 scale){

        rect = new Rect(position.x, position.y, scale.x, scale.y);
        this.scale = scale;
    }

    public void _draw(Graphics2D g2D){
        g2D.drawRect(rect.position.x, rect.position.y, scale.x, scale.y);
    }
}
