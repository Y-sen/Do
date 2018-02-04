package producAndconsumer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourse sourse = new Sourse();
		Runnable p = new Product(sourse);
		Consumer c = new Consumer(sourse);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
