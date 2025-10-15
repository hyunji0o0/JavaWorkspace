//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static void callDriver() throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Finished");
    }
    static void callException() {
        //Do something wrong.. throw exception
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            callException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*

        try {
            callDriver();
        }catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Cannot find Class");
        }
        */
        //
        // callDriver();
        /*
        String[] name = new String[2];
        try {
            name[0] = "BTS";
            name[1] = "BeNon";
            name[2] = "KeDaHun";
        }

        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("Wrong Index");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Terminated!!!");
        }
    }*/
    }
}