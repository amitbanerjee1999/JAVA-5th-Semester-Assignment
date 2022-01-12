class MyThread extends Thread{
	public MyThread(){
		System.out.println("Thread wants to Start");
	}
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(currentThread().getName());
		}
		try{
			sleep(2000);
		}catch(InterruptedException ie){
			System.out.println("InterruptedException Caught");
		}
	}
}

class main1{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
	}
}