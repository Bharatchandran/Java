import java.io.*;
class ExceptionHandling4 {
      public static void main(String[] args) throws IOException {
      ExceptionHandling4 eh = new ExceptionHandling4();
      eh.readFile();
    }   

    public void readFile() throws IOException {
        
            BufferedReader br = new BufferedReader(new FileReader(new File("eh2.info")));
            System.out.println(br.readLine());
        
        
    } 
}