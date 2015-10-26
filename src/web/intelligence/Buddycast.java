package web.intelligence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Puranjay
 */
public class Buddycast {

    //Maintaining local information
    static ArrayList<Peer> Peer = new ArrayList<>();
    static int N = 30, X = 16 //peers which can be visited
            , K = 5;//recently visited peers

    //initialize peers
    static void init_peers() {
        // The name of the file to open.
        ArrayList<String> data = new FileOperations().ReadFile("C:\\Users\\Puranjay\\Documents\\Web Intelligence\\src\\users.dat");
        //line is a user's data
        for (String i : data) {
            Peer.add(new Peer(Peer.size() + 1));
            //init random cache
            init_cache(Peer.get(Peer.size() - 1), data.size());
        }
        System.out.println(Peer.get(1).getRandomCache().toArray());
    }

    //init random cache items of size 'N'
    static void init_cache(Peer Peer, int data) {
        for (int i = 1; i <= X; i++) {
            // TODO PLEASE ADD A CHECK HERE TO SEE IF X IS Peer's id 
            int x = ThreadLocalRandom.current().nextInt(1, data + 1);
            Peer.RandomCache.add(x);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        init_peers();
    }
}
