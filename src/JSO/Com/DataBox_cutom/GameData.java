/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox_cutom;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Shayan
 */
public class GameData implements Serializable {

    boolean timerAnimate;
    boolean savePic;
    String pathsavePic;




    public GameData() {

    }

    public boolean isSavePic() {
        return savePic;
    }

    public void setSavePic(boolean savePic) {
        this.savePic = savePic;
    }

    public String getPathsavePic() {
        return pathsavePic;
    }

    public void setPathsavePic(String pathsavePic) {
        this.pathsavePic = pathsavePic;
    }


    public boolean isTimerAnimate() {
        return timerAnimate;
    }

    public void setTimerAnimate(boolean timerAnimate) {
        this.timerAnimate = timerAnimate;
    }

}
