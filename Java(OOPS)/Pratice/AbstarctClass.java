abstract class Shape{
    int color;
    int getcolor(){
        return color;
    }
    Shape (int c){
        color=c;
    }
    abstract double getArea();
}

class Square extends Shape{
    double side;
    Square(int c,double side){
        super(c);
        this.side=side;
    }
    double getArea(){
        return side*side;
    }
}

public class AbstarctClass {
    public static void main(String[] args) {
        Shape s=new Square(5, 10.0);
        System.out.println(s.getArea());
    }
}
