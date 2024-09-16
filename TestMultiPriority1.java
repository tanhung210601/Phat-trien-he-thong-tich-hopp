public class TestMultiPriority1 extends Thread{
 
    public void run() {
        System.out.println("Running thread name is: "+Thread.currentThread().getName());
        System.out.println("Running thread name is: "+Thread.currentThread().getPriority());

    }
    public static void main(String[] args) {
        TestMultiPriority1 t1 = new TestMultiPriority1();
        TestMultiPriority1 t2 = new TestMultiPriority1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
