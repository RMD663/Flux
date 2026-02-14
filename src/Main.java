public class Main {
    public static void main(String[] args) throws Exception {

        RenderFrame rf = new RenderFrame("Main", 1280, 720);

        NodeServer ns = new NodeServer();

        Node root =  new Node();
        
        Node child1 = new Node();
        Node child2 = new Node();
        Node child3 = new Node();
        
        Node sub_child1 = new Node();
        Node sub_child2 = new Node();
        Node sub_child3 = new Node();

        Node deep_sub_child1 = new Node();
        Node deep_sub_child2 = new Node();
        Node deep_sub_child3 = new Node();


        Node deep_sub_sub_child1 = new Node();
        Node deep_sub_sub_child2 = new Node();
        Node deep_sub_sub_child3 = new Node();

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        child1.addChild(sub_child1);
        child2.addChild(sub_child2);
        child3.addChild(sub_child3);

        sub_child1.addChild(deep_sub_child1);
        sub_child2.addChild(deep_sub_child2);
        sub_child3.addChild(deep_sub_child3);

        deep_sub_child1.addChild(deep_sub_sub_child1);
        deep_sub_child2.addChild(deep_sub_sub_child2);
        deep_sub_child3.addChild(deep_sub_sub_child3);

        ns.addToTree(root);

        Rect sqr = new Rect(100, 100, 20, 20);
        rf.rp.addShape(sqr);

        while (true) {
            sqr.position.x += 1;
            ns.processTree();
            rf.rp.repaint();
            Thread.sleep(16);
        }


    }
}
