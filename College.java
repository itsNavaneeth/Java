class Student{
    String name;
    int age;

    Student(){
        System.out.println("Student object created");
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}


public class College {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "nava";
        s1.age = 21;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}