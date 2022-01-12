class Display{
	synchronized void wish(String name){
		for(int i=0;i<2;i++){
			System.out.println("Good Morning!!");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}
class main5{
	public static void main(String[] args){
		Display d = new Display();
		MyThread tum1 = new MyThread(d,"Amit");
		MyThread tum2 = new MyThread(d,"Anuradha");
		tum1.start();
		tum2.start();
	}
}