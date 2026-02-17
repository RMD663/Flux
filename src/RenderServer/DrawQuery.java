package RenderServer;
import Nodes.Node;
import Utils.Vector2;

import java.awt.*;

public class DrawQuery {
    public Vector2 position;
    public Vector2 scale;
    public int rotation;
    public Color color;
    public int zIndex = 0;

    public DrawQuery(){
        this.position = new Vector2(0, 0);
        this.scale = new Vector2(0, 0);
        this.rotation = 0;
    }

    public DrawQuery(Vector2 position, Vector2 scale, int rotation){
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
    }

    public int getzIndex() {
        return zIndex;
    }

}
