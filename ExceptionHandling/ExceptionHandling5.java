import java.io.*;
class ExceptionHandling5 {
    public static void main(String[] args) {
      ExceptionHandling5 eh = new ExceptionHandling5();
      eh.m2();
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
	        throw new IOException("File not found123");
            
        
        
    } 
}