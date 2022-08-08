package practiceprojects;
import java.util.Scanner;
public class Mailvalidation {
	
	    static String [] EmployeeEmailID= {"xyz00@gmail.com","mnp11@yahoo.com","abz123@gmail.com","ice456@gmail.com"};

		public static void main(String[] args) 
		{
	        @SuppressWarnings("resource")
			Scanner user= new Scanner(System.in);
	        String mailId;
			while (true)
			{
		     System.out.println("**Please Enter your EMAIL ID**");
		     mailId = user.next();
		     VerfiyID(mailId);
		     
		     }
		}
		private static void VerfiyID(String ID)
		{
			boolean accessFlag= false;
		     for(String id : EmployeeEmailID)
		     {
		    	 if(ID.equalsIgnoreCase(id))
		    	 {
		    		 accessFlag=true;
			    	 System.out.println("Validated E-Mail ");
			    	 System.out.println("");
		    		 break;
		    	 }   	 
		     
		     if(accessFlag==false)
		     {
		    	 System.out.println("Invalid E-Mail");
		     }	
		     }
		    
		
		}
}
		
	


