class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("Child Thread");
		}
	}
}


class main4{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);
		t1.setPriority(3);
		t2.setPriority(3);
		t3.setPriority(3);
		t4.setPriority(3);
		t5.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		for(int i=0;i<3;i++){
			System.out.println("Main Thread");
		}
	}
}