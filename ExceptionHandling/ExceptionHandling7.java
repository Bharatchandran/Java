

public class ExceptionHandling7 {
    public static void main(String[] args) {
        try {
            ExceptionHandling7 ex = new ExceptionHandling7();
            ex.m1();
            
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in m1 " );
        }
    }

    public void m1(){
        int x = 20;
        try {
            System.out.println(x/0);
        } catch (Exception e) {
            System.out.println("Exception occured " + e.getMessage());
            System.out.println("Exception caught in m1 " );
            System.out.println("Rethrowing exception");
            throw e;
            
        }
    }
}
