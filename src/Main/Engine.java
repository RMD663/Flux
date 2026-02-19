package Main;

import CoreRender.RenderFrame;
import CoreRender.RenderPanel;
import Nodes.NodeServer;

public class Engine {

    private NodeServer nodeServer;
    private RenderFrame renderFrame;
    private RenderPanel renderPanel;

    public Engine(){
        nodeServer = new NodeServer();
        renderFrame = new RenderFrame("Main", 1280, 720);
        renderPanel = renderFrame.getRenderPanel();
    }

    public void _init(){
    }

    public void _process(){

    }

    public void _draw(){

    }

    public void init(){

    }

    public void process(){

    }

    public void render(){

    }

    public void exit(){

    }

}
