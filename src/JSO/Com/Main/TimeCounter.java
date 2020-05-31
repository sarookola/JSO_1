package JSO.Com.Main;

import java.util.Date;

/**
 *
 * @author BMW
 */
public abstract class TimeCounter extends Thread {

    private int step;
    private int counter;
    private int stop;
    private int wait = 100;
    long time;
    private boolean waitTimeAbselute = false;
    boolean active = true, live = true;

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setWaitTimeAbselute(boolean waitTimeAbselute) {
        this.waitTimeAbselute = waitTimeAbselute;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public TimeCounter(int fromMinute, int fromSecond, int untilMinute, int untilSecond) {
        counter = fromMinute * 60 + fromSecond;

        stop = untilMinute * 60 + untilSecond;

        if (counter > stop) {
            step = -1;
        } else {
            step = 1;
        }
        live = true;
    }
    long diffrenceTime;

    @Override
    public synchronized void run() {
        long fromTime;
        long milsec24 = 0, milsec = 0;
        fromTime = new Date().getTime();

        while (live) {
            if (counter == stop) {
                active = false;
                rundisable();
            } else {
                time = new Date().getTime();
                diffrenceTime = new Date().getTime() - fromTime;

                try {
                    if (waitTimeAbselute) {
                        wait(wait);
                    } else {
                        wait(wait - (diffrenceTime - milsec));
                    }

                } catch (Exception e) {
                }

                if (diffrenceTime >= milsec + 1000) {
                    milsec += 1000;
                    counter += step;
                }
                if (active) {
                    runable();
                }
            }
        }

    }

//    public int getSecond() {
//        return (counter % 60);
//    }
//
//    public int getMinute() {
//        return counter / 60;
//    }

    long getTime() {
        return time;
    }

    
    public void changetimertime(int fromMinute, int fromSecond) {
        counter = fromMinute * 60 + fromSecond;

        runable();
    }

    public void timegetTotime(int untilMinute, int untilSecond) {

        int stop = untilMinute * 60 + untilSecond;
//        if (counter > this.stop &  this.stop>stop) {
//           this.stop=stop;
//        } else if(counter < this.stop &  this.stop<stop) {
        this.stop = stop;
//        }
    }

    public abstract void runable();

    public abstract void rundisable();

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

}
