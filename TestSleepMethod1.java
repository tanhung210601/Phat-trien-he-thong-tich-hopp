public class TestSleepMethod1 extends Thread{

    public void run() {
       for(int i=0;i<5;i++)
       {
           try {
               sleep(2000);
           } catch (Exception e) {
               System.out.println(e);
           }
           System.out.println(i);
       }
    }
    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        t1.start();
        t1.start();
    }
    
}
