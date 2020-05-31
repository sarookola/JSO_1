/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class DataPackanimationStartEnd implements Serializable {

    int id;
    int animRate;
    boolean startEndEnable;
    int start, end;

    boolean sequenceNotMovie, play, live, playEn, liveEn;

    public DataPackanimationStartEnd(int id, int animRate, boolean startEndEnable, int start, int end) {
        this.id = id;
        this.animRate = animRate;
        this.startEndEnable = startEndEnable;
        this.start = start;
        this.end = end;
                 play = false;
        live = false;
        playEn = false;
        liveEn = false;
    }

    


    public DataPackanimationStartEnd(int id, int animRate, int start, int end) {
        this.sequenceNotMovie = true;
        this.id = id;
        this.start = start;
        this.end = end;
        startEndEnable = true;
        this.animRate = animRate;
         play = false;
        live = false;
        playEn = false;
        liveEn = false;
    }

    public DataPackanimationStartEnd(int id, int animRate) {
        this.sequenceNotMovie = true;
        this.id = id;
        startEndEnable = false;
        this.animRate = animRate;
         play = false;
        live = false;
        playEn = false;
        liveEn = false;
    }
     public DataPackanimationStartEnd(int id, boolean live , boolean play) {
        this.sequenceNotMovie = false;
        this.id = id;
           animRate = 100;
        startEndEnable = false;
        this. play = play;
           this. live = live;
        playEn = true;
        liveEn = true;
        
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
         playEn = true;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
          liveEn = true;
    }

    public boolean isPlayEn() {
        return playEn;
    }

    public void setPlayEn(boolean playEn) {
        this.playEn = playEn;
    }

    public boolean isLiveEn() {
        return liveEn;
    }

    public void setLiveEn(boolean liveEn) {
        this.liveEn = liveEn;
    }

    public int getId() {
        return id;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getAnimRate() {
        return animRate;
    }

    public void setAnimRate(int animRate) {
        this.animRate = animRate;
    }

    public boolean isStartEndEnable() {
        return startEndEnable;
    }

    public void setStartEndEnable(boolean startEndEnable) {
        this.startEndEnable = startEndEnable;
    }

    public boolean isSequenceNotMovie() {
        return sequenceNotMovie;
    }

    public void setSequenceNotMovie(boolean sequenceNotMovie) {
        this.sequenceNotMovie = sequenceNotMovie;
    }

}
