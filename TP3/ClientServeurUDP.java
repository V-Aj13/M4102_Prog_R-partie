import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientServeurUDP {
    public static void main(String[] args) {
        DatagramSocket socket;
        InetAddress adresseIPCorrespondant;
        int port;

        public ClientServeurUDP(String adresseDest, int portDest)
        throws IOException {...}
        public ClientServeurUDP(int portEcoute)
        throws IOException {...}

        public void envoyerMessage(String mesg) throws IOExceptoion
        public String recevoirMessage() throws IOException
        public String getAdresseIPCorrespondant(...)
    }
}
