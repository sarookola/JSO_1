/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Background;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author shayan
 */
public class ImagePanel extends JPanel {

    String address;
    BufferedImage background;
    String string;
    int id;
    
//        ImageIcon icon = new ImageIcon();

    public ImagePanel() {
        ImagePanel("pictures\\shayanRanjbarTest.png");
    }

    private void ImagePanel(String fileAddress) {
        this.address = fileAddress;
        File f = new File(address);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        string = " ";
        drawImage(f);
        setFocusable(true);
        requestFocusInWindow();
    }

    public ImagePanel(String fileAddress) {
        ImagePanel(fileAddress);
    }

    public ImagePanel(File f) {
        
        drawImage(f);
        
         setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        string = " ";
        drawImage(f);
        setFocusable(true);
        requestFocusInWindow();
    }

    public void drawImage(String address) {
        this.address = address;
        reloadImage();

    }

    public void drawImage(File address) {
        try {
            this.address = address.getAbsolutePath();
    background = ImageIO.read(address);

if(background==null)
    background = ImageIO.read(new File("pictures\\shayanRanjbarTest.png"));
           
 repaint();
        } catch (IOException ex) {
            try {
                background = ImageIO.read(new File("pictures\\shayanRanjbarTest.png"));
                 repaint();
//            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }

    public void drawImage() {
        this.address = "pictures\\shayanRanjbarTest.png";
    }

    public void drawImage(BufferedImage background) {
        this.background = background;
        repaint();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public BufferedImage getImage() {
        return background;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background == null) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g;

        Rectangle r = this.getBounds();

        AffineTransform affImageBack = new AffineTransform();
        affImageBack.scale((float) r.width / background.getWidth(null), (float) r.height / background.getHeight(null));
        g2d.drawImage(background, affImageBack, this);
        Font font = new Font("arial", Font.PLAIN, r.height);
        g2d.setFont(font);
        g2d.setColor(Color.WHITE);
        g2d.drawString(string, (int) (r.width * .1), (int) (r.height * .9));

    }

    public void redrawImage() {
        drawImage(background);
        repaint();
    }

    public void reloadImage() {
        File f = new File(address);
        try {
            drawImage(ImageIO.read(f));
        } catch (IOException ex) {
            address = "pictures\\shayanRanjbarTest.png";
            f = new File(address);
            drawImage(f);

        }

    }

    void setimage(BufferedImage background) {
        this.background = background;
        redrawImage();
    }

    public boolean checksizeforkashi() {
        int w = background.getWidth(null),
                h = background.getHeight(null);
        if ((w / h) > 5 || (w / h) < 2 || (w + h) > 3600 || (w + h)<700) {
            return false;
        } else {
            return true;
        }
    }
}
