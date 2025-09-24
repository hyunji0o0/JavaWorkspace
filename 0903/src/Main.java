import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void foo(){ //foo는 멤버 ㅁ세ㅗ드
        System.out.println("Fooo!!");
    }
    //Lesson1 : a class create an instance


    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.println("Hello and welcome!");
        //out -> output stream
        //foo(); //not good way sometimes
        Main myMain = new Main(); //new -> allocate memory from the heap, myMain -> instance
        myMain.foo();
        System.out.println("myMain: " + myMain);

        /*Scanner input = new Scanner(System.in); //in -> input stream
        System.out.print("Eneter number : ");
        Double number1 = input.nextDouble(); //Double
        System.out.println("number1 : " + number1);
        */
        //int/int = int or double

        System.out.println(1/2);
        System.out.println((double)1/2);// 1-double type
        System.out.println((double)(1/2));//(double)(0) = 0.0(double type)



    }
}