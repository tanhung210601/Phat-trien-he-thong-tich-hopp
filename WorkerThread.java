import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String message)
    {
        this.message=message;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() 
                + " (Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() 
                + " (End)");
    }
 
    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    
            // tạo một pool chứa 5 threads
            ExecutorService executor = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 10; i++) {
                Runnable worker = new WorkerThread("" + i);
                // call phương thức execute của ExecutorService
                executor.execute(worker);
            }
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
     
            System.out.println("Finished all threads");
        
    }
}

    

