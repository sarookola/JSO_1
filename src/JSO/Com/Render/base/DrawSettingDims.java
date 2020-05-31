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
public class DrawSettingDims implements Serializable {
//    Rectangle2D rectangle;

    float pos[];
    float scale[];
    float angle[];
  //  int acceleratein, accelerateout;
    int strokC;
    int textC;
//     Color back;
    int bezierLinear = 0 ;//0=beaier  1 linear
    int opac;
    int frames;

    public DrawSettingDims() {
        opac = 255;
        textC =  0xffffffff;
        strokC = 0xff000000;
        pos = new float[3];
        scale = new float[3];
        angle = new float[3];
        for (int i = 0; i < 3; i++) {
            scale[i] = 1;
        }
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

    public void setDim(float dim[]) {
        for (int i = 0; i < 3; i++) {
            pos[i] = dim[i];
            scale[i] = dim[3 + i];
            angle[i] = dim[6 + i];
        }

    }

    public float[] getDim() {
        float dim[] = new float[9];
        for (int i = 0; i < 3; i++) {
            dim[i] = pos[i];
            dim[3 + i] = scale[i];
            dim[6 + i] = angle[i];
        }
        return dim;
    }

    public float getxRelative() {
        return pos[0] - scale[0] / 2;
    }

    public float getx() {
        return pos[0];
    }

    public float gety() {
        return pos[1];
    }
      public float getz() {
        return pos[2];
    }
//
//    public float getyRelative() {
//        return pos[1] - scale[1] / 2;
//    }
////
//    public float getWidthRelative() {
//        return scale[0];
//    }
//
//    public float getHeightRelative() {
//        return scale[1];
//    }

    public void setPosX(float i) {
        pos[0] = i;
    }

    public void setPosY(float i) {
        pos[1] = i;
    }
    public void setPosZ(float i) {
        pos[2] = i;
    }
    
    

//    public void setWidthRelative(float i) {
//        scale[0] = i;
//    }
//
//    public void setHeightRelative(float i) {
//        scale[1] = i;
//    }

//        public float getx() {
//        return pos[0];
//    }
//         public void setPosX(float i) {
//        pos[0] = i;
//    }

    public float getPos(int index) {
        return pos[index];
    }

    public void setPos(int index,float pos) {
        this.pos[index] = pos;
    }

    public float getScale(int index) {
        return scale[index];
    }

    public void setScale(int index,float scale) {
        this.scale[index] = scale;
    }

    public float getAngle(int index) {
        return angle[index];
    }

    public void setAngle(int index,float angle) {
        this.angle[index] = angle;
    }
    
    
    
}
