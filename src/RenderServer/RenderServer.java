package RenderServer;

public interface RenderServer {
    void draw(DrawQuery dq);
    void clear();
    void background();
    void background(FluxColor c);
    void setColor(FluxColor c);
}
