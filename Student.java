package Lec08_ObjectsAndClasses.BasicStudentClass;

public class Student {
    private String studentId;
    private String fullName;
    private String major;
    Student(String studentId , String fullName,String major){
        this.studentId=studentId;
        this.fullName=fullName;
        this.major=major;
    }
    public void displayInfo(){
        System.out.println(studentId+" - "+fullName+" - "+ major);
    }
}
