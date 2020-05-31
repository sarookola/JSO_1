/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Render.base;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class DrawSettingColors implements Serializable {
//    Rectangle2D rectangle;


    int strokC;
    int textC;
//     Color back;
    int bezierLinear = 0 ;//0=beaier  1 linear
    int opac;
    int frames;

    public DrawSettingColors() {
        opac = 255;
        textC =  0xffffffff;
        strokC = 0xff000000;
        frames = 10;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public void setStrokC(Color strokC) {
        this.strokC = strokC.getRGB();
    }

    public void setTextC(Color textC) {
        this.textC = textC.getRGB();
    }

    public void setOpac(int alpha) {
        this.opac = alpha;
    }

    public Color getStrokC() {
        Color c = new Color(strokC);
        return c;
    }

    public Color getTextC() {
        Color c = new Color(textC);
        return c;
    }

    public int getopac() {
        return opac;
    }





}
