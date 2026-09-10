package Lec08_ObjectsAndClasses.Coordinate;

import java.util.Scanner;

public class PointCoordinate {
    private double x;
    private double y;
    public PointCoordinate(){}
    public PointCoordinate(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x, y: ");x=sc.nextDouble();y=sc.nextDouble();
    }
    public double distantFromOrigin(){
        return Math.sqrt(x*x+y*y);
    }
    public void diplayInfo(){
        System.out.println("X: "+x+" y: "+y);
        System.out.println("Distant from Origin: "+ distantFromOrigin());
    }
}
