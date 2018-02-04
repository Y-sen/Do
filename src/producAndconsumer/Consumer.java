package producAndconsumer;

public class Consumer implements Runnable {
	
	Sourse sourse;
	public  Consumer(Sourse sourse){
		this.sourse = sourse;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(sourse){
				if(sourse.count>0){
					
						sourse.sell();
						System.out.println(Thread.currentThread().getName()+"consum the number is: "+sourse.count);
						sourse.notifyAll();
					
				}else{
					try {
						sourse.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	
}
