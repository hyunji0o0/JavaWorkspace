package p1;

public class C2 {
    void aMethod(){
        C1 o = new C1();
        o.x = 0;
        o.y = 0;
        // o.z = 0; //private -> Cannot access
        o.m1();
        o.m2();
        //o.m3(); //private -> Cannot access

    }
}
