public class Elev extends Thread{

    public void run(){
        synchronized (Toilet.tLock) {
            System.out.println(Thread.currentThread().getName());
            Toilet.pee();
        }
    }
}
