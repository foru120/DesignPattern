package subsysterm;

import subsysterm.facade.Microwave;

import java.util.Timer;
import java.util.TimerTask;

public class TimerChecker implements Switch {
    public static long TIME_INTERVAL = 1000;
    public final int EXPIRED_TIME;
    private int count;
    private Microwave microwave;
    private Timer timer = new Timer();
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            if (count > 0) {
                System.out.println("Timer.. " + count-- + " 초");
            } else {
                System.out.println("조리가 완료되었습니다.");

                timer.cancel();
                microwave.off();
            }
        }
    };

    public TimerChecker(int EXPIRED_TIME, Microwave microwave) {
        this.EXPIRED_TIME = EXPIRED_TIME;
        this.count = (int) (EXPIRED_TIME / TIME_INTERVAL);
        this.microwave = microwave;
    }

    @Override
    public void on() {
        timer.schedule(task, 0, TIME_INTERVAL);
    }

    @Override
    public void off() {
        timer.cancel();
    }
}
