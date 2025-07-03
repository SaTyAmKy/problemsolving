class MyThread1 extends Thread{
	public void run(){
		int i = 0;
		while(i < 40) {
			System.out.println("My cooking thread is running.");
			System.out.println("I am happy.");
			i++;
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		int i = 0;
		while(i < 40) {
			System.out.println("he is chatting with her.");
			System.out.println("i love her");
			i++;
		}
	}
}
public class Multitasking {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		
	}

}
