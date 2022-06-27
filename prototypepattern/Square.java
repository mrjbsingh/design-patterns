package prototypepattern;

public class Square extends Shape {
    int width;
    int height;
    String description = "this is a square";
    Square(){
        super(null);
        this.width =0;
        this.height =0;
    }
    Square(Square target){
        super(target);
        if(target!= null){
            this.width = target.width;
            this.height = target.height;
        }
    }
    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public String displayName() {
        return this.description;
    }
}
