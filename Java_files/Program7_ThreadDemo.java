class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Program7_ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
