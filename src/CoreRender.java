import java.awt.Color;

public class CoreRender implements RenderServer{

    private RenderFrame rf;
    private RenderPanel rp;

    CoreRender(String title, int width, int height){
        rf = new RenderFrame( title, width, height);
        rp = rf.getRenderPanel();
    }

    public void draw(){
        rp.repaint();
    }
    public void clear(){
    }
    public void background(){}
    
    public void background(Color bg){
        rp.setBackground(bg);
    }
    public void drawShape(Shape s){}
    public void addDrawableNode(Node dn){
        rp.addNode(dn);
    }
    public void removeDrawableNode(Node dn){
        rp.removeNode(dn);
    }
}
