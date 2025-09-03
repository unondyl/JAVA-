package Shape;

public class Point extends Shape{
    protected int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draw(){
        System.out.println("("+x+","+y+")");
    }
}
