class MyRunnable implements Runnable{
	public MyRunnable(){
		System.out.println("Thread wants to Start");
	}
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName());
		}
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){
			System.out.println("InterruptedException Caught");
		}
	}
}

class main2{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
	}
}
/*
public class MyRunnable implements Runnable{
    public MyRunnable(){
        System.out.println("Start Up");
    }
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                System.out.println("Interrupted exception caught");
            }
        }
    }
}
class Main1{
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

}*/