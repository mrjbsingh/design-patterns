package prototypepattern;

public abstract class Shape {
    int x;
    int y;
    Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
        }
    }
    public abstract Shape clone();
    public abstract String displayName();
}
