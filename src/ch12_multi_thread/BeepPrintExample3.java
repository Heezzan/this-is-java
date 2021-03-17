package ch12_multi_thread;

import java.awt.*;

public class BeepPrintExample3 {

    public static void main(String[] args) {
        // 방법 1
        Thread thread = new BeepThread();
        thread.start();

        // 방법 2
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try { Thread.sleep(1000); } catch (Exception e) {}
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
