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
public class Vis_Anim_Bool implements Serializable {

    int id;
        boolean vac;
    boolean vis;
    boolean ani;
    int dim;
    boolean col;
    boolean seq;


    public Vis_Anim_Bool() {
    }

    public void setObjectanim(boolean objectanim) {
        this.ani = objectanim;
    }

    public void setMotionDimIndex(int motionDimIndex) {
        this.dim = motionDimIndex;
    }

    public void setImagePlay(boolean imagePlay) {
        this.seq = imagePlay;
    }

//    public void setItemsImagVisible(boolean itemsImagVisible) {
//        this.imgvis = itemsImagVisible;
//    }
//
//    public void setItemsTextVisible(boolean itemsTextVisible) {
//        this.itemsTextVisible = itemsTextVisible;
//    }
    public boolean isObjectanim() {
        return ani;
    }

    public int getMotionDimIndex() {
        return dim;
    }

    public boolean isImagePlay() {
        return seq;
    }
//
//    public boolean isItemsImagVisible() {
//        return imgvis;
//    }
//
//    public boolean isItemsTextVisible() {
//        return itemsTextVisible;
//    }

    public boolean isvis() {
        return vis;
    }

    public boolean isCol() {
        return col;
    }

    public void setCol(boolean col) {
        this.col = col;
    }

    public void setvis(boolean objvis) {
        this.vis = objvis;
    }

    public Vis_Anim_Bool(int id, boolean vis) {
        this.id = id;
        this.vis = vis;
        this.vac=true;
    }
     public Vis_Anim_Bool(int id, boolean visActive, boolean vis) {
        this.id = id;
        this.vis = vis;
        this.vac=visActive;
    }

    public Vis_Anim_Bool(int id, boolean vis, boolean objectanim, int motionDimIndex, boolean imagePlay) {
        this.id = id;
        this.ani = objectanim;
        this.dim = motionDimIndex;
        this.seq = imagePlay;
        this.vis = vis;
         this.vac=true;
    }

    public Vis_Anim_Bool(int id, boolean vis, boolean ani, int dim, boolean col, boolean seq) {
        this.id = id;
        this.vis = vis;
        this.ani = ani;
        this.dim = dim;
        this.col = col;
        this.seq = seq;
         this.vac=true;
    }
    
    
      public Vis_Anim_Bool(int id, boolean visActive, boolean vis, boolean objectanim, int motionDimIndex, boolean imagePlay) {
        this.id = id;
        this.ani = objectanim;
        this.dim = motionDimIndex;
        this.seq = imagePlay;
        this.vis = vis;
         this.vac=visActive;
    }

    public Vis_Anim_Bool(int id,  boolean visActive,boolean vis, boolean ani, int dim, boolean col, boolean seq) {
        this.id = id;
        this.vis = vis;
        this.ani = ani;
        this.dim = dim;
        this.col = col;
        this.seq = seq;
         this.vac=visActive;
    }
    

    public int getId() {
        return id;
    }

    public boolean isVisACtive() {
        return vac;
    }

    public void setVisACtive(boolean visACtive) {
        this.vac = visACtive;
    }

    
}
