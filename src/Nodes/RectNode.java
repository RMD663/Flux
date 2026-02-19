package Nodes;
import java.awt.Graphics2D;

import Utils.Vector2;

public class RectNode extends Node{
    private Rect rect;
    public Vector2 positon;
    public Vector2 scale;

    public RectNode(Vector2 position, Vector2 scale){

        rect = new Rect(position.x, position.y, scale.x, scale.y);
        this.scale = scale;
    }

}
