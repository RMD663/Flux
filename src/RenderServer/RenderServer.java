package RenderServer;
import Node.Shape;

public interface RenderServer {
    void draw();
    void clear();
    void background();
    //void background(Color c);
    void drawShape(Shape s);
}
