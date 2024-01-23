import java.net.*;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        // URL u = new URL("http://www.thearjun.tech:80/index.htm");
        URI obj = new URI("www.cosmoscollege.com");
        System.out.println(obj.getPath());
        // System.out.println("Protocol : " + obj.getP());
        System.out.println("Hostname : " + obj.getHost());
        System.out.println("Port : " + obj.getPort());
        // System.out.println("File Hosted : " + obj.getFile());
        // System.out.println("External Form : " + obj.toExternalForm());
    }
}
