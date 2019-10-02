public class multiplethreads extends Thread {
    private Thread thread;
    private String message;
    multiplethreads(String name){
        this.message=name;
        System.out.println("Creating "+this.message);
    }
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread" + this.message + i);
            }
            System.out.println("Thread " + this.message + " exiting");
        }catch (InterruptedException e){
            System.out.println();
        }
    }
    public void start(){
        System.out.println("Thread starting: " + this.message);
        this.thread=new Thread(this, this.message);
        this.thread.start();
    }
}
