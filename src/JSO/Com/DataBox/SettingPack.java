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
public class SettingPack implements Serializable {

   static  int ver = 9807;
   int lastID=6;
    String font;
    int strok;
    int[] scr = {0,0,600,400};
    float[] cam;
    int backcolor;
    String path;
    int SeetingCode;
    int currentChildDimIndex;
    int currentParentDimIndex;
    int selectedItem = 0;
    int activedimState = 0;
    int activeDimIndex = 0;
   List<DrawSettingS> drawSettingS;
   String fontpath = "data\\fonts\\";
int exit=0;

    public void setLastIDEnd() {
        
        this.lastID = drawSettingS.size();
    }


    public SettingPack() {
        this.cam = new float[]{0, 0, 1000, 0, 0, 0, 0, 1, 0};
        path = "";
        font = "Arial.ttf";
    }


//    public void resetid() {
//        for (int i = 0; i < drawSettingS.length; i++) {
//            drawSettingS[i].setId(i);
//        }
//    }

    public  int getVer() {
        return ver;
    }

    public int getSeetingCode() {
        return SeetingCode;
    }

    public void setSeetingCode(int SeetingCode) {
        this.SeetingCode = SeetingCode;
    }

  

    public int getActiveDimIndex() {
        return activeDimIndex;
    }

    public void setActiveDimIndex(int activeDimIndex) {
        this.activeDimIndex = activeDimIndex;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int[] getScreenDim() {
        return scr;
    }

    public void setScreenDim(int[] screenDim) {
        this.scr = screenDim;
    }

    public int getStrok() {
        return strok;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public Color getBackcolor() {
        Color c = new Color(backcolor);
        return c;
    }

    public void setBackcolor(Color backcolor) {

        this.backcolor = backcolor.getRGB();
    }

    public String getPath() {
        if (path == null) {
            path = "";
        }
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getActiveDimState() {
        return activedimState;
    }

    public void setActiveDimState(int settingondim) {
        this.activedimState = settingondim;
    }

    public int getCurrentChildDimIndex() {
        return currentChildDimIndex;
    }

    public void setCurrentChildDimIndex(int currentChildDimIndex) {
        this.currentChildDimIndex = currentChildDimIndex;
    }

    public int getCurrentParentDimIndex() {
        return currentParentDimIndex;
    }

    public void setCurrentParentDimIndex(int currentParentDimIndex) {
        this.currentParentDimIndex = currentParentDimIndex;
    }
    
    public int getLastID() {
        lastID++;
       return lastID;
    }

    public List<DrawSettingS> getDrawSettingS() {
        return drawSettingS;
    }

    public void setDrawSettingS(List<DrawSettingS> drawSettingS) {
        this.drawSettingS = drawSettingS;
    }
    
      public DrawSettingS getDrawSettingS(int index) {
        return drawSettingS.get(index);
    }

    public void setDrawSettingS(int index ,DrawSettingS drawSettingS) {
        this.drawSettingS.set(index,drawSettingS)  ;
    }

    public String getFontpath() {
        return fontpath;
    }

    public void setFontpath(String fontpath) {
        this.fontpath = fontpath;
    }



    public void setExit(int exit) {
        this.exit = exit;
    }

    public float[] getCamera() {
        return cam;
    }

    public void setCamera(float[] camera) {
        this.cam = camera;
    }

}
