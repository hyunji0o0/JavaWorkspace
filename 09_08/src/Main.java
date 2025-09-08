import java.util.Scanner;

public class Main {
    public void foo() {
        System.out.println("Fooo!!");
    }

    public static void main(String[] args) {
        System.out.println("Hello java" + " !!" + 12.1234);
        // foo(); // Not a good way sometimes
        Main myMain = new Main();
        myMain.foo();
        System.out.println("myMain: " + myMain);
        //Create a Scanner object
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        Double number1 = input.nextDouble();
        System.out.println("number1: " + number1);
        */

        System.out.println(1/2);
        System.out.println((double)1/2);
        System.out.println((double)(1/2));
        System.out.println(0XFFFF); //hex -> deci
        System.out.println(1.0 / 3.0);
        System.out.println(1.0F / 3.0F);

        long CreditCardNumber = 2324_4545_4519_3415L;
        System.out.println("Credit Card Number: " + CreditCardNumber);
        System.out.println(1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        final double EPSILON = 1E-10;
        double x = 1.0;
        while(true){
            if (Math.abs(x-0.5) < EPSILON)
                break;
            else
                System.out.println("x: " + x);
            x = x - 0.1;
        }
        int number = 11;
        /*
        boolean even;
        if (number%2 == 0)
            even = true;
        else
            even = false;
        System.out.println("even: " + even);
        */
        boolean even = number%2==0; //boolean : true or false
        System.out.println("even: " + even);
        char letter = 'A';
        char letter2 = '\u0041';
        char ch = 'a';
        //System.out.println(ch++);
        //System.out.println(ch+1);
        System.out.println(++ch); //ch(96)++ : operator ++(ch)
        System.out.println(ch+1);
        /*
        operator ++(ch)(96) {
        char temp(96);
        temp(96) = ch(96);
        ch = ch+1; -> 97
        return temp -> 96; }
        */
        int k = '2' + '3';
        System.out.println("k: " + k);
        System.out.println("k: " + (char)k);

        String welcome = "Welcome to java";
        String welcome2 = "Welcome to java";
        if(welcome2 == welcome)
            System.out.println("Same");
        else System.out.println("Different");

        String welcome3 = new String("Welcome to java");
        if(welcome2 == welcome3)
            System.out.println("Same");
        else System.out.println("Different");
        /*
        chr *str = "welcome"; 1) is a constant string(stack segment : R,W, heao:R,W, data segment:R,W, read-only data:R, text segment: R
        2) str[0] = 'A'
        3) char str[10] = "welcom"; -> str[10] is array -> compiler(where? : in stack) -> readable and writable
        */

        String s = welcome + "123";
        System.out.println(s);
        //buffer 관련은 찾아보기
        System.out.println(welcome3.equals(welcome2)); //equals return to ture, compareTo return to 0
        System.out.println(welcome3.compareTo(welcome2));


    }
}