package Lec08_ObjectsAndClasses.BasicStudentClass;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        String studentId = sc.nextLine();
        System.out.print("Enter name: ");
        String fullName= sc.nextLine();
        System.out.print("Enter major: ");
        String major= sc.nextLine();
        Student s1 = new Student(studentId, fullName, major);
        Student s2 = new Student("S002", "Lucius","SE");
        s1.displayInfo();
        s2.displayInfo();
    }
}
