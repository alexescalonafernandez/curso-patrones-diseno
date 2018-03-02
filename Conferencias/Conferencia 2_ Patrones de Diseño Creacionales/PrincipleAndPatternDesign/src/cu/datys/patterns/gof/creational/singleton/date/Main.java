package cu.datys.patterns.gof.creational.singleton.date;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Singleton.getInstance().getCreationDate());

        //waiting 3 seconds for showing singleton works
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance().getCreationDate());
                timer.cancel();
            }
        }, 3000);
    }
}
