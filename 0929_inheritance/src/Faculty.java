import javax.xml.validation.SchemaFactoryLoader;

class Person{
    public Person() {
        System.out.println("(1) Perform person's Tasks");
    }
}
class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3)");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty() {
        System.out.println("(4)");
    }
}