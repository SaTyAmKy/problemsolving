package coreJva;

import java.util.concurrent.*;


class MyTasks implements Callable<Integer>{

	public Integer call() throws Exception{
		int sum = 10+20;
		return sum;
		
	}
	
}
public class CallableDemo {
	public static void main(String[] args) throws  Exception {
		MyTasks task = new MyTasks();
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> result = service.submit(task);
		System.out.println("Result :"+result.get());
		service.shutdown();
		
	}

}
