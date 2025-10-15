class A {
    public int x = 10;
    public void foo() {
        System.out.println("foo: " + x);
    }
}

class Aa extends A {
    public int x = 100;
    public void bar() {
        System.out.println("bar: " + x);
    }
}

class Aaa extends Aa {
    public int x = 1000;
    public void haha() {
        System.out.println("haha: " + x);
        System.out.print("Aaa -> ");
        super.bar();
    }
}

class B {
    public int x = 3000;
    public void Baba() {
        System.out.println("baba: " + x);
    }
}

public class Main {
    public static void main(String[] args) {

        //B b = new Aaa(); // Error => B type = Aaa type
        //B b = (B)new Aaa(); // B type <- Aaa type (Unrelated type)

        // Aaa a = new Object();  // Error Aaa type = Object type

        // Run-time erroe
        // Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.Object cannot be cast to class Aaa (java.lang.Object is in module java.base of
        // loader 'bootstrap'; Aaa is in unnamed module of loader 'app')
        //  at Main.main(Main.java:27)
        // Aaa a = (Aaa) new Object();

        Object o = new Aaa(); // This is OK
        // o.foo();  // o type is Aaa but o cannot access foo()
        ((Aaa) o).foo(); // o type is Aaa thus it is OK to access foo()
        ((Aaa) o).bar();
        ((Aaa) o).haha();

        /*
            {Output]
            foo: 10
            bar: 100
            haha: 1000
            bar: 100
         */

        /* In this case,
         class Aaa extends Aa {
            public void haha() {
                 System.out.println("haha: " + x);
                  super.bar();

        Object o = new Aaa(); // This is OK
        // o.foo();  // o type is Aaa but o cannot access foo()
        ((Aaa)o).foo();
        ((Aaa)o).bar();
        ((Aaa)o).haha();

         [Output]
            foo: 10
            bar: 100
            haha: 100
            bar: 100
         */

        // (Aaa)o.foo(); This is error => (Aaa)o.foo() is the same as (Aaa)(o.foo()) => (Aaa)Return_Value

        // Polymorphism and Dynamic Bindin
        Display(new B());
        Display(new A());
        Display(new Aa());
        Display(new Aaa());

        // Display2(new B()); // Error Why?
        Display2(new A());
        Display2(new Aa());
        Display2(new Aaa());

    }

    public static void Display(Object o) {
        /*
        if (o instanceof B) {
            ((B) o).Baba();
        } else if (o instanceof A) {
            ((A) o).foo();
        } else if (o instanceof Aa) {
            ((Aa) o).bar();
        } else if (o instanceof Aaa) {
            ((Aaa) o).haha();
        }

        [Weird Outcomes]
            baba: 3000
            foo: 10
            foo: 10
            foo: 10
         */
        System.out.print("Display: ");
        if (o instanceof B) {
            ((B) o).Baba();
        } else if (o instanceof Aaa) {
            ((Aaa) o).haha();
        } else if (o instanceof Aa) {
            ((Aa) o).bar();
        } else if (o instanceof A) {
            ((A) o).foo();
        }

        /*
            [Output]
            Display: baba: 3000
            Display: foo: 10
            Display: bar: 100
            Display: haha: 1000
            Aaa -> bar: 100
         */
    }

    public static void Display2(A o) {
        /*
        if (o instanceof B) {
            ((B) o).Baba();
        } else if (o instanceof A) {
            ((A) o).foo();
        } else if (o instanceof Aa) {
            ((Aa) o).bar();
        } else if (o instanceof Aaa) {
            ((Aaa) o).haha();
        }

        [Weird Outcomes]
            baba: 3000
            foo: 10
            foo: 10
            foo: 10
         */
        System.out.print("Display2: ");
        /*
        if (o instanceof B) {
            ((B) o).Baba();
        }
        */   // Error
        if (o instanceof Aaa) {
            ((Aaa) o).haha();
        } else if (o instanceof Aa) {
            ((Aa) o).bar();
        } else if (o instanceof A) {
            ((A) o).foo();
        }

        /*
            [Output]
            Display: baba: 3000
            Display: foo: 10
            Display: bar: 100
            Display: haha: 1000
            Aaa -> bar: 100
         */
    }
}