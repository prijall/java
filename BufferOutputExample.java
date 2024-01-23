import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputExample {
    public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("C://prijal.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Prijal is Real hero";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  
    

