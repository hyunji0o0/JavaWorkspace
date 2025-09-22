/*
class classX extends Object{

}
 */
class classX{
    classX(){
        //super(); //automatically called by javac
    }
    public void foo(){
        Object myO = new Object();
        System.out.println("Hello myO!");
    }
}
class DefaultA {

}
class Student {
    String name;
}
class Circle {
    //Member variable
    double radius = 1;
    //Constant
    Circle(){

    }
    //Constructor Overloading
    Circle(double r){
        radius = r;
    }
    //getter and setter method
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double r){
        radius = r;
    }
    public String toString() {
        return super.toString() + "radius" + radius;
    }
}

public class Main {
    class innerClass{

    }
    public static void main(String[] args) {
        System.out.println("hello and welcome!");
        DefaultA myDefaultA = new DefaultA();
        publicC myC = new publicC();
        Circle SimpleCircle = new Circle();
        SimpleCircle.setRadius(5);
        System.out.println("Area: " + SimpleCircle.getArea());
        Student Tom = new Student();
        System.out.println("Tom name: " + Tom.name);
        int x = 0;
        String y = new String("AAA"); //y="AAA", y= new String("AAA")
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Tome: " + Tom);
        System.out.println("Area is: " + new Circle(10).getArea());
        System.out.println("Circle: " + SimpleCircle.toString());
        System.out.println("Circle: " + SimpleCircle);


    }
}