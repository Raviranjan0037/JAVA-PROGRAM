package lab8;

public class Sleep extends Thread {
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("child thread "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Child thread is interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Sleep m = new Sleep();
        m.start();

        for(int i = 1;i<=10;i++){
            System.out.println("main thread "+i);
        }
    }
}