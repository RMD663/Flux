import java.awt.Graphics2D;

public class Rect extends Shape {
    
    int width, height;

    Rect(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
        this.type = shapeType.RECT;
    }

    public void draw(Graphics2D g2D){
        g2D.drawRect(this.position.x, this.position.y, this.width, this.height);
    }



}
