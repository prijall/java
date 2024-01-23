import java.net.*;
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add= InetAddress.getLocalHost();
        System.out.println("Address:" + add);


        add= InetAddress.getByName("www.google.com");
        System.out.println("Address:"+ add);

       // InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
        //for (int i = 0; i < addresses.length; i++) {
          //  System.out.println("Address " + (i + 1) + " : " + addresses[i]);
        //}

        System.out.println("Host Name:" + add.getHostName());
        System.out.println("Host Address :"+ add.getHostAddress());
    }
}
