package JSO.Com.Communicate;

import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox.Pack;
import JSO.Com.DataBox.SettingPack;
import JSO.Com.DataBox_cutom.FileManipulat;
import com.google.gson.Gson;
//import display1.Display_Frame;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.instrument.Instrumentation;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author parham
 */
public class Server implements Runnable {
public class ObjectSizeFetcher {
    private  Instrumentation instrumentation;

    public  void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public  long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}
    private ServerSocket listener;
    private final ArrayList<Socket> sockets;
    public static final int PORT = 9710;
    boolean serverFREE;
    SettingPack settingPack;
    boolean writesocket1_0_SendDirectly;
//    Display_Frame display_Frame;

    public Server() {
        sockets = new ArrayList<Socket>();
        writesocket1_0_SendDirectly = true;
        serverFREE = false;
    }

    public boolean isWritesocket1_0_SendDirectly() {
        return writesocket1_0_SendDirectly;
    }

    public void setWritesocket1_0_SendDirectly(boolean writesocket1_0_SendDirectly) {
        this.writesocket1_0_SendDirectly = writesocket1_0_SendDirectly;
    }
//
//    public Display_Frame getDisplay_Frame() {
//        return display_Frame;
//    }
//
//    public void setDisplay_Frame(Display_Frame display_Frame) {
//        this.display_Frame = display_Frame;
//    }

    public boolean isServerFREEe() {
        return serverFREE;
    }

    public void setServerFREEe(boolean serverFREE) {
        this.serverFREE = serverFREE;
    }

    public boolean open() {
        try {
            listener = new ServerSocket(PORT);
            while (true) {
                try {
                    long t = new Date().getTime();
                    Socket socket = listener.accept();

                    sockets.add(socket);
                    System.out.println("after ACCEPT sockets=" + sockets.size() + "    TIME:" + (new Date().getTime() - t));
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void close() {
        try {
            listener.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    boolean writepackFree = true;
      public void SendControolPack(ControolPack controolPack) {

        if (serverFREE) {
            writeSocket(new Pack(controolPack));
            if (writepackFree) {
                writepackFree = false;
                controolPack.clearLists();
//                saveDatabase();
                writepackFree = true;
            }
        }

//        }
    }

    public void writeSocket_old(Pack pack) {
        //   Instrumentation instrumentation ;
        if (writesocket1_0_SendDirectly) {
            if (serverFREE) {
                serverFREE = false;
                long t = new Date().getTime();
                for (Socket socket : sockets) {

                    try {
                        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                        out.writeObject(pack);
                        out.flush();
                        
                        System.out.println("write socket at :" + (new Date().getTime()));//+"\t size="+ new ObjectSizeFetcher().getObjectSize(pack)));
                    } catch (IOException ex) {

                        sockets.remove(socket);
                        System.out.println("after remove sockets=" + sockets.size() + "    TIME:" + (new Date().getTime()));
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

                        try {
                            socket.close();
                        } catch (IOException ex1) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex1);
                        }

                    }
                }
                serverFREE = true;
            }
           serverFREE = true;
        } else {
            if (serverFREE) {
                serverFREE = false;
//                if (pack.getObject() instanceof ControolPack) {
//                    System.out.println("pack displayer=" + ((ControolPack) pack.getObject()).getDatapacMovie().size());
//                }
//            updatethread tt = new updatethread(display_Frame, pack);
//            tt.start();

//                display_Frame.updatePack(pack);
                serverFREE = true;
            }

        }
    }
    
    public void writeSocket(Pack pack) {
        Gson gson = new Gson();
        String rrrr = gson.toJson(pack);
        writeSocket(rrrr);     
//        new FileManipulat().saveString("s:\\test.json", rrrr);
    }

    @Override
    public void run() {
        open();
    }


    public SettingPack getSettingPack() {
        return settingPack;
    }

    public void setSettingPack(SettingPack settingPack) {
        this.settingPack = settingPack;
    }

      public void writeSocket(String st) {
        if (serverFREE) {
            serverFREE = false;
            long t = new Date().getTime();
            if(sockets.size()>0)
            for (Socket socket : sockets) {
int bufferSize = 16384;
                try {
                    OutputStream out = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                    BufferedWriter bw = new BufferedWriter(osw,bufferSize);
                   
                    bw.write(st);
//                    System.out.println("Message sent to the client is " + st);
                    bw.flush();
                    System.out.println("write socket at :" + (new Date().getTime()%10000+"\tst len="+st.length()));
                } catch (IOException ex) {

                    sockets.remove(socket);
                    System.out.println("after remove sockets=" + sockets.size() + "    TIME:" + (new Date().getTime()));
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

                    try {
                        socket.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex1);
                    }

                }
            }
            serverFREE = true;
        }
        serverFREE = true;
    }


}
