package p2;

import p1.C1;

public class C3 {
    void aMethod(){
        C1 o = new C1(); //declared as public
        o.x = 0;
        //o.y = 0; //cannot access
        //o.z=0; //
        o.m1();
        o.m2();
        o.m3();
    }
}

//import p1.C1 : p1 -> directory, C1 : class