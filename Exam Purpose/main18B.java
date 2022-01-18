class MyThread extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			currentThread().setName("Child Thread");
			System.out.println(currentThread().getName());
		}
	}
}

class main18B{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		Thread.currentThread().setName("Main Thread");
		for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
	}
}