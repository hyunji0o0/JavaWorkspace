class GrandParent {
    @Override
    public String toString() {
        return String.format(
                "Class Name: %s, hashCode(): %d, identityHashCode(): %d",
                this.getClass().getName(),
                this.hashCode(), //each instance, this method can be overriden
                System.identityHashCode(this) //never change
        );
    }
}
//GP <- isa - P M <- isa - Child 이 화살표 방향으로 we can convert typecast


class Parent extends GrandParent {
    private int parentId = 10;

    @Override
    public int hashCode() {
        return parentId * 10; // Parent  hash
    }
}


class Child extends Parent {
    private int childId = 7;

    @Override
    public int hashCode() {
        return childId * 100; // Child  hash
    }
}

class Brother extends Parent {
    public void foo() {
        System.out.println("Brother foo()!!");
    }
}
public class Main {
    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        Parent p = new Parent();
        Child c = new Child();

        GrandParent gpRefToParent = new Parent();
        GrandParent gpRefToChild = new Child();
        Parent pRefToChild = new Child();

        // Exception in thread "main" java.lang.ClassCastException:
        // class Parent cannot be cast to class Child (Parent and Child are in unnamed module of loader 'app')
        // Child d = (Child) new Parent();

        // Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.Object cannot be cast to class Child (java.lang.Object is in module java.base of loader 'bootstrap'; Child is in unnamed module of loader 'app')
        // at Main.main(Main.java:54)
        //Object o = new Object();
        //Child d = (Child) o;

        // java: incompatible types: Parent cannot be converted to Brother
        //Brother b = new Parent();

        // Exception in thread "main" java.lang.ClassCastException:
        // class Parent cannot be cast to class Brother (Parent and Brother are in unnamed module of loader 'app')
        // Brother b = (Brother) new Parent();

        Parent p1 = (Brother) new Brother();
        // p1.foo(); // Cannot acess

        Parent p2 = (Parent) new Brother();
        // p2.foo(); // Cannot acess

        Brother bb = (Brother)p1;;
        bb.foo(); // This is OK

        System.out.println("=== Brother p1 ===");
        System.out.println(p1);

        System.out.println("=== Brother bb ===");
        System.out.println(bb);

        System.out.println("=== Brother p2 ===");
        System.out.println(p2);

        System.out.println("=== GrandParent ===");
        System.out.println(gp);

        System.out.println("=== Parent p ===");
        System.out.println(p);

        System.out.println("=== Child c ===");
        System.out.println(c);

        System.out.println("=== GrandParent gp ===");
        System.out.println(gpRefToParent);

        System.out.println("=== GrandParent==");
        System.out.println(gpRefToChild);

        System.out.println("=== Parent ===");
        System.out.println(pRefToChild);
    }
}