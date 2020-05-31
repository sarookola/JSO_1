/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import JSO.Com.Render.base.DrawItemDisplay;
import JSO.Com.Render.base.DrawSettingDims;
import JSO.Com.Render.base.DrawSettingS;
import java.awt.Color;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shayan
 */
public class SettingPackOneElement implements Serializable {


    int[] scr = {0,0,600,400};
    int backcolor;

 DrawSettingS drawSettingS;
   String fontpath = "C:\\OpenSceneGraph\\data\\fonts\\";
   

    public SettingPackOneElement() {
    }



//    public void resetid() {
//        for (int i = 0; i < drawSettingS.length; i++) {
//            drawSettingS[i].setId(i);
//        }
//    }


  


    public int[] getScreenDim() {
        return scr;
    }

    public void setScreenDim(int[] screenDim) {
        this.scr = screenDim;
    }



    public Color getBackcolor() {
        Color c = new Color(backcolor);
        return c;
    }

    public void setBackcolor(Color backcolor) {

        this.backcolor = backcolor.getRGB();
    }

    public DrawSettingS getDrawSettingS() {
        return drawSettingS;
    }

    public void setDrawSettingS(DrawSettingS drawSettingS) {
        this.drawSettingS = drawSettingS;
    }


}
