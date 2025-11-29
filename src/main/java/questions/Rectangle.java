package questions;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void draw(){
        System.out.println("Drew rectangle");
    }

}
