package Nodes;

import Nodes.Node;
import Utils.Vector2;

public class TranslationNode extends Node {
    public Vector2 globalPosition;

    public TranslationNode(Vector2 position){
        super();
        this.globalPosition = position;
    }

    public Vector2 getPosition(){
        return this.globalPosition;
    }
}
