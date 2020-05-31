/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Render.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author shayan
 */
public class DrawItemDisplay implements Serializable {
//    Rectangle2D rectangle;

    double xRelative;
    double yRelative;
    double widthRelative;
    double heightRelative;
    int xPos, yPos, wScale, hScale;
    String text1;
    Color strokC;
    Color textC;
    Color back;
    int opac;
    String image;
    BufferedImage imagepic;
   // BufferedImage imagepicbuff;
    boolean imagevisiblity;
    boolean textvisiblity;
    boolean animLoop;
   // int imageProcess;
    //float hue1, hue2, hueChaneDur;
    int SequencCount;
    BufferedImage[] imageseq;
    int imageseqStart, imageseqEnd,animRate;
    int alignH, alignV;
    String  font;
    int font2_P_B_I;

    ;

    public DrawItemDisplay() {
        this.text1 = "Empty";
        image = "pictures\\shayanRanjbarTest.png";
        setImagepic((BufferedImage) getImagePicFromFile(image));
        font = "Arial";
//        imageProcess = 0;
//        setimagepicBuffer((BufferedImage) getImagePicFromFile(image));
    }

    public DrawItemDisplay(double xRelative, double yRelative, double widthRelative, double heightRelative, String text1) {
        this.xRelative = xRelative;
        this.yRelative = yRelative;
        this.widthRelative = widthRelative;
        this.heightRelative = heightRelative;
        this.text1 = text1;
        image = "pictures\\shayanRanjbarTest.png";
        setImagepic((BufferedImage) getImagePicFromFile(image));
        font = "Arial";
//        imageProcess = 0;
//        setimagepicBuffer((BufferedImage) getImagePicFromFile(image));
    }

    public String getFont2() {
        return font;
    }

    public void setFont2(String font) {
        this.font = font;
    }


 





    public int getSequencCount() {
        return SequencCount;
    }

    public void setSequencCount(int SequencCount) {
        this.SequencCount = SequencCount;
        if (SequencCount > 0) {
            createImageseq();
        }
    }

    public BufferedImage getImagepic() {
        return imagepic;
    }

    public void setImagepic(BufferedImage imagepic) {
        this.imagepic = imagepic;
    }

//    public void setimagepicBuffer(BufferedImage imagepic) {
//        this.imagepicbuff = imagepic;
//    }
    public void setxRelative(int xRelative) {
        this.xRelative = (double) xRelative / 1000;
        xPos = xRelative + wScale / 2;
    }

    public void setyRelative(int yRelative) {
        this.yRelative = (double) yRelative / 1000;
        yPos = yRelative + hScale / 2;
    }

    public void setWidthRelative(int widthRelative) {
        this.widthRelative = (double) widthRelative / 1000;
        wScale = widthRelative;
    }

    public void setHeightRelative(int heightRelative) {
        this.heightRelative = (double) heightRelative / 1000;
        hScale = heightRelative;
    }

    public void setText(String text1) {
        this.text1 = text1;
    }

    public void setStrokC(Color strokC) {
        this.strokC = strokC;
    }

    public void setTextC(Color textC) {
        this.textC = textC;
    }

    public void setBack(Color back) {
        this.back = back;
    }

    public void setOpac(int alpha) {
        this.opac = alpha;
    }

    public void setImage(String image) {
        if (!this.image.equalsIgnoreCase(image)) {
            this.image = image;
            setImagepic( getImagePicFromFile(image));
//            setimagepicBuffer((BufferedImage) getImagePicFromFile(image));
        }
    }

    public void setImagevisiblity(boolean imagevisiblity) {
        this.imagevisiblity = imagevisiblity;
    }

