package ch12_multi_thread;

import org.w3c.dom.ls.LSOutput;

public class ThreadNameExample {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
        
        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();
        
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + " 가 출력한 내용");
                }
            }
        };
        threadB.setName("바뀌넹");
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
        
    }
    
}
