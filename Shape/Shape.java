package Shape;

interface Shape{
    //protected int x,y;

    default void draw() {
        System.out.println("x: ");

    }

    default void erase() {

    }

}
