package jour04.job01;

public class ThreadProject {
    public static void main(String[] args){
        MyThread classThread = new MyThread();
        Thread thread = new Thread(classThread);
        thread.start();
    }
}
