/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import java.io.Serializable;

/**
 *
 * @author Shayan
 */
public class Pack implements Serializable  {

    int x=-1;  // 0 is setting , 1 is controol , 2 timers
    SettingPack settingpack;
    ControolPack controolPack;

//    public Pack(int i, Object o) {
//        x = i;
//        object = o;
//    }

    public Pack(SettingPack settingpack) {
        x=0;
        this.settingpack = settingpack;
    }

    public Pack(ControolPack controolPack) {
        x=1;
        this.controolPack = controolPack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public SettingPack getSettingpack() {
        return settingpack;
    }

    public void setSettingpack(SettingPack settingpack) {
        this.settingpack = settingpack;
    }

    public ControolPack getControolPack() {
        return controolPack;
    }

    public void setControolPack(ControolPack controolPack) {
        this.controolPack = controolPack;
    }


    public Object getObjectByX() {
        if (x == 0) {
            return settingpack;
        } else {
            return null;
        }
    }

}
