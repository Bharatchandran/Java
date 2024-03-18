import java.io.*;
class ExceptionHandling3 {
    public static void main(String[] args) {
      ExceptionHandling3 eh = new ExceptionHandling3();
      eh.m1();
    }   

    public void m1(){
        m2();
    }

    public void m2(){
        try{
            readFile();
        } catch(IOException e) {
            System.out.println(e.getMessage()+"Exception MSG");
        }
    }


    public void readFile() throws IOException {
        
            BufferedReader br = new BufferedReader(new FileReader(new File("eh2.info")));
            System.out.println(br.readLine());
        
        
    } 
}