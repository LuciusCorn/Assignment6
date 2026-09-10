package Lec08_ObjectsAndClasses.RectangleAnObject;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){}
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter width: ");
        width=sc.nextDouble();
    }
    public double getArea(){
        return length*width;
    }
    public double getParimeter(){
        return (length+width)*2;
    }
    public void display(){
        System.out.println("Length: "+ length+"-Width: "+width);
        System.out.println("Area: "+getArea());
        System.out.println("Parimeter: "+ getParimeter());
    }
}
