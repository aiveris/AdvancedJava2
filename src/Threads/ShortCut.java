package Threads;

public class ShortCut {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i+"-Short Cut...");
                }
            }
        }).start();

        //... now make it still shorter

    }
}
