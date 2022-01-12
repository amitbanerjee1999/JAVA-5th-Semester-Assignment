class MyThread extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("Child100 Thread");
		}
	}
}


class main3{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setPriority(3);
		MyThread t2 = new MyThread();
		t2.setPriority(7);
		MyThread t3 = new MyThread();
		t3.setPriority(6);
		MyThread t4 = new MyThread();
		t4.setPriority(4);
		MyThread t5 = new MyThread();
		t5.setPriority(5);
		
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