public class Main {
    public static void main(String[] args) throws Exception {

        CoreRender cRender = new CoreRender("main", 1280, 720);
        NodeServer ns = new NodeServer();
        Node root =  new Node();
        
        TranslationNode trs = new TranslationNode(new Vector2());

        root.addChild(trs);

        ns.addToTree(root);

        RectNode sqr = new RectNode(new Vector2(100, 100), new Vector2(20, 20));
        Rect sqr2 = new Rect(100, 100, 100, 100);
        root.addChild(sqr);
        cRender.addDrawableNode(sqr);
        
        while (true) {
            ns.processTree();
            cRender.draw();            
            Thread.sleep(16);
            cRender.clear();
        }


    }
}
