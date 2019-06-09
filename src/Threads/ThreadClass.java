package Threads;

public class ThreadClass {
    public static void main(String[] args) {

        //SimpleThread t = new SimpleThread();
        //t.start();
        //t.run();

        SimpleThread t = new SimpleThread();
        t.start();
        SimpleThread t1 = new SimpleThread();
        t1.start();

        System.out.println("MainThread xxxxxxxxxxxxxxxxxxxxxxxx ");
        System.out.println("END!... Name: "+ Thread.currentThread().getName()+"|id: " + Thread.currentThread().getId());

    }
}

class SimpleThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " from new Thread");
        }
    }
}

class MyThreadClass extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"- name: " + getName()+"| id: " + getId());
        }

        try {
            Thread.sleep(100);//showing mix up
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}