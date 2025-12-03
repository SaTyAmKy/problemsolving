package coreJva;
class Counter{
	int count = 0;
	public void increament(){
		count++;
	}
}
public class RaceCondition {
	public static void main(String[] args) throws InterruptedException{
		Counter c = new Counter();
		Thread t1 = new Thread(() -> {for(int i = 1;i <1000;i++)c.increament();});
		Thread t2 = new Thread(() -> {for(int i = 1;i <1000;i++)c.increament();});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);
		
		
	}

}
