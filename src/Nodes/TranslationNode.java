package Nodes;

import Nodes.Node;
import Utils.Vector2;

import java.util.ArrayList;

public class TranslationNode extends Node {
    public Vector2 globalPosition;

    public TranslationNode(Vector2 position){
        super();
        this.globalPosition = position;
    }

    public void _process(){
        if (!this.isActive()) return;

        this.onProcess();
        for (Node node : children) {
            DrawableNode dNode = (DrawableNode) node;
            dNode._process(this.getPosition());
        }

    }

    public Vector2 getPosition(){
        return this.globalPosition;
    }

    public void setGlobalPosition(Vector2 globalPosition) {
        this.globalPosition = globalPosition;
    }
}
