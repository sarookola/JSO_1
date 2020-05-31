package JSO.Com.Communicate;

import JSO.Com.DataBox.Pack;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parham
 */
public class Client implements Runnable {

    private Socket socket;
//    private final Display_Frame display_Frame;
    public static final int PORT = 9710;
    String ipCode = "localhost";

    int x;

    public String getSt() {
        return ipCode;
    }

    public void setSt(String st) {
        this.ipCode = st;
    }

    public Client(boolean preview, boolean fulscreen, boolean opac) {
//        display_Frame = new Display_Frame(preview, fulscreen, opac);
    }

    public boolean open() throws IOException {
//        socket = new Socket("localhost", 9090);
        System.out.println("ipcode=" + ipCode);
        socket = new Socket(ipCode, PORT);
        return true;
    }

    public void close() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void read() throws IOException, ClassNotFoundException {
// System.out.print("   read statet");
        Object object;
//                System.out.print("\tObject created");
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

//        System.out.println("\tObject started");
        while (true) {
            long t = new Date().getTime();
                object = input.readObject();
            System.out.print("object read started at=" + (new Date().getTime()));
                if (object instanceof Pack) {
                    System.out.print("\t Pack read  and  ............ ");
//                    updatethread tt = new updatethread(display_Frame, (Pack) object);
//                    tt.start();
//                display_Frame.updatePack((Pack) object);
                    System.out.println("  updated at =" + (new Date().getTime() ));
                    input = new ObjectInputStream(socket.getInputStream());
                }

            }
        
    }
//    int t = 0;

    @Override
    public synchronized void run() {

        while (true) {

            try {
//                System.out.println((t++) + "_ /here is 1=");
                if (socket == null || socket.isBound()) {
//                    System.out.println((t++) + "_ here is 2=");
                    if (open()) {
//                        System.out.println((t++) + "_ here is3=");
                        read();
//                        System.out.println((t++) + "_ here is35=");
                    }
                }

                try {
//                    System.out.println((t++) + "_ here is 4=");
                    wait(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (Exception e) {

                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);

                try {
//                    System.out.println((t++) + "_ here is 5=");
                    wait(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }

//    public Display_Frame getDisplay_Frame() {
//        return display_Frame;
//    }

    public void setIpCode(String ipCode) {
        this.ipCode = ipCode;
    }

//    public static void main(String[] args) {
//        Client c = new Client(true);
//        Thread t = new Thread(c);
//        t.start();
//    }
}