    public void setTextvisiblity(boolean textvisiblity) {
        this.textvisiblity = textvisiblity;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setwScale(int wScale) {
        this.wScale = wScale;
    }

    public void sethScale(int hScale) {
        this.hScale = hScale;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getwScale() {
        return wScale;
    }

    public int gethScale() {
        return hScale;
    }

    public BufferedImage[] getImageseq() {
        return imageseq;
    }

    public double getxRelative() {
        return xRelative;
    }

    public double getyRelative() {
        return yRelative;
    }

    public double getWidthRelative() {
        return widthRelative;
    }

    public double getHeightRelative() {
        return heightRelative;
    }

    public String getText1() {
        return text1;
    }

    public Color getStrokC() {
        return strokC;
    }

    public Color getTextC() {
        return textC;
    }

    public Color getBack() {
        return back;
    }

    public int getOpac() {
        return opac;
    }

    public String getImage() {
        return image;
    }

    public boolean isImagevisiblity() {
        return imagevisiblity;
    }

    public boolean isTextvisiblity() {
        return textvisiblity;
    }

    public boolean isAnimLoop() {
        return animLoop;
    }

    public int getImageseqStart() {
        return imageseqStart;
    }

    public void setImageseqStart(int imageseqStart) {
        this.imageseqStart = imageseqStart;
    }

    public int getImageseqEnd() {
        return imageseqEnd;
    }

    public void setImageseqEnd(int imageseqEnd) {
        this.imageseqEnd = imageseqEnd;
    }

    public int getMargine() {
        return alignH;
    }

    public void setMargine(int margine) {
        this.alignH = margine;
    }

    public void setAnimLoop(boolean animLoop) {
        this.animLoop = animLoop;
    }

    public int getAnimRate() {
        return animRate;
    }

    public void setAnimRate(int animRate) {
        this.animRate = animRate;
    }
    

    public BufferedImage getImagePicFromFile(String image) {
//         System.out.print("\t file1="+image);
        BufferedImage im = null;
        try {
            im = ImageIO.read(new File(image));

        } catch (IOException ex) {
            System.out.println("\t file2=" + image);
            Logger.getLogger(DrawItemDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toCompatibleImage(im);
    }
private BufferedImage toCompatibleImage(BufferedImage image)
{
    // obtain the current system graphical settings
    GraphicsConfiguration gfx_config = GraphicsEnvironment.
        getLocalGraphicsEnvironment().getDefaultScreenDevice().
        getDefaultConfiguration();

    /*
     * if image is already compatible and optimized for current system 
     * settings, simply return it
     */
    if (image.getColorModel().equals(gfx_config.getColorModel()))
        return image;

    // image is not optimized, so create a new image that is
    BufferedImage new_image = gfx_config.createCompatibleImage(
            image.getWidth(), image.getHeight(), image.getTransparency());

    // get the graphics context of the new image to draw the old image on
    Graphics2D g2d = (Graphics2D) new_image.getGraphics();

    // actually draw the image and dispose of context no longer needed
    g2d.drawImage(image, 0, 0, null);
    g2d.dispose();

    // return the new optimized image
    return new_image; 
}
    public void setimageSeq(int sequencCount) {
        imagepic = imageseq[sequencCount];
    }

    public BufferedImage loadimageSeq(int sequencCount) {
        String extend = image.substring(image.length() - 4);
//        System.out.println("970405-imagex="+image+"   part="+image.substring(image.length() - 8, image.length() - 4));
        int count = Integer.parseInt(image.substring(image.length() - 8, image.length() - 4));
//        System.out.println("frame=" + String.format(image.substring(0, image.length() - 8) + "%04d" + extend, count + sequencCount));
        return (BufferedImage) getImagePicFromFile(String.format(image.substring(0, image.length() - 8) + "%04d" + extend, count + sequencCount));

    }

    private void createImageseq() {
        imageseq = new BufferedImage[SequencCount];
        for (int i = 0; i < SequencCount; i++) {
            imageseq[i] = loadimageSeq(i);
        }
    }
    /*
    
     public void setImage(String image) {
     if (!this.image.equalsIgnoreCase(image) ) {
     this.image = image;
     setImagepic((BufferedImage) getImagePicFromFile(image));
     //            setimagepicBuffer((BufferedImage) getImagePicFromFile(image));
     }
     }
     public void setImagepicAlpha_old(int oon) {
     //        System.out.println("imagbuff="+imagepicbuff);
     int color;
     int oon2;
     for (int x = 0; x < imagepicbuff.getWidth(); x++) {
     for (int y = 0; y < imagepicbuff.getHeight(); y++) {
     color = imagepicbuff.getRGB(x, y);
     //                System.out.print("\t my oon1="+oon);
     oon2 = ((color & 0xff000000) >> 24 * oon / 255);
     color = imagepicbuff.getRGB(x, y) & 0x00ffffff;
     //                        System.out.println("\t oon2="+oon2);
     color = color | (oon2 << 24);
     imagepic.setRGB(x, y, color);
     }

     }
     }
     */

//    public float getcalhue(long miliframe) {
//        float hue = 0;
//        ImageProcess imageProcess = new ImageProcess();
//        if (miliframe > hueChaneDur) {
//            hue = hue2;
//
//        } else if (hueChaneDur > 0) {
//            hue = hue1 + ((hue2 - hue1) * (float) miliframe / hueChaneDur);
//
//        }
////        System.out.println("miliframe="+miliframe + "hueChaneDur"+hueChaneDur+ "   hue="+hue);
//         setImagepic(imageProcess.glowColor(hue, imagepic));
//        return hue;
//    }
    public int getAlignH() {
        return alignH;
    }

    public void setAlignH(int alignH) {
        this.alignH = alignH;
    }

    public int getAlignV() {
        return alignV;
    }

    public void setAlignV(int alignV) {
        this.alignV = alignV;
    }

    public int getFont2_P_B_I() {
        return font2_P_B_I;
    }

    public void setFont2_P_B_I(int font2_P_B_I) {
        this.font2_P_B_I = font2_P_B_I;
    }

 


}
