public class TestMultiNaming2 extends Thread{
   
    public void run() {
        for(int i=0;i<5;i++)
        {   
            try {
                sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName());
        }
       
    }
    public static void main(String[] args) {
        TestMultiNaming2 t1 = new TestMultiNaming2();
        TestMultiNaming2 t2 = new TestMultiNaming2();
        t1.start();
        t2.start();
    }
    
}
