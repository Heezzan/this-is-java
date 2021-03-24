package ch12_multi_thread;

public class WorkThread extends Thread {

    public WorkThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName()+ " interrupted");
                break;
            }
        }
        System.out.println(getName()+" 종료됨");
    }
}
