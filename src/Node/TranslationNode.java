import Utils.Vector2;

package Node;
public class TranslationNode extends Node {
    public Vector2 globalPosition;

    TranslationNode(Vector2 position){
        super();
        this.globalPosition = position;
    }

    public Vector2 getPosition(){
        return this.globalPosition;
    }
}
