//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class A{
    int i;
    static int numberofA = 0;
    A(){
        numberofA++;
    }
    public void displayA(){
        System.out.println("numberA: " + numberofA);
    }
}
public class Main {
    int i = 5;
    static int k = 2;
    public void m1(){ }

    public static  void printRecursive(int n){
        if(n>10){
            return;
        }
        //System.out.println(n);
        printRecursive(n+1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //int j=1;
        //k=10;
        //m1();
        //printRecursive(0);
        Main a = new Main();
        int j = a.i;
        a.m1();
        A myA1 = new A();
        myA1.displayA();
        A myA2 = new A();
        myA2.displayA();
    }
    public void m1(){
        i += m2(i, k) + k;
    }
    public static void m2(int i, int j){
        return 0;
    }
}