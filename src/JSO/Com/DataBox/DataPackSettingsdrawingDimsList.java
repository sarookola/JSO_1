/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import JSO.Com.Render.base.DrawSettingDims;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author shayan
 */
public class DataPackSettingsdrawingDimsList implements Serializable {

    int id;
    int ito;
int dim1,dim2;
    List<DrawSettingDims[]> drawingDimsList;

    public DataPackSettingsdrawingDimsList(int id, List<DrawSettingDims[]> drawingDimsList) {
        this.id = id;
        
//        this.drawingDimsList = drawingDimsList;
    }
    
     public DataPackSettingsdrawingDimsList(int id) {
        this.id = id;
    }

    public List<DrawSettingDims[]> getDrawingDimsList() {
        return drawingDimsList;
    }

    public void setDrawingDimsList(List<DrawSettingDims[]> drawingDimsList) {
        this.drawingDimsList = drawingDimsList;
    }
   public int getId() {
        return id;
    }

    public int getIto() {
        return ito;
    }

    public void setIto(int ito) {
        this.ito = ito;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

public void setDrawinGObject(int currentdimslist, int currentdimarray,int dim1,int dim2 ) {

//        drawingDimsList.remove(currentdimslist);
        drawingDimsList.add(currentdimslist, new DrawSettingDims[currentdimarray]);
//        this.drawinGObject = new DrawSettingDims[x];
        for (int i = 0; i < currentdimarray; i++) {
            drawingDimsList.get(currentdimslist)[i] = new DrawSettingDims();
        }
           this.dim1 = dim1;
        this.dim2 = dim2;
    }

  
   
   

}