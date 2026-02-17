package RenderServer;
import Nodes.Node;
import Utils.Vector2;

public class DrawQuery {
    public Vector2 position;
    public Vector2 scale;
    public int rotation;

    DrawQuery(Vector2 position, Vector2 scale, int rotation){
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
    }
}
