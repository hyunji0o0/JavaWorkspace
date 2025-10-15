/*public class MyException extends Exception {
    public MyException() {
        super("I made my own Exception");
    }
}*/

//이건 현진언니ㅏㄱ 준거
public class MyException extends RuntimeException {
    public MyException() {
        super("I made my own Exception");
    }
}