package Nodes;

import java.util.ArrayList;

public class Node {
    ArrayList<Node> children = new ArrayList<>();
    String id;
    private boolean isActive = true;
    
    @SuppressWarnings("unused")
    private boolean isDrawable = false;
    public Node owner;
    
    public Node(){
    }

    public final void _process(){
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
}