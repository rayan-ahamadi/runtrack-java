package jour04.job02;

public class MyThread {
    public static void main(String[] args){
        job02 classThread = new job02();
        Thread thread = new Thread(classThread);
        thread.start();
    }
}
