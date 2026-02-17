package Nodes;
import java.awt.Graphics2D;

import Utils.Vector2;

public abstract class Shape {
    public Vector2 position;
    public enum shapeType {RECT, CIRC};
    public shapeType type;
    
    Shape(int x, int y){
        this.position = new Vector2(x, y);
    }

    public void draw(Graphics2D g2D){
    }


}
