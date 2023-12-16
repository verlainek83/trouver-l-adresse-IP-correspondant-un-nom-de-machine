// import java.net.*;

// public class App {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         if (args.length == 0) {
//             System.err.println("Please provide a hostname as a command-line argument.");
//             return;
//         }
//         InetAddress adresse;
//         try {
//             adresse = InetAddress.getByName(args[0]);
//             System.out.println("Nom: "+ args[0]+", IP: " + adresse.getHostAddress());       
//         } catch (UnknownHostException e) {
//             System.err.println(args[0]+" est inconnu\n");
//         }
      
//     }
// }


// import java.net.*;

// public class App {
//     public static void main(String[] args) {
//         if (args.length == 0) {
//             System.err.println("Veuillez fournir un nom de machine en argument.");
//             return;
//         }

//         String nomMachine = args[0];
//         try {
//             InetAddress adresse = InetAddress.getByName(nomMachine);
//             System.out.println("Nom: " + nomMachine + ", IP: " + adresse.getHostAddress());
//         } catch (UnknownHostException e) {
//             System.err.println(nomMachine + " est inconnu.");
//         }
//     }
// }


import java.net.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nomMachine;

        // Vérifie si un argument est fourni en ligne de commande
        if (args.length > 0) {
            nomMachine = args[0];
        } else {
            try (// Si aucun argument n'est fourni, demandez à l'utilisateur de saisir le nom de la machine
            Scanner scanner = new Scanner(System.in)) {
                System.out.print("Veuillez saisir un nom de machine : ");
                nomMachine = scanner.nextLine();
            }
        }

        try {
            InetAddress adresse = InetAddress.getByName(nomMachine);
            System.out.println("Nom: " + nomMachine + ", IP: " + adresse.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println(nomMachine + " est inconnu.");
        }
    }
}
