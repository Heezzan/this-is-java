package ch12_multi_thread;

public class StatePrintThread extends Thread {
    private Thread targetThread;

    // targetThread = 상태를 조사할 스레드
    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    public void run() {
        while(true) {
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드 상태 : " +state);

            if (state == Thread.State.NEW) {
                // start 한다고 바로 시작되는 거 아님! 실행 대기 상태로 만들어 주는 것!
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
