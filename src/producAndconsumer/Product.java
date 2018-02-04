package producAndconsumer;

public class Product implements Runnable{

	
	Sourse sourse;
	public Product(Sourse sourse){
		this.sourse = sourse;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(sourse){
				if(sourse.count<50){
					synchronized(sourse){
						sourse.make();
						sourse.notifyAll();
						
						System.out.println("product the number is: "+sourse.count);
					}
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
	
		/*while(true){
			if(sourse.count<10){
				synchronized(sourse){
					sourse.make();
				}
			}else{
				try {
					sourse.wait();
					sourse.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sourse.notifyAll();
			}
		}
		*/
		
	

}
