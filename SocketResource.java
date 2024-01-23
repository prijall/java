import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketResource {
    public static void main(String[] args) throws Exception {
        int c;

        try(Socket s = new Socket("www.google.com", 44)){
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            String st = (args.length==0? "github.com" :args[0]) + '\n';
            byte b[]=st.getBytes();
            out.write(b);
            while((c= in.read())!=-1){
                     System.out.println((char)c);
            }
        }
    }
}
