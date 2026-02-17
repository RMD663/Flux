package Utils;
public class Vector2 {
    public int x, y;

    public static Vector2 ZERO = new Vector2(0, 0);

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    Vector2(int value){
        this.x = value;
        this.y = value;
    }

    public Vector2(){
        this.x = 0;
        this.y = 0;
    }

    static Vector2 sum(Vector2 vec1, Vector2 vec2){
        Vector2 result = new Vector2();
        result.x = vec1.x + vec2.x;
        result.y = vec1.y + vec2.y;
        return result;
    }
    
    static Vector2 sub(Vector2 vec1, Vector2 vec2){
        Vector2 result = new Vector2();
        result.x = vec1.x - vec2.x;
        result.y = vec1.y - vec2.y;
        return result;
    }

    public Vector2 getDistanceTo(Vector2 vectorTo){
        return sub(this, vectorTo);
    }
}
