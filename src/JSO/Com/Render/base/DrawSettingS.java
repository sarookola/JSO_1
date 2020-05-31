/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Render.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author shayan
 */
public class DrawSettingS implements Serializable {
//    Rectangle2D rectangle;

    static int ver = 9601;
    int id = 0;
    String text1;
    String image;
    boolean vold;
    boolean vis;
    int ito;  // image text object
    
    
    boolean imageSequency;
    boolean seqLoop;
     boolean anLoop;
    int sequencCount;
    int AnimateRate;
    List<DrawSettingDims[]> drawingDimsList;
     List<DrawSettingColors[]> drawingColorList;
    Color back;
    int parent;
    List<Integer> childs;
    int align = 1;//0=left 1- middele 2:right
//    int alignment = 1;//0=left 1- middele 2:right
//int cSize = 40,//0=left 1- middele 2:right Allignment Vertically
// fRes = 40,
// fmax=100;
int fonts[]={40,40,100,50};
    String font;
    boolean fback,fItalic, fBold;
    int bezierLinear = 0 ;//  0=linear 1=beaier  2=beaier2 

    public DrawSettingS(int lastid) {
        this.text1 = "Empty";
        image = "pictures\\shayanRanjbarTest.png";
        drawingDimsList = new LinkedList<DrawSettingDims[]>();
        drawingDimsList.add(new DrawSettingDims[1]);
        drawingDimsList.get(0)[0] = new DrawSettingDims();
        drawingColorList= new LinkedList<DrawSettingColors[]>();
        drawingColorList.add(new DrawSettingColors[1]);
        drawingColorList.get(0)[0] = new DrawSettingColors();
        font = "Arial.ttf";
        vold = false;
        vis = true;
        imageSequency = false;
        AnimateRate = 100;
        childs = new LinkedList<Integer>();
        fItalic=false;
        fBold=false;
        id=lastid;
        //     System.out.println("  x   ");
    }
    

    public void addChild(int index) {
        if (index > 0) {
            childs.add(index);
        }
    }

    public boolean removeChild(int childIndex) {
        boolean x = false;
        for (int next = 0; next < childs.size(); next++) {
            if (next == childIndex) {
                childs.remove(next);
                return true;
            }
        }
        return x;
    }

