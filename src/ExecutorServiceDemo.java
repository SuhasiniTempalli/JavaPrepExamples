import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Runnable runnable=()->{
            System.out.println("Inside thread task" +Thread.currentThread().getName());
        };
        executorService.submit(runnable);
    }
}
