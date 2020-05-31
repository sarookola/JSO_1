/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Render.animator;

import static java.lang.System.currentTimeMillis;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shayan
 */
public class AnimPlayer extends  Thread implements Runnable {

    int frameduration,framedurationMain;
    long frame;
    int lastframe;
    long time = 0;
    AnimatorJpanel animatorJpanel;
    boolean loop;
    long sleep =20;
    int id =0 ;
    long lasttime ;

    public void setTime() {
//        this.time = new Date().getTime();
        time = System.currentTimeMillis();
        frame = 0;

    }

    /**
     *
     * @param panel
     * @param sleeptime
     */
    public AnimPlayer(int frameduration, AnimatorJpanel animatorJpanel) {
        this.animatorJpanel = animatorJpanel;
        this.frameduration = frameduration;
         this.framedurationMain =40;
        setTime();
        lastframe = 9999999;
        loop = true;
          id =0 ;
          
    }
     public AnimPlayer(int frameduration,int framedurationMain, AnimatorJpanel animatorJpanel) {
        this.animatorJpanel = animatorJpanel;
        this.frameduration = frameduration;
        this.framedurationMain = framedurationMain;
        setTime();
        lastframe = 9999999;
        loop = true;
        id =0 ;
    }
      public AnimPlayer(int id ,int frameduration,int framedurationMain, AnimatorJpanel animatorJpanel) {
        this.animatorJpanel = animatorJpanel;
        this.frameduration = frameduration;
        this.framedurationMain = framedurationMain;
        setTime();
        lastframe = 9999999;
        loop = true;
        this.id=id;
    }

    public void resett() {
        frame = frame % 100000;
    }

    @Override
    public final synchronized void run() {
        long i = 0;
        long temp = 0;
        while (true) {

            i = System.currentTimeMillis();
            temp = ((i - time));
//            System.out.println("i="+i+"frame="+frame);
            if (temp >= frame + frameduration) {
                frame = frame + frameduration;
//                long x= new Date().getTime()-lasttime;
                
//               if(id==1 && x>5) {System.out.print("animator did in "+x +" at frame"+frame /framedurationMain);}
//               lasttime=lasttime+x;
//         animatorJpanel.check();
                animatorJpanel.animate(frame /framedurationMain);
//                System.out.println("time for animate"+ (new Date().getTime()-lasttime));
                try {
                    this.wait(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
//                i += sleep - System.currentTimeMillis();
//                if (i > 0) {
                try {
//                    System.out.println("sleep"+(frameduration - (temp - frame)));
                    this.wait(frameduration - (temp - frame));
                } catch (Exception ex) {
                    Logger.getLogger(AnimPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public long getSleep() {
        return sleep;
    }

    public void setSleep(long sleep) {
        this.sleep = sleep;
    }

}
