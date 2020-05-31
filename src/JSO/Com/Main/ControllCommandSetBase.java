/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Main;

import JSO.Com.Communicate.Server;
import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox.SettingPack;
import JSO.Com.DataBox_cutom.DatabaseMain;
import JSO.Com.DataBox_cutom.DatabaseMain.VIsanimBool;
import JSO.Com.Render.base.DrawSettingS;

/**
 *
 * @author shayan
 */
public class ControllCommandSetBase {

    public ControolPack controolPack;
    private final Server server;
    DatabaseMain database;

    public ControllCommandSetBase(Server server) {
        this.server = server;
    }

    public ControolPack getControolPack() {
        return controolPack;
    }

    public void setControolPack(ControolPack controolPack) {
        this.controolPack = controolPack;
    }

    public SettingPack getSettingpack() {
        return server.getSettingPack();
    }

    public DatabaseMain getDatabasem() {
        return database;
    }

    public void setDatabasem(DatabaseMain databasem) {
        this.database = databasem;
    }

    private void sendContolPack() {
        server.SendControolPack(controolPack);
    }

    private void setVisMothion(int[] id, int[] vis, int[] anim, int[] dim, int[] color, int[] seq) {
        // VIsanimBool vis = new VIsanimBool(int id, boolean vis, boolean anim, int dim, boolean color, boolean seq)
        //  boolean visa , anima,colora,seqa;
//        DatabaseMain d = new DatabaseMain();
//        VIsanimBool visa;

        for (int i = 0; i < id.length; i++) {
            controolPack.addVis_Anim_Bool(id[i], vis[i] == 1, anim[i] == 1, dim[i], color[i] == 1, seq[i] == 1);
        }

    }

    private void setImageseq(int[] id, int[] animRate, int[] startEndEnable, int[] start, int[] end) {
        for (int i = 0; i < id.length; i++) //aRateFromENd = new DatabaseMain.animRateFromENd(0, 0, startEndEnable[]==1, 0, 0);
        {
            controolPack.addDataPackanimationStartEnds(id[i], animRate[i], startEndEnable[i] == 1, start[i], end[i]);
        }
    }

    public void sendThisControlPack() {
        server.SendControolPack(controolPack);

    }

    public void hideAll() {
        for (DrawSettingS elem : getSettingpack().getDrawSettingS()) {
             controolPack.addVis_Anim_Bool(elem.getId(),true, false);
         }
    }

    public void nameintroOn() {
//        int imagevis[] = {60, 62};
//        int textvis[] = {65, 66};
//        int imagePlay[] = {};
//        int objectanim[] = {60, 62, 65, 66};
//        int motionDims[] = {01, 01, 01, 01, 01, 01, 01};
//
//        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//        updatecontroolPack(controolPack);
//        setobjectanimoff(objectanim, imagePlay);

    }

    public void nameintroOf() {
//        int imagevis[] = {60, 62};
//        int textvis[] = {65, 66};
//        int imagePlay[] = {};
//        int objectanim[] = {60, 61, 62, 65, 66};
//        int motionDims[] = {01, 01, 01, 01, 01, 01, 01};
//
//        int imagevis2[] = {};
//        int textvis2[] = {};
//        int imagePlay2[] = {};
//        int objectanim2[] = {};
//        int motionDims2[] = {02, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002};
//
//        setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//
//        updatecontroolPack(controolPack);
//        setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);

    }
//
//    public void show1() {
//        //  setVisMothion(int[] id, int[] vis, int[] anim, int[] dim, int[] color, int[] seq) {
//        //hideAll();
//        int[] id = {12, 13, 14, 18, 19, 20, 21, 22, 24};
//        int[] vis = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] anim = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] dim = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] color = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] seq = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//        int[] ids = {12};
//        int[] animrate = {25};
//        int[] startEndEnable = {1};
//        int[] start = {0};
//        int[] end = {20};
//        setImageseq(ids, animrate, startEndEnable, start, end);
//        setVisMothion(id, vis, anim, dim, color, seq);
//        sendThisControlPack();
//    }
//
//    public void show1Of() {
//  int[] id = {12, 13, 14, 18, 19, 20, 21, 22, 24};
//        int[] vis = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] anim = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] dim = {0, 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//        int[] color = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] seq = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//        int[] ids = {12};
//        int[] animrate = {-25};
//        int[] startEndEnable = {1};
//        int[] start = {20};
//        int[] end = {0};
//        setImageseq(ids, animrate, startEndEnable, start, end);
//        setVisMothion(id, vis, anim, dim, color, seq);
//        sendThisControlPack();
//    }

    public void runDatabaseMotion(String name) {
        for (DatabaseMain.Settingshowgroups visanim : database.getVisanims()) {
            if (visanim.getNameG().equalsIgnoreCase(name)) {

                for (DatabaseMain.VIsanimBool visanimbool : visanim.getVisanimbools()) {
                    controolPack.addVis_Anim_Bool(visanimbool);
                }
                for (DatabaseMain.animRateFromENd aRateFromENd : visanim.getaRateFromENds()) {
                    controolPack.addDataPackanimationStartEnds(aRateFromENd);
                }

                break;
            }
        }

    }

}
