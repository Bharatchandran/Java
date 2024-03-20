import java.io.*;
class ExceptionHandling2 {
    public static void main(String[] args) {
      ExceptionHandling2 eh = new ExceptionHandling2();
      eh.readFile();
    }   
    public void readFile(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File("eh2.txt")));
            System.out.println(br.readLine());
        }
        catch(IOException e) {
            System.out.println(e.getMessage()+"Exception MSG");
        }
        finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finaly Block Called!");
        }
    } 
}


