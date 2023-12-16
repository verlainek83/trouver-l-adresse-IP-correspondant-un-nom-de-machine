import java.net.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        if (args.length == 0) {
            System.err.println("Please provide a hostname as a command-line argument.");
            return;
        }
        InetAddress adresse;
        try {
            adresse = InetAddress.getByName(args[0]);
            System.out.println("Nom: "+ args[0]+", IP: " + adresse.getHostAddress());       
        } catch (UnknownHostException e) {
            System.err.println(args[0]+" est inconnu\n");
        }
      
    }
}
