package RenderServer;

import Utils.Vector2;

import java.awt.*;

public class ShapeDrawQuery extends DrawQuery{

    ShapeDrawQuery(Vector2 position, Vector2 scale, Color color, int rotation) {
        super(position, scale, rotation);
        this.color = color;
    }
}
