package Shape;

abstract  class Shape{
    protected int x,y;
    abstract public void draw();
    abstract public void erase();
    public void move(int x,int y){
        this.x=x;
        this.y=y;
        erase();
        draw();
    }
}
