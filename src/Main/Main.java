package Main;
import Nodes.Node;
import Nodes.NodeServer;
import Nodes.RectNode;
import Nodes.TranslationNode;
import Utils.Vector2;

public class Main {
    public static void main(String[] args) throws Exception {

        NodeServer ns = new NodeServer();
        Node root =  new Node();
        
        TranslationNode trs = new TranslationNode(new Vector2());

        root.addChild(trs);

        ns.addToTree(root);

        RectNode sqr = new RectNode(new Vector2(100, 100), new Vector2(20, 20));
        root.addChild(sqr);
        
        while (true) {
            ns.processTree();     
            Thread.sleep(16);
        }
    }
}
