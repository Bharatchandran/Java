class MyException extends Exception{
    MyException(String str) {
        super(str);
    }
}

public class ExceptionHandling6 {
    public static void main(String[] args) {
        int x = 20;
        try {
            if(x > 20 ) {
                System.out.println(x);
            } else if (x == 20) {
                throw new MyException("variable cannot be 20. My Excption thrown");
            }
            
        } catch (MyException me) {
            System.out.println(me.getMessage());
        }
    }
}
