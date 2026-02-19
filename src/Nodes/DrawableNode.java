package Nodes;

import RenderServer.DrawQuery;
import Utils.Vector2;

public class DrawableNode extends Node {

    private int rotation = 0;
    private int zIndex = 0;
    private DrawQuery drawQuery = new DrawQuery();
    private Vector2 position = Vector2.ZERO;
    private Vector2 scale = Vector2.ZERO;
    public DrawableNode(Vector2 position){
        super();
    }

    public final void _draw(){
        if(!this.isDrawable()) return;
        this.drawQuery.position = this.position;
        this.drawQuery.scale = this.scale;
        this.drawQuery.zIndex = this.zIndex;
        this.drawQuery.rotation = this.rotation;
        this.onDraw();

        for(Node node : getChildren(true)){
            DrawableNode dNode = (DrawableNode) node;
            dNode._draw();
        }
    }

    public final void _process(Vector2 position){
        if (!this.isActive()) return;
        this.setPosition(position);
        this.onProcess();
        for (Node node : children) {
            node._process();
        }
    }

    public Vector2 getPosition(){
        return position;
    }

    public void setPosition(Vector2 newPosition){
        this.position = newPosition;
    }

    public DrawQuery getDrawQuery(){
        return this.drawQuery;
    }
}
