public class runToilet  {
    public static void main(String[] args) {
        Thread t1 = new Elev();
        Thread t2 = new Elev();
        Thread t3 = new Elev();
        Thread t4 = new Elev();
        Thread t5 = new Elev();
        Thread t6 = new Elev();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
