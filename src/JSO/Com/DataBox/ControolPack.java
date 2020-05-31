/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import JSO.Com.DataBox_cutom.DatabaseMain;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shayan
 */
public class ControolPack implements Serializable {

    List<Vis_Anim_Bool> vis_Anim_Bool;
    List<DataPackString> datapackString, datapackImage, dataPacMovie, dataPackffmpegmovie;
    List<DataPackanimationStartEnd> dataPackanimationStartEnds;
    List<DataPackSettingsdrawingDimsList> dataPackDimsLists;

    public List<DataPackString> getDataPacMovie() {
        return dataPacMovie;
    }

    public void setDataPacMovie(List<DataPackString> dataPacMovie) {
        this.dataPacMovie = dataPacMovie;
    }

//    public List<DataBooleanIntStringPack> getDataPackCaptureScreen() {
//        return dataPackCaptureScreen;
//    }
//
//    public void setDataPackCaptureScreen(List<DataBooleanIntStringPack> dataPackCaptureScreen) {
//        this.dataPackCaptureScreen = dataPackCaptureScreen;
//    }
//
//    public void setActiveSum(int activeSum) {
//        this.activeSum = activeSum;
//    }
//    public void setVis_Anim_Bool(Vis_Anim_Bool[] vis_Anim_Bool) {
//        this.vis_Anim_Bool = vis_Anim_Bool;
//    }
//
//    public Vis_Anim_Bool[] getVis_Anim_Bool() {
//        return vis_Anim_Bool;
//    }
//    public GameData getGameData() {
//        return gameData;
//    }
//
//    public void setGameData(GameData gameData) {
//        this.gameData = gameData;
//    }
    /**
     *
     * @return
     */
    public ControolPack() {
        vis_Anim_Bool = new LinkedList<Vis_Anim_Bool>();
        datapackString = new LinkedList<DataPackString>();
        datapackImage = new LinkedList<DataPackString>();
        dataPacMovie = new LinkedList<DataPackString>();
        dataPackanimationStartEnds = new LinkedList<DataPackanimationStartEnd>();
        dataPackDimsLists = new LinkedList<DataPackSettingsdrawingDimsList>();
        dataPackffmpegmovie = new LinkedList<DataPackString>();
//        dataPackCaptureScreen = new LinkedList<DataBooleanIntStringPack>();
//        FrameVis = true;
//        gameData = new GameData();
//        timePack = new TimePack();

    }

    public List<DataPackString> getDataPackffmpegmovie() {
        return dataPackffmpegmovie;
    }

    public void setDataPackffmpegmovie(List<DataPackString> dataPackffmpegmovie) {
        this.dataPackffmpegmovie = dataPackffmpegmovie;
    }

    public List<DataPackSettingsdrawingDimsList> getDataPackSettingsdrawingDimsLists() {
        return dataPackDimsLists;
    }

    public void setDataPackSettingsdrawingDimsLists(List<DataPackSettingsdrawingDimsList> dataPackSettingsdrawingDimsLists) {
        this.dataPackDimsLists = dataPackSettingsdrawingDimsLists;
    }

    public List<DataPackanimationStartEnd> getDataPackanimationStartEnds() {
        return dataPackanimationStartEnds;
    }

    public void setDataPackanimationStartEnds(List<DataPackanimationStartEnd> dataPackanimationStartEnds) {
        this.dataPackanimationStartEnds = dataPackanimationStartEnds;
    }

    public List<DataPackString> getDatapackString() {
        return datapackString;
    }

    public void setDatapackString(List<DataPackString> datapackString) {
        this.datapackString = datapackString;
    }

    public List<DataPackString> getDatapackImage() {
        return datapackImage;
    }

    public void setDatapackImage(List<DataPackString> datapackImage) {
        this.datapackImage = datapackImage;
    }

    public List<DataPackString> getDatapacMovie() {
        return dataPacMovie;
    }

    public void setDatapacMovie(List<DataPackString> datapacMovie) {
        this.dataPacMovie = datapacMovie;
    }

//    public Boolean getFrameVis() {
//        return FrameVis;
//    }
//
//    public void setFrameVis(Boolean FrameVis) {
//        this.FrameVis = FrameVis;
//    }
    public Vis_Anim_Bool getVis_Anim_Bool(int indexOfArray) {
        return vis_Anim_Bool.get(indexOfArray);
    }

