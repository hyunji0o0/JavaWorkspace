import java.math.BigInteger;

class Student {
    private Course[] courseList;
    public void addCourse(Course s) {}
}
class Faculty {
    Course[] courseList;

    public void addCourse(Course c) {

    }
}
class Course {
    Student[] classList;
    Faculty faculty;

    public void addStudent(Student s) {

    }
    public void setFaculty(Faculty f) {

    }
}
class Name { //aggregated class

}
class Address {
    Stud[] studList;
}
class Stud { //aggregating class
    Name name;
    Address addres;
}

class Person {
    Person[] supervisor;
}

//student -> course -> faculty, faculty has a Course, Course has a Student, Student has a course
//aggregate, ownership : 집합 관게 공부하기
public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("11", 2)); //parseInt type -> static
        Double doubleObjects = Double.valueOf("12.4"); //value of -> static method
        System.out.println(doubleObjects);
        //Integer intObject = new Integer(2);
        Integer intObject = 2; //Integer type -> class, 2 type -> integer, type mismatch ok, why? -> automatically convert
        //int a = 2354564897851;
        BigInteger a = new BigInteger("1231456486555665");
        System.out.println(a);

    }
}