    public static int getVer() {
        return ver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getAlign() {
        return align;
    }

    public void setAlign(int align) {
        this.align = align;
    }


  



    public boolean isSeqLoop() {
        return seqLoop;
    }

    public void setSeqLoop(boolean animloop) {
        this.seqLoop = animloop;
    }

    public int[] getchilds() {
        int x[] = new int[childs.size()];
        return x;
    }

    public boolean isAnLoop() {
        return anLoop;
    }

    public void setAnLoop(boolean anLoop) {
        this.anLoop = anLoop;
    }
    

    public List<Integer> getChilds() {
        return childs;
    }

    public DrawSettingS(String text1) {
        this.text1 = text1;
        image = "pictures\\shayanRanjbarTest.png";
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public boolean isImageSequency() {
        return imageSequency;
    }

    public void setImageSequency(boolean imageSequency) {
        this.imageSequency = imageSequency;
    }

    public int getSequencCount() {
        return sequencCount;
    }

    public void setSequencCount(int sequencCount) {
        this.sequencCount = sequencCount;
    }

    public int getBezierLinear() {
        return bezierLinear;
    }

    public void setBezierLinear(int bezierLinear) {
        this.bezierLinear = bezierLinear;
    }
            
    public int getAnimateRate() {
        return AnimateRate;
    }

    public void setAnimateRate(int AnimateRate) {
        this.AnimateRate = AnimateRate;
    }

    public DrawSettingDims[] getDrawingDimsByIndex(int index) {

        return drawingDimsList.get(index);
    }

    public int getLinkTo() {
        return parent;
    }

    public void setLinkTo(int linkTo) {
        this.parent = linkTo;
    }

    public void setBack(Color back) {
        this.back = back;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImagevisiblity(boolean imagevisiblity) {
        this.vold = imagevisiblity;
    }

    public void setVisiblity(boolean visiblity) {
        this.vis = visiblity;
    }

    public String getText1() {
        return text1;
    }

    public Color getBack() {
        return back;
    }

    public String getImage() {
        return image;
    }

    public boolean isImagevisiblity() {
        return vold;
    }

    public boolean isVisible() {
        return vis;
    }

    public String getFont2() {
        return font;
    }

    public void setFont2(String font) {
        this.font = font;
    }

    public boolean isFontItalic() {
        return fItalic;
    }

    public void setFontItalic(boolean fontItalic) {
        this.fItalic = fontItalic;
    }

    public boolean isFontBold() {
        return fBold;
    }

    public void setFontBold(boolean fontBold) {
        this.fBold = fontBold;
    }
    

    public Image getImagePic() {
        Image im = null;
        try {
            im = ImageIO.read(new File(image));
        } catch (IOException ex) {
            Logger.getLogger(DrawSettingS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return im;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public List<DrawSettingColors[]> getDrawingColorList() {
        return drawingColorList;
    }

    public void setDrawingColorList(List<DrawSettingColors[]> drawingColorList) {
        this.drawingColorList = drawingColorList;
    }
   public DrawSettingColors[] getDrawingColorByIndex(int index) {

        return drawingColorList.get(index);
    }
    public List<DrawSettingDims[]> getDrawingDimsList() {
        return drawingDimsList;
    }

    public void setDrawingDimsList(List<DrawSettingDims[]> drawingDimsList) {
        this.drawingDimsList = drawingDimsList;
    }

    public void setDrawinGObject(int currentdimslist, int currentdimarray) {

        drawingDimsList.remove(currentdimslist);
        drawingDimsList.add(currentdimslist, new DrawSettingDims[currentdimarray]);
//        this.drawinGObject = new DrawSettingDims[x];
        for (int i = 0; i < currentdimarray; i++) {
            drawingDimsList.get(currentdimslist)[i] = new DrawSettingDims();
        }
    }

    public List<DrawSettingDims[]> getDrawingDimsListCopy() {
        List list = new LinkedList<DrawSettingDims[]>();
        for (int i = 0; i < drawingDimsList.size(); i++) {
            DrawSettingDims dd[] = new DrawSettingDims[drawingDimsList.get(i).length];
            for (int j = 0; j < dd.length; j++) {
                dd[j] = new DrawSettingDims();
//                System.out.println("dd[j]"+dd[j].getDim()[0]);
//                System.out.println("      drawingDimsList.get(i)[j].getDim()"+drawingDimsList.get(i)[j].getDim()[0]);
                dd[j].setDim(drawingDimsList.get(i)[j].getDim());
                dd[j].setOpac(drawingDimsList.get(i)[j].getopac());
                dd[j].setFrames(drawingDimsList.get(i)[j].getFrames());
                dd[j].setTextC(drawingDimsList.get(i)[j].getTextC());
                dd[j].setStrokC(drawingDimsList.get(i)[j].getStrokC());

            }
            list.add(dd);
        }
        return list;
    }

    public void setDrawSettings(List<DrawSettingDims[]> drawcopy) {
        this.drawingDimsList = drawcopy;
    }

    public boolean isTextbackvisible() {
        return fback;
    }

    public void setTextbackvisible(boolean fontback) {
        this.fback = fontback;
    }
  public int getcSize() {
//      return cSize;
//       if(fonts==null)fonts = new int[4];
        return  fonts[0];
    }

    public void setcSize(int cSize) {
//        this.cSize = cSize;
// if(fonts==null)fonts = new int[4];
        fonts[0] =cSize;
    }

    public int getfRes() {
//        return  fRes;
//         if(fonts==null)fonts = new int[4];
        return fonts[1];
    }

    public void setfRes(int fRes) {
//        this.fRes = fRes;
//         if(fonts==null)fonts = new int[4];
        fonts[1] =fRes;
    }
    public int getFmaxsizw() {
//         if(fonts==null)fonts = new int[4];
        return fonts[2];
//        return fmax;
    }

    public void setFmaxsizw(int fmaxsizw) {
//        this.fmax = fmaxsizw;
//       if(fonts==null)fonts = new int[4];
       fonts[2] =fmaxsizw;
    }
    
      public int getFSpacing() {
//          if(fonts==null)fonts = new int[4];
        return fonts[3];
    }

    public void setFSpacing(int fSpacing) {
//          if(fonts==null)fonts = new int[4];
       fonts[3] = fSpacing;
    }

    public int getIto() {
        return ito;
    }

    public void setIto(int ito) {
        this.ito = ito;
    }

}
