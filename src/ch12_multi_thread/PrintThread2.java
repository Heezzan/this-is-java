package ch12_multi_thread;

public class PrintThread2 extends Thread {
    
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
                // 또는
                if (Thread.interrupted()) {
                    break;
                }
            }
        } catch (InterruptedException e) {}

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
    
}
