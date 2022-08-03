package practiceprojects;


	public class Practiceproject11 extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Practiceproject11 mt = new  Practiceproject11();
	  		mt.start();
	 	}
	


}
