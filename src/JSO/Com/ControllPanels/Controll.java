/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.ControllPanels;

import JSO.Com.DataBox_cutom.FileManipulat;
import JSO.Com.Communicate.Server;
import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox_cutom.DatabaseMain;
import JSO.Com.DataBox.Pack;
import JSO.Com.DataBox.SettingPack;
import JSO.Com.Main.ControllCommandSetBase;
import JSO.Com.Main.ControllInterFace;
import JSO.Com.Main.ImagePanel;
import JSO.Com.Main.TimerTimer;
import JSO.Com.Main.Sounds;

/**
 *
 * @author shayan
 */
public class Controll extends javax.swing.JPanel implements ControllInterFace {

    /**
     * Creates new form Controll
     */
    private Server server;
    ControolPack controolPack;
    TimerTimer timer;
    ControllCommandSetBase controllCommandSet;
//    Jpaneldata1 jpaneldata;
//    LastONAirPack lastOnAir;
    String lastontrolDataFile = "seting\\jso\\controolpack.json";

    String database0filename = "seting\\jso\\dataBase0.json";
    Sounds sounds;
//    int bigestPoint = 20;
    boolean newsha;//, serverFree;
//    ImagePanel imagePanel1;
    ControllPanelx controllPanel0;

    DatabaseMain databaseM;
    String database1filename = "seting\\jso\\dataBase1.json";

    ImagePanel imagePanel1;

    public Controll(Server server) {

        newsha = true;
        this.server = server;
        sounds = new Sounds();
        controolPack = new ControolPack();//new FileManipulat().loadControlData(lastontrolDataFile, 5);
//        controolPack.setVis_Anim_Bool(new ControolPack(server.getobjecsArrayLenght()).getVis_Anim_Bool());

        databaseM = new FileManipulat().loadDatabase0(database0filename);

        controllCommandSet = new ControllCommandSetBase(server);
        controllCommandSet.setControolPack(controolPack);
        controllCommandSet.setDatabasem(databaseM);
        initComponents();
//        initData();
//        init_panel(); 

        controllPanel0 = new ControllPanelx(this);
//        nMain = new namaMain(this);

//        jTabbedPane.add("nama",nMain);
        this.add("اضافات", controllPanel0);

//        jTabbedPane.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHalfs = new javax.swing.ButtonGroup();
        jaiGah = new javax.swing.ButtonGroup();

        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents
boolean writepackFree = true;

    public void SendControolPack() {
        saveControolPack();
        server.SendControolPack(controolPack);

    }

    public void SendControolPackOld() {
        new FileManipulat().loadControlData(lastontrolDataFile, controolPack);
        server.SendControolPack(controolPack);
//        if (server.isServerFREEe()) {
//            server.writeSocket(new Pack(controolPack));
//            if (writepackFree) {
//                writepackFree = false;
//               saveControolPackclearList();
////                saveDatabase();
//                writepackFree = true;
//            }
//        }

//        }
    }

    public void SendControolPack(ControolPack c) {
        controolPack = c;
        saveControolPack();
        server.SendControolPack(controolPack);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHalfs;
    private javax.swing.ButtonGroup jaiGah;
    // End of variables declaration//GEN-END:variables

//    public SavePack getSavePack() {
//        return savePack;
//    }
//    public void setSavePack(SavePack savePack) {
//        this.savePack = savePack;
//    }
    public Sounds getSounds() {
        return sounds;
    }

    @Override
    public ControolPack getControolPack() {
        return controolPack;
    }

    @Override
    public void setControolPack(ControolPack controolPack) {
        this.controolPack = controolPack;
    }

    @Override
    public ControllCommandSetBase getControllCommandSet() {
        return controllCommandSet;
    }

    @Override
    public void setControllCommandSet(ControllCommandSetBase controllCommandSet) {
        this.controllCommandSet = controllCommandSet;
    }

    @Override
    public boolean isNewsha() {
        return newsha;
    }

    @Override
    public void setNewsha(boolean newsha) {
        this.newsha = newsha;
    }

//    void sendTime24(int second) {
//        jTextFieldSecond24.setText(String.valueOf(second));
//        timeUpdate();
//    }
    private void initData() {

//        jSpinnerx1.setValue(dim[0]);
//        jSpinnery1.setValue(dim[1]);
//        jSpinnerw1.setValue(dim[2]);
//        jSpinnerh1.setValue(dim[3]);
    }

    @Override
    public void updateControlpack() {
        saveDatabase();
//        saveControolPack();

    }

    private void init_panel() {

    }

    public void saveDatabase() {
//       database1 = new FileManipulat().loadDatabaseJadval(databasefilepath);
        if (!save) {
            save = true;
            new FileManipulat().saveObject(database0filename, databaseM);
            save = false;
        }

    }

    public void saveDatabase0() {
//       database1 = new FileManipulat().loadDatabaseJadval(databasefilepath);
        if (!save) {
            save = true;
            new FileManipulat().saveObject(database0filename, databaseM);
            save = false;
        }

    }
    boolean save = false;
//

    public void saveControolPack() {
        if (!save) {
            save = true;
//            System.out.print("saveing pack _._._");
            new FileManipulat().saveObject(lastontrolDataFile, controolPack);
//         System.out.println("....................saved");
            save = false;
        }
    }

//    private void saveControolPackclearList() {
//              //  saveControolPack();
//        controolPack.clearLists();
//    }
    public SettingPack getSettingPack() {

        return server.getSettingPack();

    }

    public DatabaseMain getDatabase0() {
        return databaseM;
    }

    public void Sendserver(String st) {

        if (server.isServerFREEe()) {
            server.writeSocket(st);
        }
    }

    public String getLastontrolDataFile() {
        return lastontrolDataFile;
    }

    ;
    
    @Override
    public void RecieveComPort(int c) {
        System.out.println("990125 -comport received =" + c);
    }

}
