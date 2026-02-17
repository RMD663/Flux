package RenderServer;

import java.awt.*;

public class FluxColor {
    public int r,g,b,a;

    FluxColor(int r, int g, int b, int a){
        this.r = r;
        this.g = g;
        this.b = b;
        this.b = a;
    }

    static public FluxColor randomColor(){

        int r = (int)(Math.random() * 255f);
        int g = (int)(Math.random() * 255f);
        int b = (int)(Math.random() * 255f);
        int a = (int)(Math.random() * 255f);

        FluxColor c = new FluxColor(r,g,b,a);
        
        return c;
    }

    static public FluxColor randomColor(boolean staticAlpha){

        int r = (int)(Math.random() * 100);
        int g = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        FluxColor c = new FluxColor(r,g,b,255);

        return c;
    }


    static public Color toColor(FluxColor c) {
        Color color = new Color(c.r, c.g, c.b, c.a);
        return color;
    }
}