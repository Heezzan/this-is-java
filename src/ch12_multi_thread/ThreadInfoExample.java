package ch12_multi_thread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("threadA");
        threadA.setDaemon(true);
        threadA.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads) {
            System.out.println("Name : "+thread.getName() + (thread.isDaemon() ? " (데몬)" : " (주)"));
            System.out.println("\t" + "소속그룹: "+thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
