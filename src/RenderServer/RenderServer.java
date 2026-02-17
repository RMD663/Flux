package RenderServer;

import java.awt.*;

public interface RenderServer {
    void draw(DrawQuery dq);
    void clear();
    void background();
    void background(Color c);
    void setColor(Color c);
}
