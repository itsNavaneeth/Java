class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public void printInfo(int age){
        System.out.println("Age: " + age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Polymorphism{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "nava";
        s1.age = 21;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}