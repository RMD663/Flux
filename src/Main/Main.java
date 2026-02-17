package Main;
import CoreRender.RenderFrame;
import CoreRender.RenderPanel;
import Nodes.Node;
import Nodes.NodeServer;
import Nodes.RectNode;
import Nodes.TranslationNode;
import RenderServer.DrawQuery;
import RenderServer.FluxColor;
import Utils.Vector2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        RenderFrame rf = new RenderFrame("Main", 1280, 720);

        NodeServer ns = new NodeServer();
        Node root =  new Node();
        
        TranslationNode trs = new TranslationNode(new Vector2());

        root.addChild(trs);

        ns.addToTree(root);

        RectNode sqr = new RectNode(new Vector2(100, 100), new Vector2(20, 20));
        root.addChild(sqr);

        RenderPanel rp = rf.getRenderPanel();
        rp._init();

        ArrayList<DrawQuery> dqs = new ArrayList<>();

        for(byte i = 0; i < 100; i++){
            int scale = (int)(Math.random() * 100f);
            DrawQuery dq = new DrawQuery(
                    new Vector2((int)(Math.random() * rf.getWidth()), (int)(Math.random() * rf.getHeight())),
                    new Vector2(scale, scale),
                    0
            );
            dq.color = FluxColor.randomColor();
            rp.draw(dq);
        }



        while (true) {
            rp.render();
            ns.processTree();
            Thread.sleep(16);
        }
    }
}
