package RenderServer;

import Utils.Vector2;

public class ShapeDrawQuery extends DrawQuery{

    ShapeDrawQuery(Vector2 position, Vector2 scale, FluxColor color, int rotation) {
        super(position, scale, rotation);
        this.color = color;
    }
}