    public List<Vis_Anim_Bool> getVis_Anim_Bool() {
        return vis_Anim_Bool;
    }

    public void addVis_Anim_Bool(int id, boolean vis) {
        vis_Anim_Bool.add(new Vis_Anim_Bool(id, vis));
    }
     public void addVis_Anim_Bool(int id, boolean visactive,boolean vis) {
        vis_Anim_Bool.add(new Vis_Anim_Bool(id, visactive,vis));
    }
    
    
    
      public void addVis_Anim_Bool(int id, boolean vis,boolean motion, int dim) {
        vis_Anim_Bool.add(new Vis_Anim_Bool(id, vis,motion,dim,false));
    }
        public void addVis_Anim_Bool(int id, boolean vis,boolean motion, int dim , boolean  imagseq) {
        vis_Anim_Bool.add(new Vis_Anim_Bool(id, vis,motion,dim,imagseq));
    }
                public void addVis_Anim_Bool(int id, boolean vis,boolean motion, int dim ,boolean col, boolean  imagseq) {
        vis_Anim_Bool.add(new Vis_Anim_Bool(id, vis, motion, dim, col, imagseq));
    }

//    public void setVis_Anim_Bool(int indexOfArray, Vis_Anim_Bool vis_Anim_Bool) {
//        this.vis_Anim_Bool[indexOfArray] = vis_Anim_Bool;
//    }
//
//    public void setItemsImagVisible(int item, boolean vis) {
//        vis_Anim_Bool[item].setItemsImagVisible(vis);
//    }
//
//    public void setItemsTextVisible(int item, boolean vis) {
//        vis_Anim_Bool[item].setItemsTextVisible(vis);
//    }
//
//    public void setimagePlay(int item, boolean vis) {
//        vis_Anim_Bool[item].setImagePlay(vis);
//    }
//
//    public void setObjectanim(int item, int animation, boolean vis) {
//        vis_Anim_Bool[item].setObjectanim(vis);
//        vis_Anim_Bool[item].setMotionDimIndex(animation);
//    }
    public void clearLists() {

        dataPackanimationStartEnds.clear();
        datapackString.clear();
        datapackImage.clear();
        dataPackDimsLists.clear();
        dataPacMovie.clear();
        dataPackffmpegmovie.clear();
        vis_Anim_Bool.clear();
//        dataPackCaptureScreen.clear();
    }

//    public void setObjectanim(int p, boolean b) {
//        vis_Anim_Bool[p].setMotionDimIndex(0);
//        vis_Anim_Bool[p].setObjectanim(b);
//    }
    public void addDatapackString(int i, String st) {
        datapackString.add(new DataPackString(i, st));
    }
    
     public void addDatapackStringPersion(int i, String st) {
        datapackString.add(new DataPackString(i, st, DataPackString.language.Persion));
    }

    public void addDatapackImage(int i, String path) {
        datapackImage.add(new DataPackString(i, path));
    }

    public void addVis_Anim_Bool(DatabaseMain.VIsanimBool visanimbool) {
      vis_Anim_Bool.add(new Vis_Anim_Bool(visanimbool.getId(), visanimbool.isVisActive(), visanimbool.isVis(), visanimbool.isAnim(), visanimbool.getDim(), visanimbool.isColor(), visanimbool.isSeq()));
    }

    public void addDataPackanimationStartEnds(DatabaseMain.animRateFromENd aRateFromENd) {
         dataPackanimationStartEnds.add(new DataPackanimationStartEnd(aRateFromENd.getId(),aRateFromENd.getFrameRate(), aRateFromENd.isStartendEn(),aRateFromENd.getStart(),aRateFromENd.getEnd()));
    }
  public void addDataPackanimationStartEnds(int id, int animRate, boolean startEndEnable, int start, int end) {
         dataPackanimationStartEnds.add(new DataPackanimationStartEnd(id,animRate,startEndEnable,start,end));
    }

//    public void addDataPackanimationStartEnds(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


}
