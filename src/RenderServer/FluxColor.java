package RenderServer;
public class FluxColor {
    int r,g,b,a;

    FluxColor(int r, int g, int b, int a){
        this.r = r;
        this.g = g;
        this.b = b;
        this.b = a;
    }

    static public FluxColor randomColor(){

        int r = ((int)Math.random());
        int g = ((int)Math.random());
        int b = ((int)Math.random());
        int a = ((int)Math.random());

        FluxColor c = new FluxColor(r,g,b,a);
        
        return c;
    }
    
}