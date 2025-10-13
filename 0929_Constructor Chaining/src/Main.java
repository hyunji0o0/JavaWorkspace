class A {
    public void foo() {
        System.out.println("A");
    }
    public String toString(){
        return "Haha";
    }

}
class subA extends A {
    public void foo() {
        System.out.println("subA2");
    }
}

class subA2 extends A {
    public void foo() {
        System.out.println("subA2");
    }
}

public class Main extends A {
    public static void main(String[] args) {
        displayObject(new subA());
        displayObject(new subA2());
        Object o = new A();
        System.out.println(o.toString());//type cast -> object

    }
    public static void displayObject(A myA){
        System.out.println(myA);
    };
    public void foo() {
        super.foo();
    }

}