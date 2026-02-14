import java.util.Vector;

public class Node {
    Vector<Node> children = new Vector<>();
    String id;
    private boolean isActive = true;
    
    Node() {
    }

    public final void _process(){
        if (!isActive) return;


        this.onProcess();
        for (Node node : children) {
            node._process();
        }

    }
    public void onProcess(){

    }

    public void addChild(Node child) {
        children.add(child);
    }

    public void removeChild(Node child) {
        children.remove(child);
    }

    public Vector<Node> getChildren(boolean getInternal) {
        if(!getInternal){
            return children;
        }  else {
            Vector<Node> internalChildren = new Vector<>();
            internalChildren = collectAllChildren(internalChildren);
            return internalChildren;
        }
        

    }

    public Vector<Node> getChildren() {
        return children;
    }


    public boolean hasChildren() {
        return children.size() > 0 ? true : false;
    }

    private Vector<Node> collectAllChildren(Vector<Node> list){
        for (Node node : children) {
            list.add(node);
            if(node.hasChildren()){
                node.collectAllChildren(list);
            } 
        }
        return list;
    }
}