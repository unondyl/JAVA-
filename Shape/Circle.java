package Shape;

class Circle implements Shape{
    int x,y;

    public void draw() {
    }
    public void erase() {

    }
    public void move(int x,int y){
        this.x=x;
        this.y=y;
        erase();
        draw();
    }
}