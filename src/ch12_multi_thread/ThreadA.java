package ch12_multi_thread;

public class ThreadA extends Thread {
    public ThreadA() {
        setName("ThreadA");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {}
//            System.out.println(getName() +" 가 출력한 내용");
    }
}
