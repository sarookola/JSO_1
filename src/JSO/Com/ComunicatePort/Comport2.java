package JSO.Com.ComunicatePort;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.fazecast.jSerialComm.SerialPortPacketListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shayan
 */
public class Comport2 implements Runnable, SerialPortPacketListener {

    SerialPort comPort;
    Thread readThread;
    ComunicatePortI viewer;
    String path = "seting\\LightTable.json";
    int comnumber;
  //  ControllInterFace controllInterFace;
    boolean active;
//    LightBox lightBox;
//    boolean Belldisbale[];
    InputStream inputStream;
    OutputStream outputStream;

   public Comport2(ComunicatePortI aThis) {
        viewer = aThis;
        init2();

    }
  

     
    public void init2() {
        SerialPort comPort1[] = SerialPort.getCommPorts();
        

        init3data();
//        comPort =SerialPort.getCommPort("portId1(" + portId1.getName().toString() + ")");
        for (SerialPort serialPort : comPort1) {
            System.out.println("serialPort=" + serialPort.getDescriptivePortName() + "    spn=" + serialPort.getSystemPortName());
        }
                comPort = comPort1[0];
        comPort.openPort();
//         PacketListener listener = new PacketListener();
        comPort.addDataListener(this);
//        comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
        inputStream = comPort.getInputStream();
        outputStream = comPort.getOutputStream();
        readThread = new Thread(this);
        readThread.start();
        
//         Belldisbale = new boolean[4];
//        for (int i = 0; i < 4; i++) {
//            Belldisbale[i] = true;
//        }

    }

    void init3data() {
//        lightBox = new FileManipulat().loadLightBox(path);
//        comnumber =  lightBox.getPort();
    //    viewer.setlightS(lightBox.getLs());
    }

//    private int[] setlights(String[] st1) {
//        int x[] = {0, 0, 0, 0};
//        if (st1.length == 4) {
//            for (int i = 0; i < 4; i++) {
//                x[i] = Integer.parseInt(st1[i]);
//            }
//        }
//        return x;
//    }
//
//    void sendlight(int[] lightsValue) {
//        comwritebyte((char) 'c');
//        for (int m : lightsValue) {
//            comwritebyte((char) m);
//        }
//    }
//
//    void savelighttable(int[][] lightsValue) {
//        lightBox.setLs(lightsValue);
//        new FileManipulat().saveObject(path, lightBox);
//    }
//
//
//    public void selectLightMap(int selector) {
//        viewer.selectLightMap(selector);
//    }
//
//    public boolean getBelldisbale(int index) {
//        return Belldisbale[index];
//    }
//
//    public void setBelldisbale(int index, boolean Belldisbale) {
//        this.Belldisbale[index] = Belldisbale;
//    }

    @Override
//    public void serialEvent(SerialPortEvent spe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
// @Override
    public void serialEvent(SerialPortEvent event) {
//        System.out.println("start");
        byte[] newData = event.getReceivedData();
//      System.out.println("Received data of size: " + newData.length);

//         StringBuffer readBuffer = new StringBuffer();
        int c = 0;

//                try {
//                      while(inputStream.available()>0)
//                    c = inputStream.read();
//                    viewer.setRecievedText(String.valueOf(c));
//                    if (active && (c == 1 || c == 2 || c == 4 || c == 8)) {
//                     checkREcieved(c);
//                    }
//                    while (inputStream.available() > 0) {
//                        c = inputStream.read();
//                    }
//c= newData[newData.length-1];
        for (int i = 0; i < newData.length; i++) {
            c = newData[i];  
            viewer.Recieve(c);
//            System.out.print(c + "\t next:" + String.valueOf(c));
        }
//        System.out.println("");
//        c=c+1;
  //    viewer.setRecievedText(String.valueOf(c));

//        if (active && (c == 1 || c == 2 || c == 4 || c == 8)) {
////            System.out.println("970111-here");
//            checkREcieved(c);
//        }

    }



    enum KeyState {

        three, faster, mobileRamz, mobileText, demo
    };
    KeyState state;


    public void Recieve(int c) {
      //  viewer.setSendField("" + c);
//        active = true;
//        comwritebyte( (char) c);
   comwritebyte((char) c);
    }


    public void Recieve(String st) {
        comwrite(st);
    }

    void comwritebyte(char c) {
        try {
            outputStream.write( c);
            outputStream.flush();
        } catch (IOException ex) {
            Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void comwrite(String c) {

        try {
            for (int i = 0; i < c.length(); i++) {
                char x = c.charAt(i);
                outputStream.write( x);

            }
            outputStream.flush();
//            viewer.setSendField(c);
        } catch (IOException ex) {
            try {
                Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
                outputStream.close();
            } catch (IOException ex1) {
                Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    @Override
    public void run() {
        try {
            readThread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (comPort.isOpen()) {
//            if (!comPort.isOpen()) {
//                System.out.println("980111 -   comport is closwed");
//            }
        }
        JOptionPane.showMessageDialog(null,"برد قطع است");
        init2();
    }

//    public void setControllInterFace(ControllInterFace controllInterFace) {
//        this.controllInterFace = controllInterFace;
//    }

//    protected void checkREcieved(int c) {
//
//        if (active && (c == 1 || c == 2 || c == 4 || c == 8)) {
////                    System.out.println("980111-2active=" + active+" c==1"+(c==1)+"\t Belldisbale[0]="+Belldisbale[0]);
//                    
//            switch (c) {
//                case 1:
////                    System.out.println("980111- bell1" + Belldisbale[0]);
//                    if (Belldisbale[0]) {
////                        System.out.println("980111- bell1-+2");
//                        sendreveivedOK(c);
//                    }
//                    break;
//                case 2:
////                    System.out.println("980111- bell2");
//                    if (Belldisbale[1]) {
//                        sendreveivedOK(c);
//                    }
//                    break;
//                case 4:
////                    System.out.println("980111- bell3");
//                    if (Belldisbale[2]) {
//                        sendreveivedOK(c);
//                    }
//                    break;
//                case 8:
////                    System.out.println("980111- bell4");
//                    if (Belldisbale[3]) {
//                        sendreveivedOK(c);
//                    }
//                    break;
//                default:
//                    break;
//            }
////            System.out.println("980111- bell1222");
//        }
////          System.out.println("980111-3");
//    }

//    private void sendreveivedOK(int c) {
////        System.out.println("980111- bell1 -+ 5");
////        controllInterFace.RecieveComPort(c);
////        System.out.println("980111- bell1 - 8");
//viewer.Recieve(c);
//        active = false;
//    }

    @Override
    public int getListeningEvents() {
        return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
    }

    @Override
    public int getPacketSize() {
        return 1;
    }


   

}
