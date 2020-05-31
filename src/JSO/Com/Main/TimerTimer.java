package JSO.Com.Main;


/**
 *
 * @author BMW
 */
public class TimerTimer extends TimeCounter {
    
    private TimerUser  timer_user;

    public TimerTimer(TimerUser timer_user,int min,int seconds) {
        super(min, seconds, 0, 0 );
        this.timer_user = timer_user;
    }
     public TimerTimer(TimerUser timer_user,int minStart,int secStart,int minend,int secend) {
        super(minStart, secStart, minend, secend );
        this.timer_user = timer_user;
    }

    @Override
    public void runable() {
          timer_user.updatetime(getTime());
//          timer_user.updatetime(getMinute(), getSecond());
//          System.out.println("timer :"+getSecond());
    }

    @Override
    public void rundisable() {
//       timer_user.stopTime();
    }

    public void stopwork() {
        setActive(false);
    }

    
    
   

  
}
