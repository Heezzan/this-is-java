package ch12_multi_thread;

public class TargetThread extends Thread {
    public void run() {
        // RUNNABLE 상태
        for (long i = 0; i < 1000000000; i++) {}
        
        // TIMED_WAITING 상태
        try {
            Thread.sleep(1500);
        } catch (Exception e) {}
        
        // RUNNABLE 상태
        for (long i = 0; i < 1000000000; i++) {}
    }
    
}
