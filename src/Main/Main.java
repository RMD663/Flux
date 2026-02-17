package Main;
import CoreRender.RenderFrame;
import CoreRender.RenderPanel;
import Nodes.*;
import RenderServer.DrawQuery;
import Utils.Vector2;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        RenderFrame rf = new RenderFrame("Main", 1280, 720);

        NodeServer ns = new NodeServer();
        Node root =  new Node();

        ns.addToTree(root);

        RectNode sqr = new RectNode(new Vector2(100, 100), new Vector2(20, 20));
        root.addChild(sqr);

        RenderPanel rp = rf.getRenderPanel();
        rp._init();

        DrawableNode rect = new DrawableNode(Vector2.ZERO);
        TranslationNode translation = new TranslationNode(new Vector2(200, 200));

        translation.addChild(rect);

        root.addChild(translation);

        while (true) {
            translation.setGlobalPosition(new Vector2(translation.getPosition().x + 1, translation.getPosition().y));
            ns.processDeletionQueue();
            ns.processTree();
            rp.render();
        }
    }
}
