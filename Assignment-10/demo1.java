/*class MyThread extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("Child5 Thread");
		}
	}
}*/
class demo1{
	public static void main(String[] args){
		
		
		MyThread t = new MyThread();
		MyThread t1 = new MyThread();
		t1.setPriority(10);
		t.setPriority(7);
		t.start();
		t1.start();
		
		for(int i=0;i<3;i++){
			System.out.println("Main Thread");
		}
	}
}