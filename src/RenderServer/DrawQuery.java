package RenderServer;
import Node.Node;
import Utils.Vector2;

public class DrawQuery {
    public Vector2 position;
    public Vector2 scale;
    public int rotation;
    private Node owner;

    DrawQuery(Node owner, Vector2 position, Vector2 scale, int rotation){
        this.owner = owner;
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
    }
}
