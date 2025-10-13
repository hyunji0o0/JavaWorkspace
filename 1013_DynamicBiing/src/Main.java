
//Review code test for midterm exam quesiton

class A {
    public int x;
    A(){
        x=10;
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "person";
    }
}

class Student extends Person{
    public int a = 10;
    @Override
    public String toString(){
        return "Student";
    }
    public void foo(){
        a =a+1;
    }
}

class GraduateStudent extends Student {

}
/*
class Aa extends A {
    //public int x;
    Aa() {
        //x=100;
    }
    public void print() {
        System.out.println("x: " + x);
    }
}

class Aaa extends Aa {
    Aaa() {
        //x = 200;
        //super.print();
    }
    public void print() {
        System.out.println("Haha");
        super.print();
    }
}
/*
 */
//A=10 -> copy value Aa = 100 -> copy value Aaa = 200
public class Main {
    public static void main(String[] args) {
        m(new Object());
        Object o = new Student();

        /*
        Aaa myAaa = new Aaa();
        System.out.println("Aaa.x: " + myAaa.x);
        myAaa.print();

        Aa o = new Aaa();
        o.print();
        System.out.println(o);
         */
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());

    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}