package ch12_multi_thread;

import java.util.concurrent.*;

public class CompletionServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[작업 처리 요청]");
        for (int i = 0; i < 3; i++) {
            // 스레드 풀에게 작업 처리 요청
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 1; i <= 10; i++) {
                        sum += i;
                    }
                    return sum;
                }
            });
        }

        System.out.println("[처리 완료된 작업 확인]");
        // 스레드 풀의 스레드에서 실행하도록 함
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        // 완료된 작업 가져옴. (완료된 작업 있을때까지 블로킹하고, 완료된 작업이 있을 땐 Future 리턴)
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("[처리 결과] "+value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });

        // 3초 뒤 스레드 풀 종료
        try {Thread.sleep(3000); }
        catch (InterruptedException e) {}
        executorService.shutdownNow();
    }
}
