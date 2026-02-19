package Nodes;

import RenderServer.DrawQuery;

import java.util.ArrayList;
import java.util.Vector;

public class Node {
    ArrayList<Node> children = new ArrayList<>();
    String id;
    private boolean isActive = true;
    private DrawQuery drawQuery;
    private boolean isDrawable = false;
    private Node owner;
    private boolean isInDeletionQueue = false;
    public Node(){
        drawQuery = new DrawQuery();
    }


    public void _ready(){
        for(Node node : getChildren(true)){
            node.onReady();
        }
        this.onReady();
    }

    public void _processDeletion(){
        for (Node child : children){
            if(child.isInDeletionQueue){
                this.removeChild(child);
            }
        }
    }
    public void _process(){
        if (!isActive) return;

        this.onProcess();
        for (Node node : children) {
            node._process();
        }

    }

    public void _draw(){
        for(Node child : getChildren(true)){
            child._draw();
        }
        if (isDrawable) onDraw();

    }

    public void onReady(){}
    public void onDraw(){}

    public void onProcess(){}

    public void addChild(Node child) {
        child.owner = this;
        children.add(child);
    }

    public void removeChild(Node child) {
        children.remove(child);
    }

    public ArrayList<Node> getChildren(boolean getInternal) {
        if(!getInternal){
            return children;
        }  else {
            ArrayList<Node> internalChildren = new ArrayList<>();
            internalChildren = collectAllChildren(internalChildren);
            return internalChildren;
        }
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public Node getOwner(){
        return owner;
    }


    public boolean hasChildren() {
        return children.size() > 0 ? true : false;
    }

    private ArrayList<Node> collectAllChildren(ArrayList<Node> list){
        for (Node node : children) {
            list.add(node);
            if(node.hasChildren()){
                node.collectAllChildren(list);
            } 
        }
        return list;
    }

    public boolean isDrawable(){
        return isDrawable;
    }

    public void show(){
        this.isDrawable = true;
    }

    public void hide(){
        this.isDrawable = false;
    }

    public boolean isActive(){
        return isActive;
    }

    public void disable(){
        this.isActive = false;
    }

    public void enable(){
        this.isActive = true;
    }


}