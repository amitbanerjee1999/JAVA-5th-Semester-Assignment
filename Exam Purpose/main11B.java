class MyRunnable implements Runnable{
	public MyRunnable(){
		System.out.println("Thread wants to Start");
	}
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class main11B{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
	}
}