package Nodes;

import Utils.Vector2;

public class DrawableNode extends Node {

    private Vector2 position = Vector2.ZERO;

    public DrawableNode(Vector2 position){
        super();
    }

    public final void _process(Vector2 position){
        if (!this.isActive()) return;
        this.position = position;
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



}
