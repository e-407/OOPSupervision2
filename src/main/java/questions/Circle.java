package questions;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drew circle");
    }

}
