import java.io.*;
class ExceptionHandling2 {
    public static void main(String[] args) {
      ExceptionHandling2 eh = new ExceptionHandling2();
      eh.readFile();
    }   
    public void readFile(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("eh22.info")));
            System.out.println(br.readLine());
        }
        catch(IOException e) {
            System.out.println(e.getMessage()+"Exception MSG");
        }
    } 
}
