/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox_cutom;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author shayan
 */
public class DatabaseMain {
    
    String Pic01;
    String name;
    int time, toTime1, toTime2, timeREset1, timeREset2;
    boolean timer0Direction; //true=+1
    int captureDim[];
    int framecounter;
    String text01;
    int lastvisanimsIndex;
    List<Settingshowgroups> visanims;
    Settingshowgroups  SettingshowgroupsClipboard;

    public class Settingshowgroups {
        
        public Settingshowgroups(String namegg) {
            checkvisanimbools(0);
            checkaRateFromENds(0);
            nameG = namegg;            
        }
        
        List<VIsanimBool> visanimbools;
        List<animRateFromENd> aRateFromENds;
        String nameG;
        
        public String getNameG() {
            return nameG;
        }
        
        public void setNameG(String name) {
            this.nameG = name;
        }
        
        public void setVisanimboolssetSize(int vis) {
            if (visanimbools.size() > vis) {
                for (int i = visanimbools.size() - 1; i >= vis; i--) {
                    visanimbools.remove(i);
                }
            } else {
                for (int i = visanimbools.size(); i < vis; i++) {
                    visanimbools.add(new VIsanimBool(0, false, false, 0, false, false));
                }
            }
        }
        
        public void setaRateFromENdsSize(int vis) {
//        System.out.println("9811105    vis="+vis+ "    size="+aRateFromENds.size());
            if (aRateFromENds.size() > vis) {
                for (int i = aRateFromENds.size() - 1; i >= vis; i--) {
                    aRateFromENds.remove(i);
                }
            } else {
                for (int i = aRateFromENds.size(); i < vis; i++) {
                    aRateFromENds.add(new animRateFromENd(0, 100, false, 0, 1));
                }
            }
        }
        
        public List<VIsanimBool> getVisanimbools() {
            checkvisanimbools(0);
            return visanimbools;
        }
        
        public VIsanimBool getVisanimbools(int index) {
            
            checkvisanimbools(index);
            return visanimbools.get(index);
        }
        
        public void setVisanimbools(int index, VIsanimBool visanimbool) {
            checkvisanimbools(index);
            this.visanimbools.set(index, visanimbool);
        }
        
        private void checkvisanimbools(int index) {
            if (visanimbools == null) {
                visanimbools = new LinkedList<VIsanimBool>();
                visanimbools.add(new VIsanimBool(1, false, false, 0, false, false));
                
            }
            if (index >= visanimbools.size()) {
                for (int i = Math.max(0, visanimbools.size()); i < index + 1; i++) {
                    visanimbools.add(new VIsanimBool(1, false, false, 0, false, false));
                }
            }
        }
        
        private void checkaRateFromENds(int index) {
            if (aRateFromENds == null) {
                aRateFromENds = new LinkedList<animRateFromENd>();
                aRateFromENds.add(new animRateFromENd(0, 100, false, 0, 1));
            }
            if (index >= aRateFromENds.size()) {
                for (int i = Math.max(0, aRateFromENds.size()); i < index + 1; i++) {
                    aRateFromENds.add(new animRateFromENd(0, 100, false, 0, 1));
                }
            }
        }
        
        public List<animRateFromENd> getaRateFromENds() {
            checkaRateFromENds(0);
            return aRateFromENds;
        }
        
        public animRateFromENd getaRateFromENds(int index) {
            checkaRateFromENds(index);
            return aRateFromENds.get(index);
        }
        
        public void setaRateFromENds(int index, animRateFromENd aRateFromENds) {
            this.aRateFromENds.set(index, aRateFromENds);
        }
        
    }
    
    public class VIsanimBool {
        
        int id;
        boolean vis,vac;//visibility active
        
        boolean anim;
        int dim;
        boolean color;
        boolean seq;
        
        public VIsanimBool(int id, boolean vis, boolean anim, int dim, boolean color, boolean seq) {
            this.id = id;
            this.vis = vis;
            this.anim = anim;
            this.dim = dim;
            this.color = color;
            this.seq = seq;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public boolean isVis() {
            return vis;
        }
        
        public void setVis(boolean vis) {
            this.vis = vis;
        }
        
        public boolean isAnim() {
            return anim;
        }
        
        public void setAnim(boolean anim) {
            this.anim = anim;
        }
        
        public int getDim() {
            return dim;
        }
        
        public void setDim(int dim) {
            this.dim = dim;
        }
        
        public boolean isColor() {
            return color;
        }
        
        public void setColor(boolean color) {
            this.color = color;
        }
        
        public boolean isSeq() {
            return seq;
        }
        
        public void setSeq(boolean seq) {
            this.seq = seq;
        }

        public boolean isVisActive() {
          //  if(vac==null) vac =new boolean(true);
            return vac;
        }

        public void setVisActive(boolean visact) {
            this.vac = visact;
        }
        
    }
    
