import java.util.Date;

class A{
    private int id;
    private String Name;
    private java.util.Date dateCreated;

    public A(int ssn, String newName){
        id = ssn;
        Name = newName;
        dateCreated = new java.util.Date();
    }
    public Date getDateCreated(){
        return dateCreated;

    }

}
//private don't provide public method
public class Main {

    public static void main(String[] args) {
        A myA = new A(112233,"John");
        java.util.Date locaDate = myA.getDateCreated();
        locaDate.setTime(2000);
        A[] myAarray = new A[10];
        for(int i = 0; i < myAarray.length; i++){
            myAarray[i] = new A();
        }
    }
}