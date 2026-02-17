package RenderServer;

import Utils.Vector2;

import java.awt.*;

public class SpriteDrawQuery extends DrawQuery{
    private Image spriteData;

    SpriteDrawQuery(Vector2 position, Vector2 scale, int rotation) {
        super(position, scale, rotation);
    }
}
