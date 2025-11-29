package questions;

public abstract class Shape {
    String type;

    public Shape(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public abstract void draw();
}
