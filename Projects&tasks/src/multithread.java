

class threadone extends Thread { //here using extends Threads only we can use thread methods
	
	 public void run(){
		 for(int i=0;i<5;i++){
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 System.out.println("this is runnabale method" +i);
		 }
	}
}
public class multithread {

	public static void main(String[] args) throws InterruptedException {
        threadone t = new threadone();
       t.start();// start method is only  do the whats under the statement 
      System.out.println (t.getId());
      System.out.println(t.getName());
      System.out.println(t.getPriority());
      System.out.println(t.isAlive());
      System.out.println(t.getState());
      System.out.println(t.interrupted());
     
       Thread.sleep(20);
       t.stop();
	}

}
