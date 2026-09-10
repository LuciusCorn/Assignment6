package Lec08_ObjectsAndClasses.BasicBook;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book(){}
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title, author, price: "); 
        title=sc.nextLine();author=sc.nextLine();price=sc.nextDouble();
    }
    public void displayInfo(){
        System.out.println(title+" | "+ author+" | "+ price);
    }
}
