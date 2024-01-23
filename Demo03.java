import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo03 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress a = InetAddress.getLocalHost();
        System.out.println("Address:" + a);

        a=InetAddress.getByName("www.google.com");
        System.out.println("Address:" + a);


        InetAddress[] ad = InetAddress.getAllByName("www.google.com");
        for(int i=0; i < ad.length; i++){
            System.out.println("Address:" + (i+1) +":" + ad[i]);
        }

        System.out.println("Host Name:" + a.getHostName());
        System.out.println("Host Address:" + a.getHostAddress());
    }
}