    public class animRateFromENd {
        
        int id;
        int frameRate;
        boolean startendEn;
        int start;
        int end;
        
        public animRateFromENd(int id, int frameRate, boolean startendEn, int start, int end) {
            this.id = id;
            this.frameRate = frameRate;
            this.startendEn = startendEn;
            this.start = start;
            this.end = end;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public int getFrameRate() {
            return frameRate;
        }
        
        public void setFrameRate(int frameRate) {
            this.frameRate = frameRate;
        }
        
        public boolean isStartendEn() {
            return startendEn;
        }
        
        public void setStartendEn(boolean startendEn) {
            this.startendEn = startendEn;
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
        
    }
    
    public DatabaseMain() {
        captureDim = new int[4];
        Pic01 = "pictures\\shayanRanjbarTest.png";
        name = "name";
        text01 = "1";
        timer0Direction = false;
    }
    
    public int getCaptureDim(int index) {
        return captureDim[index];
    }
    
    public int[] getCaptureDim() {
        return captureDim;
    }
    
    public void setCaptureDim(int index, int captureDim) {
        this.captureDim[index] = captureDim;
    }
    
    public String getPic01() {
        return Pic01;
    }
    
    public void setPic01(String Pic01) {
        this.Pic01 = Pic01;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTime() {
        return time;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public String getText01() {
        return text01;
    }
    
    public void setText01(String text01) {
        this.text01 = text01;
    }
    
    public int getFramecounter() {
        return framecounter;
    }
    
    public void setFramecounter(int framecounter) {
        this.framecounter = framecounter;
    }
    
    public int getToTime1() {
        return toTime1;
    }
    
    public void setToTime1(int toTime1) {
        this.toTime1 = toTime1;
    }
    
    public int getToTime2() {
        return toTime2;
    }
    
    public void setToTime2(int toTime2) {
        this.toTime2 = toTime2;
    }
    
    public boolean isTimer0Direction() {
        return timer0Direction;
    }
    
    public void setTimer0Direction(boolean timer0Direction) {
        this.timer0Direction = timer0Direction;
    }
    
    public int getTimeREset1() {
        return timeREset1;
    }
    
    public void setTimeREset1(int timeREset) {
        this.timeREset1 = timeREset;
    }
    
    public int getTimeREset2() {
        return timeREset2;
    }
    
    public void setTimeREset2(int timeREset2) {
        this.timeREset2 = timeREset2;
    }
    
    public List<Settingshowgroups> getVisanims() {
        checkSettingshowgroups();
        return visanims;
    }
    
    public Settingshowgroups getVisanims(int index) {
        checkSettingshowgroups();
        if (index > this.visanims.size()) {
            JOptionPane.showInternalMessageDialog(null, "Error in saving in  databsee didn't added");
            return new Settingshowgroups("0-Zero");
        } else {
            return visanims.get(index);
        }
        
    }
    
    public void setVisanims(int index, Settingshowgroups visanims) {
        checkSettingshowgroups();
        if (index > this.visanims.size()) {
            JOptionPane.showInternalMessageDialog(null, "Error in saving in  databsee didn't added");
        } else {
            this.visanims.set(index, visanims);
        }
    }
    
    public void addVisanims(Settingshowgroups visanims) {
        checkSettingshowgroups();
        this.visanims.add(visanims);
    }
    
    public void addVisanims(String st) {
        checkSettingshowgroups();
        this.visanims.add(new Settingshowgroups(st));
    }
    
    private void checkSettingshowgroups() {
        if (visanims== null) {
            visanims = new LinkedList<Settingshowgroups>();
        }
    }
    
    public int getLastvisanimsIndex() {
        return lastvisanimsIndex;
    }
    
    public void setLastvisanimsIndex(int lastvisanimsIndex) {
        this.lastvisanimsIndex = lastvisanimsIndex;
    }

    public Settingshowgroups getSettingshowgroupsClipboard() {
        if(SettingshowgroupsClipboard==null)SettingshowgroupsClipboard = new Settingshowgroups("copy");
        return SettingshowgroupsClipboard;
    }

    public void setSettingshowgroupsClipboard(Settingshowgroups SettingshowgroupsClipboard) {
        this.SettingshowgroupsClipboard = SettingshowgroupsClipboard;
    }
    
}
