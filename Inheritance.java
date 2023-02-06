import java.utils.*;
import bank;

class Shape{
    String color;
    public void area(){
        System.out.println("Prints area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of triangle: " + (l*h)/2);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l){
        System.out.println("Area of equilateral triangle: " + (l*l*Math.sqrt(3))/4);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of circle: " + (Math.PI*r*r));
    }
}

public class Inheritance{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
        t1.area(5, 10);
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area(5);
        Circle c1 = new Circle();
        c1.area(5);

        // packages
        bank.Account account1 = new bank.Account();
        account1.name = "customer1";
    }
}