public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student(); // creating a Student object called s1
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 45;
        // Student s2 = new Student("Ram"); 
        Student s3 = new Student(20); 

        // System.out.println("Student 1: Name = " + s2.name + ", Age = " + s3.age);

        Student s2= new Student(s1); // creating a Student object s2 by copying s1
        s2.password = "12345"; 
        s1.marks[0] = 100;
        for(int i = 0 ;i < 3; i++){
            System.out.println("Marks of student 2: " + s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int age;
    int roll;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3]; 
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }
     
    Student(){ 
        marks = new int[3]; 
        // System.out.println("Constructor called");  
    }
    Student(String name){
        marks = new int[3]; 
        this.name = name; // 'this' refers to the current object
        System.out.println("Constructor with name called: " + name);
    }
    Student(int age){
        marks = new int[3]; 
        this.age = age;
        System.out.println("Constructor with age called: " + age);
    }
}