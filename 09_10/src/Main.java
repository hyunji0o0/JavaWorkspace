import java.util.Arrays;

public class Main {
    public int d;
    public int e;

    public static void main(String[] args) {
        Main myMain = new Main();
        myMain.d = 1;
        myMain.e = 2;
        System.out.println("myMain.d = " + myMain.d);
        System.out.println("myMain.e = " + myMain.e);
        swap2(myMain);
        System.out.println("myMain.d = " + myMain.d);

        int x = 1;
        increment(x);
        System.out.println("[main] x: " + x);
        double[] mylist = new double[10]; // java style
        int myarr[] = new int[10]; //C or C++ style , new : allocate memory from heap, reference = pointer = addr
        double[] mylist2 = {1.9, 2.3, 3.4};
        double[] mylist3 = mylist2;
        System.arraycopy(mylist2, 0, mylist, 0, mylist2.length);
        mylist3[0] = 100.0;


        for(double e: mylist2){
            System.out.println("e: " + e);
        }

        for(int i=0; i<mylist2.length; i++){
            System.out.println("e: " + mylist2[i]);
        }

        int[] myarr2 = {1, 2};
        swap(myarr2);
        System.out.println("myarr2[0]: " + myarr2[0] + "myarr2[1]: " + myarr2[1]);
    }
    public static int max(int num1, int num2) {
        return 0;
    }
    public static int max(int a, int b, int c){
        return 1; //overloading methods
    }
    public static void increment(int n){
        n++;
        System.out.println("[increment] n: " + n);
    }

    public static void swap(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void swap2(Main o) {
        o.d = 3;
    }
}