package ClassAndObject;

public class student {
    String name;
    int age;
    int rollNo;
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
    public static void main(String[] args) {
        student s = new student();
        s.name = "John Doe";
        s.age = 20;
        s.rollNo = 101;
        s.display();
    }
}
