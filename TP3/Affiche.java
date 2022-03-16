import java.net.InetAddress;
import java.net.UnknownHostException;

 
public class Affiche {

 
 
    public static void main(String[] args) {
 
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Add IP: " + ip);
            System.out.println("Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
    }
}