package Lec08_ObjectsAndClasses.Circle;

import java.util.Scanner;

public class CircleShape {
    private double radius;
    public CircleShape(){}
    public CircleShape(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return radius*radius*3.14;
    }
    public double calCircumference(){
        return radius*2*3.14;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");radius=sc.nextDouble();
    }
    public void diplayInfo(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+ calculateArea());
        System.out.println("cumference: "+calCircumference());
    }
}
