package lab8;

public class Print extends Thread {
    public void run(){
        for(int i = 1;i<=4;i++){
            System.out.println("child thread "+i);
        }
    }

    public static void main(String[] args) {
        Print m = new Print();
        m.start();

        for(int i = 1;i<=4;i++){
            System.out.println("main thread "+i);
        }
    }
}