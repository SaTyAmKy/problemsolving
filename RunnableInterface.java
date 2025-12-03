package coreJva;
class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Task is running.");
		
	}
	
}
public class RunnableInterface {
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread t = new Thread(task);
		t.start();
	}

}
