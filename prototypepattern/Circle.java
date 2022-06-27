package prototypepattern;

public class Circle extends Shape {
    int radius;
    String description = "this is a circle";
    public Circle(){                 // this must in concrete sub-class
        super(null);
        this.radius = 0;
    }
    Circle(Circle target){
        super(target);
        if(target!= null){
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String displayName() {
        return this.description;
    }
}
