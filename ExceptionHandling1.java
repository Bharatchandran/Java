import java.util.Scanner;
class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Open File");
        System.out.println("Operation to divide two numbers");
        
        try{
            System.out.println("Enter first number");
            int x = sc.nextInt();
            System.out.println("Enter second number");
            int y = sc.nextInt();
            System.out.println(x + " / " + y + " = " + x/y );
            int b[] = {10, 20, 30};
            b[50] = 100;
        } 
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occured :" +e.getMessage());
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Close File");
            sc.close();
        }

    }    
}
